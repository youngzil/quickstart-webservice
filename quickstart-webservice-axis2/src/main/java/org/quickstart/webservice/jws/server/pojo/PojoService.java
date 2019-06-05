/**
 * 项目名称：quickstart-webservice-axis2 
 * 文件名：PojoService.java
 * 版本信息：
 * 日期：2018年11月3日
 * Copyright yangzl Corporation 2018
 * 版权所有 *
 */
package org.quickstart.webservice.jws.server.pojo;

/**
 * PojoService
 * 
 * @author：youngzil@163.com
 * @2018年11月3日 下午4:49:24
 * @since 1.0
 */
public class PojoService {
    public String sayHello(String name) {
        return "Hello," + name;
    }
}
