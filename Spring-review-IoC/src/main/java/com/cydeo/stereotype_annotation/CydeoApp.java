package com.cydeo.stereotype_annotation;

import com.cydeo.bean_practice.ConfigApp;
import com.cydeo.bean_practice.ConfigStr;
import com.cydeo.stereotype_annotation.config.AppConfig;
import com.cydeo.stereotype_annotation.model.DataStructure;
import com.cydeo.stereotype_annotation.model.ExtraHours;
import com.cydeo.stereotype_annotation.model.MicroService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CydeoApp {

    public static void main(String[] args) {

        ApplicationContext container = new AnnotationConfigApplicationContext(AppConfig.class);
        DataStructure dataStructure = container.getBean(DataStructure.class);
        dataStructure.getTotalHours();

        MicroService microService = container.getBean(MicroService.class);
        microService.getTotalHours();

       ExtraHours getHours = container.getBean(ExtraHours.class);
        System.out.println(getHours.getHours());
    }
}
