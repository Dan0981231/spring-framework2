package com.cydeo.repository;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Qualifier("REGULAR")
public class RegularHours implements HoursRepository{
    @Override
    public int getHours() {
        return 40;

    }



}
