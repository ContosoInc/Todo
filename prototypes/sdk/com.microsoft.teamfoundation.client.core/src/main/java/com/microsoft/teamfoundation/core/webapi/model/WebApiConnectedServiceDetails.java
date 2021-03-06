/*
* ---------------------------------------------------------
* Copyright(C) Microsoft Corporation. All rights reserved.
* ---------------------------------------------------------
* 
* ---------------------------------------------------------
* Generated file, DO NOT EDIT
* ---------------------------------------------------------
*
* See following wiki page for instructions on how to regenerate:
*   https://vsowiki.com/index.php?title=Rest_Client_Generation
*/

package com.microsoft.teamfoundation.core.webapi.model;


public class WebApiConnectedServiceDetails
    extends WebApiConnectedServiceRef {

    private WebApiConnectedService connectedServiceMetaData;
    private String credentialsXml;
    private String endPoint;

    public WebApiConnectedService getConnectedServiceMetaData() {
        return connectedServiceMetaData;
    }

    public void setConnectedServiceMetaData(final WebApiConnectedService connectedServiceMetaData) {
        this.connectedServiceMetaData = connectedServiceMetaData;
    }

    public String getCredentialsXml() {
        return credentialsXml;
    }

    public void setCredentialsXml(final String credentialsXml) {
        this.credentialsXml = credentialsXml;
    }

    public String getEndPoint() {
        return endPoint;
    }

    public void setEndPoint(final String endPoint) {
        this.endPoint = endPoint;
    }
}
