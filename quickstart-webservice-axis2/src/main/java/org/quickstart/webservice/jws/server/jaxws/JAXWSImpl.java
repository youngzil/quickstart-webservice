/**
 * 项目名称：quickstart-webservice-axis2 
 * 文件名：JAXWSImpl.java
 * 版本信息：
 * 日期：2018年11月3日
 * Copyright yangzl Corporation 2018
 * 版权所有 *
 */
package org.quickstart.webservice.jws.server.jaxws;

import javax.jws.WebService;

/**
 * JAXWSImpl
 * 
 * @author：youngzil@163.com
 * @2018年11月3日 下午4:50:34
 * @since 1.0
 */
@WebService(endpointInterface = "org.quickstart.webservice.jws.server.jaxws.JAXWS", serviceName = "JaxWS")
public class JAXWSImpl implements JAXWS {

    @Override
    public String sayHello(String name) {
        return "Hello," + name;
    }

}
