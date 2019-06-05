/**
 * 项目名称：quickstart-webservice-jersey 
 * 文件名：UserInfo.java
 * 版本信息：
 * 日期：2018年11月5日
 * Copyright yangzl Corporation 2018
 * 版权所有 *
 */
package org.quickstart.webservice.jersey;

/**
 * UserInfo 
 *  
 * @author：youngzil@163.com
 * @2018年11月5日 上午11:11:28 
 * @since 1.0
 */
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

// 这里@Path定义了类的层次路径。
// 指定了资源类提供服务的URI路径。
@Path("UserInfoService")
public class UserInfo {

    // http://localhost:8080/quickstart-webservice-jersey/rest/UserInfoService/name/Pavithra

    // @GET表示方法会处理HTTP GET请求
    @GET
    // 这里@Path定义了类的层次路径。指定了资源类提供服务的URI路径。
    @Path("/name/{i}")
    // @Produces定义了资源类方法会生成的媒体类型。
    @Produces(MediaType.TEXT_XML)
    // @PathParam向@Path定义的表达式注入URI参数值。
    public String userName(@PathParam("i") String i) {
        String name = i;
        return "<User>" + "<Name>" + name + "</Name>" + "</User>";
    }

    @GET
    @Path("/age/{j}")
    @Produces(MediaType.TEXT_XML)
    public String userAge(@PathParam("j") int j) {
        int age = j;
        return "<User>" + "<Age>" + age + "</Age>" + "</User>";
    }
}
