package org.springframework.samples.ioc.reflection.po;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;

public class Car implements BeanClassLoaderAware,BeanNameAware, BeanFactoryAware, InitializingBean, DisposableBean {

    private String color;

    private int money;

    private Driver driver;

    private BeanFactory beanFactory;
    private String beanName;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", money=" + money +
                ", driver=" + driver +
                '}';
    }

    public void init(){
        System.out.println("bean级 xml：init-method");
    }

    public void destory(){
        System.out.println("bean级 xml：destory-method");
    }

    public void introduce() {
        System.out.printf("this car's color is %s ,and its pirce is %s %n", color, money);
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        this.beanFactory = beanFactory;
        System.out.println("bean级 处理：BeanFactoryAware#setBeanFactory");
    }

    @Override
    public void setBeanName(String name) {
        this.beanName = name;
        System.out.println("bean级 处理：BeanNameAware#setBeanName");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("bean级 处理：DisposableBean#destroy");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("bean级 处理：InitializingBean#afterPropertiesSet");
    }

    @Override
    public void setBeanClassLoader(ClassLoader classLoader) {
        System.out.println("bean级 处理：BeanClassLoaderAware#setBeanClassLoader");
    }
}
