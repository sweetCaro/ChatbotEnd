package com.example.chatbotend.controller;

import org.apache.catalina.Manager;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RestController("managerController")
public class testController {

    @RequestMapping("/test")
    public String queryManagerByManager(){
        System.out.println("managerID = ");
        return "result";
    }
}
