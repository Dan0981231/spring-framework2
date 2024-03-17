package com.cydeo.repository;

import com.cydeo.model.Employee;
import org.springframework.stereotype.Component;

@Component
public class DBEmployeeRepository implements EmployeeRepository{
    // Assume we are getting this data from a DataBase
    @Override
    public int getHourlyRate() {

        Employee employee = new Employee("Bohdan Zaiets", "IT", 65);
        return employee.getHourlyRate();

    }
}
