/**
 * 项目名称：quickstart-webservice-resteasy 
 * 文件名：HelloWorldApplication.java
 * 版本信息：
 * 日期：2018年11月5日
 * Copyright yangzl Corporation 2018
 * 版权所有 *
 */
package org.quickstart.webservice.resteasy;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

/**
 * HelloWorldApplication
 * 
 * @author：youngzil@163.com
 * @2018年11月5日 下午4:56:07
 * @since 1.0
 */
@ApplicationPath("rest")
public class HelloWorldApplication extends Application {

    public HelloWorldApplication() {}

    @Override
    public Set<Object> getSingletons() {
        HashSet<Object> set = new HashSet<Object>();
        return set;
    }

    // @ApplicationPath: defines the URL of the requests to be processed by RESTEasy classes. In our example, all requests which are prefixed by /rest/* are processed by our service.
    // getSingletons(): this method returns a set of resources to be loaded on the startup of the application, if you want your application to load all RESTEasy resources then return an empty set as
    // above.

}
