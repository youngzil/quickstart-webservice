/**
 * 项目名称：quickstart-webservice-cxf 
 * 文件名：ClientMain.java
 * 版本信息：
 * 日期：2018年11月3日
 * Copyright asiainfo Corporation 2018
 * 版权所有 *
 */
package org.quickstart.webservice.cxf;

import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.apache.cxf.jaxws.endpoint.dynamic.JaxWsDynamicClientFactory;

/**
 * ClientMain
 * 
 * @author：yangzl@asiainfo.com
 * @2018年11月3日 下午5:27:07
 * @since 1.0
 */
public class ClientMain {

    public static void main(String[] args) throws Exception {
        IMyService hw = new MyServiceImpl();
        // IMyService helloWorld = hw.getHelloWorldWsPort();
        // System.out.println(helloWorld.sayHello("HelloWorld"));

        // 方法一：使用标准的JAX-WS的API完成客户端调用（不需要导入任何CXF包）
        // 注意。此处http://service.jaxb.com/来源于wsdl文件中targetNamespace
        QName qName = new QName("http://service.jaxb.com/", "HelloServiceImplService");
        URL url = new URL("http://localhost:8080/WSCXF/helloService?wsdl");
        // MyServiceImplService helloServiceImplService =new MyServiceImplService(url,qName);
        // IMyService helloService =(IMyService)helloServiceImplService.getPort(IMyService.class);

        // Ø 方法二：使用CXF中JaxWsProxyFactoryBean客户端代理工厂调用web服务（需要导入CXF相关包）
        JaxWsProxyFactoryBean soapFactoryBean = new JaxWsProxyFactoryBean();
        soapFactoryBean.setAddress("http://localhost:8080/WSCXF/helloService");
        soapFactoryBean.setServiceClass(IMyService.class);
        Object o = soapFactoryBean.create();
        IMyService helloService = (IMyService) o;
        helloService.sayHello("Peter");

        // Ø 方法三：
        String endPointAddress = "http:// localhost:8080/WSCXF/helloService";
        Service service = Service.create(new QName("http://service.jaxb.com/", "IHelloService"));
        // service.addPort(new QName("http://service.jaxb.com/","IHelloServicePort"),SOAPBinding.SOAP11HTTP_BINDING, endPointAddress);
        IMyService helloService2 = service.getPort(IMyService.class);

        // Ø 方法四：（需要导入CXF相关包）
        JaxWsDynamicClientFactory dcf = JaxWsDynamicClientFactory.newInstance();
        org.apache.cxf.endpoint.Client client = dcf.createClient("http://127.0.0.1:8080/WSCXF/helloService?wsdl");
        // sayHello 为接口中定义的方法名称 张三为传递的参数 返回一个Object数组
        Object[] objects = client.invoke("sayHello", "张三");
        // 输出调用结果
        System.out.println(objects[0].toString());

    }

}
