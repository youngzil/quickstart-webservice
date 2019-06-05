/**
 * 项目名称：quickstart-webservice-spring-framework 
 * 文件名：PaymentController.java
 * 版本信息：
 * 日期：2018年11月5日
 * Copyright yangzl Corporation 2018
 * 版权所有 *
 */
package org.quickstart.webservice.spring.framework;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * PaymentController
 * 
 * @author：youngzil@163.com
 * @2018年11月5日 下午7:35:16
 * @since 1.0
 */
@RestController
@RequestMapping("/payment")
public class PaymentController {

    // http://localhost:8080/quickstart-webservice-spring-framework/rest/payment/pay?key=SHARED_KEY

    private final String sharedKey = "SHARED_KEY";
    private static final String SUCCESS_STATUS = "success";
    private static final String ERROR_STATUS = "error";
    private static final int CODE_SUCCESS = 100;
    private static final int AUTH_FAILURE = 102;

    @RequestMapping(value = "/pay", method = RequestMethod.POST)
    public BaseResponse pay(@RequestParam(value = "key") String key, @RequestBody PaymentRequest request) {
        BaseResponse response = new BaseResponse();
        if (sharedKey.equalsIgnoreCase(key)) {
            int userId = request.getUserId();
            String itemId = request.getItemId();
            double discount = request.getDiscount();
            // Process the request
            // ....
            // Return success response to the client.
            response.setStatus(SUCCESS_STATUS);
            response.setCode(CODE_SUCCESS);
        } else {
            response.setStatus(ERROR_STATUS);
            response.setCode(AUTH_FAILURE);
        }
        return response;
    }
}
