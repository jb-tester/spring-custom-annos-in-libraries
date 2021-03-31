package com.mytests.spring.customBeans.conf;

import com.mytests.spring.customAnnosLibrary.core.MyBean;
import com.mytests.spring.customAnnosLibrary.core.MyConfiguration;
import com.mytests.spring.customBeans.beans.LibBean1;

/**
 * *
 * <p>Created by irina on 31.03.2021.</p>
 * <p>Project: spring-custom-annos-in-libraries</p>
 * *
 */
@MyConfiguration
public class LibConfig {

    @MyBean(name = "libBeanFromLibConfig")
    public String str(){
        return "strFromLibConfigWithCustomAnno";
    }
    @MyBean
    public LibBean1 libBean1(){
        return new LibBean1("libBean1FromLibConfigWithCustomAnno");
    }

    @org.springframework.context.annotation.Bean
    public String normalStr() {
        return "strFromLibConfigWithBeanAnno";
    }
}
