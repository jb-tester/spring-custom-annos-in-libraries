package com.mytests.spring.customBeans.components;

import org.springframework.stereotype.Component;

/**
 * *
 * <p>Created by irina on 31.03.2021.</p>
 * <p>Project: spring-custom-annos-in-libraries</p>
 * *
 */
@Component
public class LibCompo3 {
    public String getId(){
        return "libraryComponentAnnotatedWithComponent";
    }
}
