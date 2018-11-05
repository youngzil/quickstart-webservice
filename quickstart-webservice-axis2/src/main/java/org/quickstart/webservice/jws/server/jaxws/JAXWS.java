/**
 * 项目名称：quickstart-webservice-axis2 
 * 文件名：JAXWS.java
 * 版本信息：
 * 日期：2018年11月3日
 * Copyright asiainfo Corporation 2018
 * 版权所有 *
 */
package org.quickstart.webservice.jws.server.jaxws;

import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 * JAXWS
 * 
 * @author：yangzl@asiainfo.com
 * @2018年11月3日 下午4:50:16
 * @since 1.0
 */
@WebService
public interface JAXWS {
    @WebMethod
    public String sayHello(String name);
}
