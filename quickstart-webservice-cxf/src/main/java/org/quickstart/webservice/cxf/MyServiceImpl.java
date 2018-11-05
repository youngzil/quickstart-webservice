/**
 * 项目名称：quickstart-webservice 
 * 文件名：MyServiceImpl.java
 * 版本信息：
 * 日期：2018年11月2日
 * Copyright asiainfo Corporation 2018
 * 版权所有 *
 */
package org.quickstart.webservice.cxf;

import javax.jws.WebService;

/**
 * MyServiceImpl
 * 
 * @author：yangzl@asiainfo.com
 * @2018年11月2日 下午4:55:46
 * @since 1.0
 */
@WebService(endpointInterface = "org.quickstart.webservice.cxf.IMyService", serviceName = "MyService")
public class MyServiceImpl implements IMyService {

    @Override
    public String sayHello(String name) {
        return "hello," + name;
    }

}
