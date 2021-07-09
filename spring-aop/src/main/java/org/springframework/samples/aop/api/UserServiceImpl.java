package org.springframework.samples.aop.api;

/**
 * @author: feizuo
 * @since: 1.0.0
 */
public class UserServiceImpl implements UserService {


    @Override
    public String sayHello(String name) {
        System.out.println("hello," + name);
        return String.format("hello,", name);
    }
}
