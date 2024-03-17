package com.cydeo.service;

import com.cydeo.repository.EmployeeRepository;
import com.cydeo.repository.HoursRepository;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Salary {

   private final EmployeeRepository employeeRepository;
   private final HoursRepository hoursRepository;
private final HoursRepository overtimeHours;

    public void calculateRegularSalary(){
        // HourlyRate * Regular Hours
        System.out.println(employeeRepository.getHourlyRate() * (hoursRepository.getHours() + overtimeHours.getHours()));

    }

    public Salary(EmployeeRepository employeeRepository, @Qualifier("REGULAR") HoursRepository hoursRepository, @Qualifier("OVERTIME") HoursRepository overtimeHours) {
        this.employeeRepository = employeeRepository;
        this.hoursRepository = hoursRepository;
        this.overtimeHours = overtimeHours;
    }

}
