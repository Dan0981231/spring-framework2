package com.cydeo.stereotype_annotation.model;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component

public class ExtraHours {

    public Integer getHours(){
        return 10;

    }
}
