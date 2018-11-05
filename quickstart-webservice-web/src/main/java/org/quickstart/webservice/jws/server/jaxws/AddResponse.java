
package org.quickstart.webservice.jws.server.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "addResponse", namespace = "http://server.jws.webservice.quickstart.org/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addResponse", namespace = "http://server.jws.webservice.quickstart.org/")
public class AddResponse {

    @XmlElement(name = "addResult", namespace = "")
    private int addResult;

    /**
     * 
     * @return returns int
     */
    public int getAddResult() {
        return this.addResult;
    }

    /**
     * 
     * @param addResult the value for the addResult property
     */
    public void setAddResult(int addResult) {
        this.addResult = addResult;
    }

}
