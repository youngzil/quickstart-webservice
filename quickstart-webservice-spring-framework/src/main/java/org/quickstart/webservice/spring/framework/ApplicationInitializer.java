/**
 * 项目名称：quickstart-webservice-spring-framework 
 * 文件名：ApplicationInitializer.java
 * 版本信息：
 * 日期：2018年11月5日
 * Copyright asiainfo Corporation 2018
 * 版权所有 *
 */
package org.quickstart.webservice.spring.framework;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * ApplicationInitializer
 * 
 * @author：yangzl@asiainfo.com
 * @2018年11月5日 下午7:36:53
 * @since 1.0
 */
public class ApplicationInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[] {ApplicationConfiguration.class};
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return null;
    }

    @Override
    protected String[] getServletMappings() {
        return new String[] {"/rest/*"};
    }
}
