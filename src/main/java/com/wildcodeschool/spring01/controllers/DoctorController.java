package com.wildcodeschool.spring01.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DoctorController {
    
    @GetMapping("/doctor/1")
    @ResponseBody
    public String getDoctor1() {
        return "William Hartnell";
    }

    @GetMapping("/doctor/10")
    @ResponseBody
    public String getDoctor10() {
        return "Davie Tennant";
    }

    @GetMapping("/doctor/13")
    @ResponseBody
    public String getDoctor13() {
        return "Jodie Whittaker";
    }


}
