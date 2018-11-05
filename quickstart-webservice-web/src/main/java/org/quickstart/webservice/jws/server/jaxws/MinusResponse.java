
package org.quickstart.webservice.jws.server.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "minusResponse", namespace = "http://server.jws.webservice.quickstart.org/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "minusResponse", namespace = "http://server.jws.webservice.quickstart.org/")
public class MinusResponse {

    @XmlElement(name = "minusResult", namespace = "")
    private int minusResult;

    /**
     * 
     * @return returns int
     */
    public int getMinusResult() {
        return this.minusResult;
    }

    /**
     * 
     * @param minusResult the value for the minusResult property
     */
    public void setMinusResult(int minusResult) {
        this.minusResult = minusResult;
    }

}
