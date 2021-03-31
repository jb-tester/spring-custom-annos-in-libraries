package com.mytests.spring.customBeans.components;

import com.mytests.spring.customAnnosLibrary.core.MyComponent;

/**
 * *
 * <p>Created by irina on 31.03.2021.</p>
 * <p>Project: spring-custom-annos-in-libraries</p>
 * *
 */
@MyComponent("libraryComponent2")
public class LibCompo2 {
   public String getId(){
       return "libraryComponentWithCustomAnnotation";
   }
}
