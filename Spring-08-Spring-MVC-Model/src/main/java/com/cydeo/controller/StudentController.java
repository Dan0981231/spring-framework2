package com.cydeo.controller;
import com.cydeo.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Controller
public class StudentController {

    @RequestMapping("/welcome")
    public String homePage(Model model){

        model.addAttribute("name", "Cydeo");
        model.addAttribute("course", "MVC");

        String subject = "Collections";
        model.addAttribute("subject", subject);

        // create some random student id (0-1000) and show it in your ui

        Random random = new Random();
        int id = random.nextInt();
        String studentId = "studentId";
        model.addAttribute(studentId, id);

        List<Integer> numbers = new ArrayList<>();
        numbers.add(4);
        numbers.add(3);
        numbers.add(9);
        numbers.add(11);
        model.addAttribute("numbers", numbers);


        Student student = new Student(1, "Bohdan", "Zaiets");
        model.addAttribute("student", student);




        return "student/welcome";
    }
}
