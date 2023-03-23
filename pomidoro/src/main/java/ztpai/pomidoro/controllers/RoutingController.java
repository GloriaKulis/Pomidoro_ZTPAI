package ztpai.pomidoro.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import ztpai.pomidoro.models.*;

@Controller
public class RoutingController {

    @GetMapping("/login/{user}")
    public String login(@PathVariable User user){
        return "login";
    }

    @GetMapping("/registration/{user}")
    public String registration(@PathVariable User user){
        return "registration";
    }

    @GetMapping("/timer/{user}/{timer}")
    public String timer(@PathVariable User user,@PathVariable Timer timer){
        return "timer";
    }

    @GetMapping("/statistics/{user}/{statistics}")
    public String statistics(@PathVariable User user,@PathVariable Statistics statistics){
        return "statistics";
    }

    @GetMapping("todolist/{user}/{toDoList}")
    public String toDoList(@PathVariable User user, @PathVariable ToDoList toDoList){
        return "todolist";
    }

    @GetMapping("achievements/{user}/{achievements}")
    public String achievements(@PathVariable User user,@PathVariable Achievements achievements){
        return "achievements";
    }

    @GetMapping("logout/{user}")
    public String logout(@PathVariable User user){return "redirect:/login";}

}
