package com.cydeo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CydeoApp {
    public static void main(String[] args) {

        ApplicationContext container = new AnnotationConfigApplicationContext(ConfigApp.class);

        Selenium s = container.getBean(Selenium.class);
        Java j = container.getBean(Java.class);
        OfficeHours officeHours = container.getBean(OfficeHours.class);

        s.getTeachingHours();
        j.getTeachingHours();


    }
}
