package org.springframework.samples.ioc.beanfactory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.samples.ioc.reflection.po.ConfigBean;
import org.springframework.samples.ioc.reflection.po.JavaConfig;

public class JavaConfigBootStrap {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);

        ConfigBean configBean = (ConfigBean) context.getBean("ConfigBean");
        System.out.println(configBean);
    }
}
