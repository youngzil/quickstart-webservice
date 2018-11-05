/**
 * 项目名称：quickstart-webservice-wink 
 * 文件名：HelloWorldResource.java
 * 版本信息：
 * 日期：2018年11月5日
 * Copyright asiainfo Corporation 2018
 * 版权所有 *
 */
package org.quickstart.webservice.wink;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import org.apache.wink.common.annotations.Workspace;

/**
 * HelloWorldResource
 * 
 * @author：yangzl@asiainfo.com
 * @2018年11月5日 下午3:58:13
 * @since 1.0
 */
@Workspace(workspaceTitle = "Workspace Title", collectionTitle = "Collection Title")
@Path("/helloworld")
public class HelloWorldResource {

    // http://localhost:8080/quickstart-webservice-wink/rest/helloworld
    @GET
    public String getMessage() {
        return "HelloWorld2";
    }
}
