package com.cydeo.stereotype_annotation.model;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class DataStructure {

    ExtraHours extraHours;

    public void getTotalHours(){
        System.out.println("Total hours: " + (20 + extraHours.getHours()));
    }
}
