package com.microsoft.vss.client.core.model;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.microsoft.vss.client.core.utils.StringUtil;

public class WrappedException {
    private WrappedException innerException;
    private String message;
    private String helpLink;
    private Class<?> type;
    private String typeName;
    private String typeKey;
    private int errorCode;
    private int eventId;
    private String stackTrace;

    public WrappedException() {}

    public WrappedException(final Throwable exception, final boolean includeErrorDetail) {
        this.type = exception.getClass();

        if (exception.getCause() != null) {
            this.innerException = new WrappedException(exception.getCause(), includeErrorDetail);
        }

        this.message = exception.getMessage();

        if (includeErrorDetail) {
            this.stackTrace = exception.getStackTrace().toString();
        }

        if (exception instanceof VssException) {
            this.eventId = ((VssException) exception).getEventId();
            this.errorCode = ((VssException) exception).getErrorCode();
        }
    }

    /**
     * Getter for inner exception
     * @return WrappedException
     */
    public WrappedException getInnerException() {
        return innerException;
    }

    /**
     * Setter for inner exception
     * @param innerException
     */
    public void setInnerException(final WrappedException innerException) {
        this.innerException = innerException;
    }

    /**
     * Getter for exception message
     * @return String
     */
    public String getMessage() {
        return message;
    }

    /**
     * Setter for exception message
     * @param message
     */
    public void setMessage(final String message) {
        this.message = message;
    }

    /**
     * Getter for help link
     * @return String
     */
    public String getHelpLink() {
        return helpLink;
    }

    /**
     * Setter for help link
     * @param helpLink
     */
    public void setHelpLink(final String helpLink) {
        this.helpLink = helpLink;
    }

    /**
     * Getter for exception type
     * @return
     */
    public Class<?> getType() {
        if (type == null) {
            // try to create the type from the TypeName
            if (!StringUtil.isNullOrEmpty(typeName)) {
                try {
                    setType(Class.forName(typeName));
                } catch (Exception e) {
                    // swallow failures
                }
            }
        }
        return type;
    }

    /**
     * Setter for exception type
     * @param type
     */
    public void setType(final Class<?> type) {
        this.type = type;

        if (type != null) {
            this.typeName = type.getName();
            this.typeKey = type.getSimpleName();
        }
    }

    /**
     * Getter for type name
     * @return String
     */
    public String getTypeName() {
        return typeName;
    }

    /**
     * Setter for type name
     * @param typeName
     */
    public void setTypeName(final String typeName) {
        this.typeName = typeName;
    }

    /**
     * Getter for type key
     * @return String
     */
    public String getTypeKey() {
        return typeKey;
    }

    /**
     * Setter for type key
     * @param typeKey
     */
    public void setTypeKey(final String typeKey) {
        this.typeKey = typeKey;
    }

    /**
     * Getter for error code
     * @return int
     */
    public int getErrorCode() {
        return errorCode;
    }

    /**
     * Setter for error code
     * @param errorCode
     */
    public void setErrorCode(final int errorCode) {
        this.errorCode = errorCode;
    }

    /**
     * Getter for event id
     * @return int
     */
    public int getEventId() {
        return eventId;
    }

    /**
     * Setter for event id
     * @param eventId
     */
    public void setEventId(final int eventId) {
        this.eventId = eventId;
    }

    /**
     * Getter for stack trace
     * @return String
     */
    public String getStackTrace() {
        return stackTrace;
    }

    /**
     * Setter for stack trace
     * @param stackTrace
     */
    public void setStackTrace(final String stackTrace) {
        this.stackTrace = stackTrace;
    }

