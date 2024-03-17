package com.cydeo;

import com.cydeo.config.EmployeeConfig;
import com.cydeo.service.OvertimeSalary;
import com.cydeo.service.Salary;
import com.sun.tools.javac.Main;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CydeoApp {

    public static void main(String[] args) {

        ApplicationContext container = new AnnotationConfigApplicationContext(EmployeeConfig.class);

       Salary salary =  container.getBean(Salary.class);
       salary.calculateRegularSalary();

       OvertimeSalary overtimeSalary = container.getBean(OvertimeSalary.class);
       overtimeSalary.calculateOvertimeHours();

    }

}
