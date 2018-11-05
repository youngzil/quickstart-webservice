
package org.quickstart.webservice.jws.server.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "loginResponse", namespace = "http://server.jws.webservice.quickstart.org/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "loginResponse", namespace = "http://server.jws.webservice.quickstart.org/")
public class LoginResponse {

    @XmlElement(name = "loginUser", namespace = "")
    private org.quickstart.webservice.jws.server.User loginUser;

    /**
     * 
     * @return returns User
     */
    public org.quickstart.webservice.jws.server.User getLoginUser() {
        return this.loginUser;
    }

    /**
     * 
     * @param loginUser the value for the loginUser property
     */
    public void setLoginUser(org.quickstart.webservice.jws.server.User loginUser) {
        this.loginUser = loginUser;
    }

}
