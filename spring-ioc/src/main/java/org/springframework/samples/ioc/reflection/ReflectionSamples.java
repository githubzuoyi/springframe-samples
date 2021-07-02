package org.springframework.samples.ioc.reflection;

import org.springframework.samples.ioc.reflection.po.Car;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionSamples {

    public static void introduceByInflection() throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        Class clazz = classLoader.loadClass(Car.class.getName());
        Car car = (Car) clazz.newInstance();
        Method colorMethod = clazz.getDeclaredMethod("setColor",String.class);
        colorMethod.invoke(car,"green");

        Method moneyMethod = clazz.getDeclaredMethod("setMoney",int.class);
        moneyMethod.invoke(car,15);

        Method introduceMethod = clazz.getDeclaredMethod("introduce",null);
        introduceMethod.invoke(car,null);
    }

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        introduceByInflection();
    }

}
