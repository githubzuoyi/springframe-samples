package org.springframework.samples.context.beanfactory.event;

import org.springframework.context.ApplicationListener;

public class MessageListener implements ApplicationListener<MessageEvent> {

    @Override
    public void onApplicationEvent(MessageEvent event) {
        event.send();
    }
}
