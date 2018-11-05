
package org.quickstart.webservice.jws.server.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "minus", namespace = "http://server.jws.webservice.quickstart.org/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "minus", namespace = "http://server.jws.webservice.quickstart.org/", propOrder = {"a", "b"})
public class Minus {

    @XmlElement(name = "a", namespace = "")
    private int a;
    @XmlElement(name = "b", namespace = "")
    private int b;

    /**
     * 
     * @return returns int
     */
    public int getA() {
        return this.a;
    }

    /**
     * 
     * @param a the value for the a property
     */
    public void setA(int a) {
        this.a = a;
    }

    /**
     * 
     * @return returns int
     */
    public int getB() {
        return this.b;
    }

    /**
     * 
     * @param b the value for the b property
     */
    public void setB(int b) {
        this.b = b;
    }

}
