/**
 * 项目名称：quickstart-webservice-spring-framework 
 * 文件名：PaymentRequest.java
 * 版本信息：
 * 日期：2018年11月5日
 * Copyright yangzl Corporation 2018
 * 版权所有 *
 */
package org.quickstart.webservice.spring.framework;

/**
 * PaymentRequest
 * 
 * @author：youngzil@163.com
 * @2018年11月5日 下午7:34:23
 * @since 1.0
 */
public class PaymentRequest {
    private int userId;
    private String itemId;
    private double discount;

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
}
