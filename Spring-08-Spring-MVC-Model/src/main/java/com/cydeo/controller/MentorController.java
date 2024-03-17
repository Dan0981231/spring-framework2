package com.cydeo.controller;

import com.cydeo.enums.Gender;
import com.cydeo.model.Mentor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MentorController {


    @RequestMapping("/mentor")
    public String mentorPage(Model model) {

        List<Mentor> mentorsList = new ArrayList<>();
        mentorsList.add(new Mentor("Mike", "Smith", 45, Gender.MALE));
        mentorsList.add(new Mentor("Tom", "McLean", 20, Gender.FEMALE));
        mentorsList.add(new Mentor("Dan", "Zaiets", 25, Gender.MALE));

        model.addAttribute("mentors", mentorsList);



    return "mentor/mentor-list";
    }
}
