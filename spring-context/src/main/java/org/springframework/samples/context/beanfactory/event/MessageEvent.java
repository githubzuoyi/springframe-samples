package org.springframework.samples.context.beanfactory.event;

import org.springframework.context.ApplicationEvent;

public class MessageEvent extends ApplicationEvent {

    /**
     * Create a new ApplicationEvent.
     *
     * @param source the object on which the event initially occurred (never {@code null})
     */
    public MessageEvent(Object source) {
        super(source);
    }

    public void send(){
        System.out.println("邮件以发送至邮件服务器，消息源为："+getSource());
    }
}
