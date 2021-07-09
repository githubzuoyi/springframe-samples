package org.springframework.samples.aop.spring;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * @author: feizuo
 * @since: 1.0.0
 */
public class ServiceBeforeAdvice implements MethodBeforeAdvice {

    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {
        if(args.length != 0){
            System.out.printf("hello,how are you,%s %n", args[0]);
        } else {
            System.out.printf("hello,how are you%n");
        }

    }
}
