/**
 * 项目名称：quickstart-webservice-cxf 
 * 文件名：ServerMain.java
 * 版本信息：
 * 日期：2018年11月3日
 * Copyright yangzl Corporation 2018
 * 版权所有 *
 */
package org.quickstart.webservice.cxf;

import javax.xml.ws.Endpoint;

import org.apache.cxf.jaxws.JaxWsServerFactoryBean;

/**
 * ServerMain
 * 
 * @author：youngzil@163.com
 * @2018年11月3日 下午5:25:02
 * @since 1.0
 */
public class ServerMain {

    public static void main(String[] args) {

        IMyService impl = new MyServiceImpl();

        // 方法一或者方法二都是发布到Jetty下。在main方法中运行方法一或者方法二代码，web服务就发布成功了。

        // 方法一：使用SunJAX-WS 2中Endpoint.publish进行发布。（不需要其他配置与包）
        // 调用EndPoint的publish方法发布WebService
        // 调用Endpoint的publish方法发布web service 第一个参数为ip地址 ，第二v参数就是服务的提供者
        Endpoint.publish("http://192.168.3.3:8989/crazyit", impl);
        System.out.println("WebService发布成功了");

        // 方法二：用CXF的JaxWsServerFactoryBean类进行发布。（需要CXF相关包）
        JaxWsServerFactoryBean factoryBean = new JaxWsServerFactoryBean();
        factoryBean.setAddress("http://localhost:8080/WSCXF/helloService");
        factoryBean.setServiceClass(IMyService.class);// 接口类
        factoryBean.setServiceBean(impl);// 实现类
        factoryBean.create();
        System.out.println("WS发布成功！");

    }
}
