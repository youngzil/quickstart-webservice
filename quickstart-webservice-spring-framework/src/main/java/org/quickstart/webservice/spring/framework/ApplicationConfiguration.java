/**
 * 项目名称：quickstart-webservice-spring-framework 
 * 文件名：ApplicationConfiguration.java
 * 版本信息：
 * 日期：2018年11月5日
 * Copyright asiainfo Corporation 2018
 * 版权所有 *
 */
package org.quickstart.webservice.spring.framework;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * ApplicationConfiguration
 * 
 * @author：yangzl@asiainfo.com
 * @2018年11月5日 下午7:36:05
 * @since 1.0
 */
@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "org.quickstart.webservice.spring.framework")
public class ApplicationConfiguration {
    
}
