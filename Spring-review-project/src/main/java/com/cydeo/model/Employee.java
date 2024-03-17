package com.cydeo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@AllArgsConstructor

public class Employee {

    private String name;
    private String department;

    private int hourlyRate;


}