    /**
     * Unwrap exception
     * @param map
     * @return Exceptions
     */
    public Exception Unwrap(final Map<String, Class<? extends Exception>> map) {
        Exception innerException = null;

        if (getInnerException() != null) {
            innerException = getInnerException().Unwrap(map);
        }

        Exception exception = null;

        final Class<?> type;
        if (!StringUtil.isNullOrEmpty(getTypeKey()) && map != null && map.containsKey(getTypeKey())) {
            // if they have bothered to map type, use that
            type = map.get(getTypeKey());
        } else {
            // no mapping, see if we can create the specified type
            type = getType();
        }

        if (type != null) {

            for (int attempt = 0; attempt < 3; attempt++) {
                try {
                    final Constructor<?> exceptionConstructor;

                    switch (attempt) {
                        case 0:
                            if ((exceptionConstructor = type.getConstructor(String.class, Exception.class)) != null) {
                                exception = (Exception) exceptionConstructor.newInstance(message, innerException);
                            }
                            break;
                        case 1:
                            if ((exceptionConstructor = type.getConstructor(String.class)) != null) {
                                exception = (Exception) exceptionConstructor.newInstance(message);
                            }
                            break;
                        case 2:
                            if ((exceptionConstructor = type.getConstructor()) != null) {
                                exception = (Exception) exceptionConstructor.newInstance();
                            }
                    }

                    if (exception != null) {
                        break;
                    }
                } catch (Exception e) {
                    // do nothing
                }
            }
        }

        if (exception instanceof VssException) {
            ((VssException) exception).setEventId(this.eventId);
            ((VssException) exception).setErrorCode(this.errorCode);
        }

        if (exception == null && !StringUtil.isNullOrEmpty(message)) {
            assert false : "Unexpected exception type: " + getTypeName(); //$NON-NLS-1$
            exception = new VssServiceException(message, innerException);
        }

        assert exception != null : "Server Exception cannot be resolved."; //$NON-NLS-1$

        if (exception != null && !StringUtil.isNullOrEmpty(getHelpLink())) {
            try {
                final Method setHelpLinkMethod = exception.getClass().getMethod("setHelpLink", String.class); //$NON-NLS-1$
                if (setHelpLinkMethod != null) {
                    setHelpLinkMethod.invoke(exception, getHelpLink());
                }
            } catch (Exception e) {
                // do nothing
            }
        }

        if (exception != null && getStackTrace() != null && getStackTrace().length() > 0) {

            final String[] lines = getStackTrace().split("\r\n"); //$NON-NLS-1$
            final List<StackTraceElement> list = new ArrayList<StackTraceElement>();

            for (final String line : lines) {
                list.add(parseTraceLine(line));
            }

            exception.setStackTrace(list.toArray(new StackTraceElement[list.size()]));
        }

        return exception;
    }

    private StackTraceElement parseTraceLine(final String line) {
        final String declaringClass;
        final String methodName;
        final String fileName;

        int lineNumber;

        String s = line.trim();
        int i;

        if (s.startsWith("at ")) { //$NON-NLS-1$
            s = s.substring(3);

            i = s.indexOf(":line "); //$NON-NLS-1$

            if (i < 0) {
                lineNumber = 0;
            } else {
                try {
                    lineNumber = Integer.parseInt(s.substring(i + 6));
                    s = s.substring(0, i);
                } catch (final Exception e) {
                    lineNumber = 0;
                }
            }

            i = s.indexOf(" in "); //$NON-NLS-1$

            if (i < 0) {
                fileName = StringUtil.EMPTY;
            } else {
                fileName = s.substring(i + 4);
                s = s.substring(0, i);
            }

            i = s.indexOf('(');

            if (i < 0) {
                declaringClass = s;
                methodName = StringUtil.EMPTY;
            } else {
                i = s.lastIndexOf('.', i);

                if (i < 0) {
                    declaringClass = s;
                    methodName = StringUtil.EMPTY;
                } else {
                    declaringClass = s.substring(0, i);
                    methodName = s.substring(i + 1);
                }
            }

            return new StackTraceElement(declaringClass, methodName, fileName, lineNumber);
        } else {
            return new StackTraceElement(s, StringUtil.EMPTY, StringUtil.EMPTY, 0);
        }
    }

}
