package ztpai.pomidoro.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @GetMapping("/")
    public String login(){
        return "login";
    }

    @GetMapping("/registration")
    public String registration(){
        return "registration";
    }

    @GetMapping("/timer")
    public String timer(){
        return "timer";
    }

    @GetMapping("/statistics")
    public String statistics(){
        return "statistics";
    }

    @GetMapping("todolist")
    public String toDoList(){
        return "todolist";
    }

    @GetMapping("achievement")
    public String achievements(){
        return "achievements";
    }

}
