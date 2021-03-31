package com.mytests.spring.customBeans.conf;

import com.mytests.spring.customAnnosLibrary.core.MyComponent;

/**
 * *
 * <p>Created by irina on 31.03.2021.</p>
 * <p>Project: spring-custom-annos-in-libraries</p>
 * *
 */
@MyComponent("libCompoFromLibConfig")
public class LibCompo1 {
    public String getId(){
        return "libCompoFromLibConfig";
    }
}
