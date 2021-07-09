package org.springframework.samples.aop.spring;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;

/**
 * @author: feizuo
 * @since: 1.0.0
 */
public class SpringBootStrap {
    public static void main(String[] args) {
        // 资源加载
        ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        Resource resource = resolver.getResource("classpath:bean.xml");

        // 容器装载，启动
        DefaultListableBeanFactory factory = new DefaultListableBeanFactory();

        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
        reader.loadBeanDefinitions(resource);

        Driver driver = (Driver) factory.getBean("driverproxy");
        System.out.println(driver.getDriverAge());
    }
}
