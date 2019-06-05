/**
 * 项目名称：quickstart-webservice 
 * 文件名：MyServiceImpl.java
 * 版本信息：
 * 日期：2018年11月2日
 * Copyright yangzl Corporation 2018
 * 版权所有 *
 */
package org.quickstart.webservice.jws.server;

import javax.jws.WebService;

import org.springframework.stereotype.Component;

/**
 * MyServiceImpl
 * 
 * @author：youngzil@163.com
 * @2018年11月2日 下午4:55:46
 * @since 1.0
 */
@Component
@WebService(serviceName = "MyService", endpointInterface = "org.quickstart.webservice.jws.server.IMyService")
public class MyServiceImpl implements IMyService {

    @Override
    public int add(int a, int b) {
        System.out.println(a + "+" + b + "=" + (a + b));
        return a + b;
    }

    @Override
    public int minus(int a, int b) {
        System.out.println(a + "-" + b + "=" + (a - b));
        return a - b;
    }

    @Override
    public User login(String username, String password) {
        System.out.println(username + " is logining");
        User user = new User();
        user.setId(1);
        user.setUsername(username);
        user.setPassword(password);
        return user;
    }

    @Override
    public String sayHello(String name) {
        return "hello," + name;
    }

}
