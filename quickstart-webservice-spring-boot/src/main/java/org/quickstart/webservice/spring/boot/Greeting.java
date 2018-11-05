/**
 * 项目名称：quickstart-webservice-spring-boot 
 * 文件名：Greeting.java
 * 版本信息：
 * 日期：2018年11月5日
 * Copyright asiainfo Corporation 2018
 * 版权所有 *
 */
package org.quickstart.webservice.spring.boot;

/**
 * Greeting 
 *  
 * @author：yangzl@asiainfo.com
 * @2018年11月5日 下午7:03:02 
 * @since 1.0
 */
public class Greeting {

    private final long id;
    private final String content;

    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
