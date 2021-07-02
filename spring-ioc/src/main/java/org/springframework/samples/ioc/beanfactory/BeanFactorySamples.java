package org.springframework.samples.ioc.beanfactory;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;
import org.springframework.samples.ioc.beanfactory.postprocessor.MyBeanDefinitionRegistryPostProcessor;
import org.springframework.samples.ioc.beanfactory.postprocessor.MyInstantiationAwareBeanPostProcessor;
import org.springframework.samples.ioc.reflection.po.Car;
import org.springframework.samples.ioc.reflection.po.ConfigBean;
import org.springframework.samples.ioc.reflection.po.UserDao;

import java.io.IOException;

/**
 *
 */
public class BeanFactorySamples {

    public static void main(String[] args) throws IOException {

        // 资源加载
        ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        Resource resource = resolver.getResource("classpath:BeanDefinition.xml");
        System.out.printf("resource path is %s",resource.getURL());

        // 容器装载，启动
        DefaultListableBeanFactory factory = new DefaultListableBeanFactory();

        MyInstantiationAwareBeanPostProcessor instantiationPostProcessor = new MyInstantiationAwareBeanPostProcessor();
        factory.addBeanPostProcessor(instantiationPostProcessor);


        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
        reader.loadBeanDefinitions(resource);

        Car carInstance = factory.getBean(Car.class);
        System.out.println(carInstance);
        carInstance.setColor("yello");
        System.out.println(carInstance);
        factory.destroySingletons();

//        UserDao userDao = (UserDao) factory.getBean("UserDao");
//        System.out.println(userDao);

    }

}
