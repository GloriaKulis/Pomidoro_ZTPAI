package ztpai.pomidoro.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class RoutingController {

    @GetMapping("/login")
//    @RequestMapping(value = "/image", method = RequestMethod.GET, produces = "image/svg+xml")
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

    @GetMapping("achievements")
    public String achievements(){
        return "achievements";
    }

    @GetMapping("logout")
    public String logout(){return "redirect:/login";}

}
