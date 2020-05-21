package com.df.starter.listener;

import org.springframework.context.ApplicationEvent;

/**
 * @author hjh
 */
public class UserRegisterEvent extends ApplicationEvent {
    public Integer id;
    public String name ;

    public UserRegisterEvent(Object source, Integer id, String name) {
        super(source);
        this.id = id;
        this.name = name;
    }

    public UserRegisterEvent(Object source) {
        super(source);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
