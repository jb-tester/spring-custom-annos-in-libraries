package com.mytests.spring.useLibrariesTest.config;

import com.mytests.spring.customAnnosLibrary.core.MyBean;
import com.mytests.spring.customBeans.beans.LibBean1;
import com.mytests.spring.customBeans.conf.LibConfig;
import com.mytests.spring.useLibrariesTest.beans.Bean2;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * *
 * <p>Created by irina on 31.03.2021.</p>
 * <p>Project: spring-custom-annos-in-libraries</p>
 * *
 */
@Configuration
@Import(LibConfig.class)
@ComponentScan({"com.mytests.spring.customBeans.components","com.mytests.spring.useLibrariesTest.components"})
public class MyConfig {

    @MyBean
    public Bean2 bean2(){
        return new Bean2("bean2");
    }
    
}
