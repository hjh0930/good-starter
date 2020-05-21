package com.df.starter.listener;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Component;

/**
 * 发布事件，也就是把某个事件告诉的所有与这个事件相关的监听器。(消息发布者)
 */
@Component
public class UserService implements ApplicationEventPublisherAware {
    private ApplicationEventPublisher applicationEventPublisher;

    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.applicationEventPublisher = applicationEventPublisher;
    }
    public void register (String name) {
        System.out.println("用户 ："+name+"已注册");
        applicationEventPublisher.publishEvent(new UserRegisterEvent(this,11,name));
}
}
