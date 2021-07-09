package org.springframework.samples.context.beanfactory.event;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class MessageBussinessSender implements ApplicationContextAware {

    private ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    public void sendMsg() {
        String msg = "u业务流程完成";
        System.out.println(msg);
        applicationContext.publishEvent(new MessageEvent(msg));
        applicationContext.publishEvent(new VideoEvent(msg));
    }
}
