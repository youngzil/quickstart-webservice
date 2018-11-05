/**
 * 项目名称：quickstart-webservice 
 * 文件名：IMyService.java
 * 版本信息：
 * 日期：2018年11月2日
 * Copyright asiainfo Corporation 2018
 * 版权所有 *
 */
package org.quickstart.webservice.cxf;

import javax.jws.WebService;

/**
 * IMyService
 * 
 * @author：yangzl@asiainfo.com
 * @2018年11月2日 下午4:55:11
 * @since 1.0
 */
@WebService
public interface IMyService {

    String sayHello(String text);

}
