package com.cydeo.bean_practice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CydeoApp {

    public static void main(String[] args) {


        ApplicationContext container = new AnnotationConfigApplicationContext(ConfigApp.class, ConfigStr.class);

        FullTimeEmployee ft = container.getBean(FullTimeEmployee.class);
        ft.createAccount();

        PartTimeEmployee pt = container.getBean(PartTimeEmployee.class);
        pt.createAccount();

        String str = container.getBean("String practice", String.class);
        System.out.println(str);

    }
}
