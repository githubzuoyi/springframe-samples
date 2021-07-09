package org.springframework.samples.aop.jdks;

import org.springframework.samples.aop.api.UserService;
import org.springframework.samples.aop.api.UserServiceImpl;

import java.lang.reflect.Proxy;

/**
 * @author: feizuo
 * @since: 1.0.0
 */
public class Main {

    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        JdkInvocationHandler handler = new JdkInvocationHandler(userService);
        UserService userServiceProxy = (UserService) Proxy.newProxyInstance(UserService.class.getClassLoader(),new Class[]{UserService.class},handler);
        System.out.println("main:" + userServiceProxy.sayHello("feizuo"));
    }

}
