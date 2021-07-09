package org.springframework.samples.context.beanfactory.event;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

public class MessageLinstener3 implements ApplicationListener {
    @Override
    public void onApplicationEvent(ApplicationEvent event) {
        if(event instanceof MessageEvent){
            ((MessageEvent) event).send();
        }
    }
}
