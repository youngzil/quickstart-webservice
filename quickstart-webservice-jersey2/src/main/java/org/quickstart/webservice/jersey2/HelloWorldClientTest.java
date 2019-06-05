/**
 * 项目名称：quickstart-webservice-jersey2 
 * 文件名：HelloWorldClientTest.java
 * 版本信息：
 * 日期：2018年11月5日
 * Copyright yangzl Corporation 2018
 * 版权所有 *
 */
package org.quickstart.webservice.jersey2;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

/**
 * HelloWorldClientTest
 * 
 * @author：youngzil@163.com
 * @2018年11月5日 下午3:16:42
 * @since 1.0
 */
public class HelloWorldClientTest {

    public static void main(String[] args) {
        Client client = ClientBuilder.newClient();
        WebTarget webTarget = client.target("http://localhost:8080/quickstart-webservice-jersey2");
        WebTarget employeeWebTarget = webTarget.path("/rest/hello/peter");

        Invocation.Builder invocationBuilder = employeeWebTarget.request(MediaType.TEXT_PLAIN);

        String response = invocationBuilder.accept(MediaType.TEXT_PLAIN).get(String.class);
        System.out.println(response);

        // Response response = invocationBuilder.get(responseType);
        // Response response2 = invocationBuilder.post(Entity.entity(employee, MediaType.APPLICATION_JSON);

    }

}
