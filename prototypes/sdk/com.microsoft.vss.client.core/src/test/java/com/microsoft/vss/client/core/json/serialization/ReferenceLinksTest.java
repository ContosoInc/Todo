package com.microsoft.vss.client.core.json.serialization;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import junit.framework.TestCase;

import org.junit.Test;

import com.microsoft.visualstudio.services.webapi.model.ReferenceLink;
import com.microsoft.visualstudio.services.webapi.model.ReferenceLinks;
import com.microsoft.vss.client.core.TestUtil;
import com.microsoft.vss.client.core.entitytypes.EntityWithReferenceLinks;

public class ReferenceLinksTest
    extends TestCase {

    @Test
    public void testReferenceLinksDeserialization1()
        throws IOException {
        final ReferenceLinks rl = new ReferenceLinks();

        final Map<String, Object> linkValues = new HashMap<String, Object>();
        ReferenceLink link = new ReferenceLink();
        link.setHref("http://a.b.com"); //$NON-NLS-1$
        linkValues.put("self", link); //$NON-NLS-1$

        rl.setLinks(linkValues);

        final EntityWithReferenceLinks e1 = new EntityWithReferenceLinks();
        e1.setFieldA(1);
        e1.setLinks(rl);

        final String s = TestUtil.toJsonString(e1);

        Object e2 = TestUtil.fromJsonString(s, EntityWithReferenceLinks.class);

        assertTrue("Returned type is EntityWithReferenceLinks", e2 instanceof EntityWithReferenceLinks); //$NON-NLS-1$
        assertEquals("Submitted and returned values", e1, e2); //$NON-NLS-1$
    }

    @Test
    public void testReferenceLinksDeserialization2()
        throws IOException {

        List<ReferenceLink> links = new ArrayList<ReferenceLink>();

        ReferenceLink link1 = new ReferenceLink();
        link1.setHref("http://a.b.com"); //$NON-NLS-1$
        links.add(link1);

        ReferenceLink link2 = new ReferenceLink();
        link2.setHref("http://x.y.com"); //$NON-NLS-1$
        links.add(link2);

        final Map<String, Object> linkValues = new HashMap<String, Object>();
        linkValues.put("self", links); //$NON-NLS-1$

        final ReferenceLinks rl = new ReferenceLinks();
        rl.setLinks(linkValues);

        final EntityWithReferenceLinks e1 = new EntityWithReferenceLinks();
        e1.setFieldA(1);
        e1.setLinks(rl);

        final String s = TestUtil.toJsonString(e1);

        Object e2 = TestUtil.fromJsonString(s, EntityWithReferenceLinks.class);

        assertTrue("Returned type is EntityWithReferenceLinks", e2 instanceof EntityWithReferenceLinks); //$NON-NLS-1$
        assertEquals("Submitted and returned values", e1, e2); //$NON-NLS-1$
    }
}
