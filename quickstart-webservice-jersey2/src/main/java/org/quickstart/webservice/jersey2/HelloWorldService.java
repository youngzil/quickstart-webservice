/**
 * 项目名称：quickstart-webservice-jersey2 
 * 文件名：HelloWorldService.java
 * 版本信息：
 * 日期：2018年11月5日
 * Copyright yangzl Corporation 2018
 * 版权所有 *
 */
package org.quickstart.webservice.jersey2;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * HelloWorldService
 * 
 * @author：youngzil@163.com
 * @2018年11月5日 上午11:52:07
 * @since 1.0
 */

@Path("/hello")
public class HelloWorldService {

    // http://localhost:8080/quickstart-webservice-jersey2/rest/hello/{somevalue}
    // http://localhost:8080/quickstart-webservice-jersey2/rest/hello/peter
    @GET
    @Path("/{param}")
    @Produces(MediaType.TEXT_PLAIN)
    // @Produces(MediaType.APPLICATION_JSON)
    public Response getMsg(@PathParam("param") String msg) {
        String output = "Jersey2 say : " + msg;
        return Response.status(200).entity(output).build();
    }

}
