/**
 * 项目名称：quickstart-webservice-spring-framework 
 * 文件名：BaseResponse.java
 * 版本信息：
 * 日期：2018年11月5日
 * Copyright yangzl Corporation 2018
 * 版权所有 *
 */
package org.quickstart.webservice.spring.framework;

/**
 * BaseResponse
 * 
 * @author：youngzil@163.com
 * @2018年11月5日 下午7:34:43
 * @since 1.0
 */
public class BaseResponse {
    private String status;
    private Integer code;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}
