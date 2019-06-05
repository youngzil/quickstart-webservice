/**
 * 项目名称：quickstart-webservice 
 * 文件名：ClientTest.java
 * 版本信息：
 * 日期：2018年11月2日
 * Copyright yangzl Corporation 2018
 * 版权所有 *
 */
package org.quickstart.webservice.jws.client;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;

import org.quickstart.webservice.jws.server.IMyService;
import org.quickstart.webservice.jws.server.MyServiceImplService;

/**
 * ClientTest
 * 
 * @author：youngzil@163.com
 * @2018年11月2日 下午5:40:50
 * @since 1.0
 */
public class ClientTest {

    /**
     * @param args
     * @throws MalformedURLException
     */
    public static void main(String[] args) throws MalformedURLException {

        // 创建访问wsdl服务地址的url
        // String urlStr = "http://localhost:8888/ns?wsdl";
        // String urlStr = "http://localhost:8080/quickstart-webservice-web/service/MyService?wsdl";
        String urlStr = "http://localhost:8089/services/MyService?wsdl";
        URL url = new URL(urlStr);
        // 通过Qname指明服务的具体信息
        QName sname = new QName("http://server.jws.webservice.quickstart.org/", "MyServiceImplService");

        // 创建MyServiceImplService对象
        MyServiceImplService msis = new MyServiceImplService(url, sname);
        // MyServiceImplService msis = new MyServiceImplService();
        // 通过getMyServiceImplPort方法获取MyServiceImpl实例
        IMyService ms = msis.getMyServiceImplPort();
        // 使用MyServiceImpl实例，像直接调用服务端方法一样，调用Web服务，获取WebService响应数据
        int result = ms.minus(29, 11);
        System.out.println("result=" + result);

    }

}
