package com.Survey.SchedulingSurvey.controller;


import com.Survey.SchedulingSurvey.entity.Survey;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SurveyController {


    @PostMapping("/new")
    public Survey create(@RequestBody Survey user) {
        System.out.println("welcome");
        return user;
    }
}
