package org.springframework.samples.context.beanfactory.event;

import org.springframework.context.ApplicationListener;

public class MessageLinstener2 implements ApplicationListener<MessageEvent> {

    @Override
    public void onApplicationEvent(MessageEvent event) {
        event.send();
    }
}
