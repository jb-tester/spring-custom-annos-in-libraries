package com.mytests.spring.customBeans.beans;

/**
 * *
 * <p>Created by irina on 31.03.2021.</p>
 * <p>Project: spring-custom-annos-in-libraries</p>
 * *
 */
public class LibBean1 {
  String id;

    public LibBean1(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }
}
