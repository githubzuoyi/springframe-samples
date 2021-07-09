package org.springframework.samples.context.reflection.po;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.samples.context.beanfactory.event.MessageBussinessSender;
import org.springframework.samples.context.beanfactory.event.MessageLinstener2;
import org.springframework.samples.context.beanfactory.event.MessageLinstener3;
import org.springframework.samples.context.beanfactory.event.MessageListener;

@Configuration
public class JavaConfig {

    @Bean("ConfigBean")
    public ConfigBean getBean(){
        return new ConfigBean();
    }

    @Bean
    public MessageBussinessSender getSender(){
        return new MessageBussinessSender();
    }

    @Bean("MessageListener")
    public MessageListener getListener(){
        return new MessageListener();
    }

    @Bean("MessageListener2")
    public MessageLinstener2 getListener2(){
        return new MessageLinstener2();
    }

    @Bean("MessageListener3")
    public MessageLinstener3 getListener3(){
        return new MessageLinstener3();
    }
}
