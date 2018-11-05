package org.quickstart.webservice.wink;

/**
 * A simple link builder class, useful for 
 * creating the <link> element in the response.
 * 
 * @author Gabriel Mateescu gabriel@vt.edu
 */

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@XmlRootElement(name = "link")
@XmlAccessorType(XmlAccessType.FIELD)
public class Link {

    @XmlAttribute
    String href = null;

    @XmlAttribute
    String rel = "self";

    public Link() {}

    public Link(String uri) {
        this.href = uri;
    }

    public Link(String href, String rel) {
        this.href = href;
        this.rel = rel;
    }
}
