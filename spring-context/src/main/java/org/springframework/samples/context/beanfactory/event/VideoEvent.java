package org.springframework.samples.context.beanfactory.event;

import org.springframework.context.ApplicationEvent;

public class VideoEvent  extends ApplicationEvent {
    /**
     * Create a new ApplicationEvent.
     *
     * @param source the object on which the event initially occurred (never {@code null})
     */
    public VideoEvent(Object source) {
        super(source);
    }

    public void send(){
        System.out.println("视频原信息以发送，消息源为："+getSource());
    }

}
