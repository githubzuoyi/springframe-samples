package org.springframework.samples.aop.jdks;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author: feizuo
 * @since: 1.0.0
 */
public class JdkInvocationHandler implements InvocationHandler {

    private final Object target;

    public JdkInvocationHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("before proxy");
        Object result = method.invoke(target, args);
        System.out.println("after proxy");
        return result;
    }
}
