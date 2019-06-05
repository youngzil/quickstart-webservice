/**
 * 项目名称：quickstart-webservice-resteasy 
 * 文件名：HelloWorld.java
 * 版本信息：
 * 日期：2018年11月5日
 * Copyright yangzl Corporation 2018
 * 版权所有 *
 */
package org.quickstart.webservice.resteasy;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * HelloWorld
 * 
 * @author：youngzil@163.com
 * @2018年11月5日 下午4:57:32
 * @since 1.0
 */
@Path("helloWorld")
public class HelloWorld {

    // http://localhost:8080/quickstart-webservice-resteasy2/rest/helloWorld

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hello from programmer gate2!";
    }

    // @Path: defines the relative path of the resource, clients access the resource through concatenating the value of the @Path annotation with the REST mapping URI, so this resource would process
    // requests like: /rest/helloWorld
    // @GET: defines a method which processes GET requests.
    // @Produces(MediaType.TEXT_PLAIN): the meta type of the returned result, in this case it’s plain text.
}
