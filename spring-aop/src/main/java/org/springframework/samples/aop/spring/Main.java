package org.springframework.samples.aop.spring;

import org.springframework.aop.framework.ProxyFactory;
import org.springframework.samples.aop.api.UserService;
import org.springframework.samples.aop.api.UserServiceImpl;

/**
 * @author: feizuo
 * @since: 1.0.0
 */
public class Main {

    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        ServiceBeforeAdvice advice = new ServiceBeforeAdvice();
        ProxyFactory factory = new ProxyFactory();
        factory.setTarget(userService);
        factory.addAdvice(advice);
        UserService userServiceInstance = (UserService) factory.getProxy();
        userServiceInstance.sayHello("feizuo");
    }
}
