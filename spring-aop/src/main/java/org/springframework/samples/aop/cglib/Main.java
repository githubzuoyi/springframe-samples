package org.springframework.samples.aop.cglib;

import org.springframework.samples.aop.api.UserService;
import org.springframework.samples.aop.api.UserServiceImpl;

/**
 * @author: feizuo
 * @since: 1.0.0
 */
public class Main {

    public static void main(String[] args) {
        CglibProxy cglibProxy = new CglibProxy();
        UserService userService = (UserService) cglibProxy.getProxy(UserServiceImpl.class);
        System.out.println("main:" + userService.sayHello("feizuo"));
    }

}
