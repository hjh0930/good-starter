package com.df.starter.listener;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @author jifeng
 */
@Component
public class UserListener implements ApplicationListener<UserRegisterEvent> {
    public void onApplicationEvent(UserRegisterEvent userRegisterEvent) {
        System.out.println("11111"+userRegisterEvent.getSource());
        System.out.println("22222"+userRegisterEvent.getId());
        System.out.println("33333"+userRegisterEvent.getName());
    }
}
