package ztpai.pomidoro.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import ztpai.pomidoro.models.*;

@Controller
public class RoutingController {

    @GetMapping("/login")
    public String login(){
        return "login";
    }

    @GetMapping("/registration/{userID}")
    public String registration(@PathVariable int userID, Model model){
        model.addAttribute(userID);

        return "registration";
    }

    @GetMapping("/timer/{userID}")
    public String timer(@PathVariable int userID, Model model){
        model.addAttribute(userID);
        return "timer";
    }

    @GetMapping("/statistics/{userID}")
    public String statistics(@PathVariable int userID, Model model){
        model.addAttribute(userID);
        return "statistics";
    }

    @GetMapping("todolist/{userID}")
    public String toDoList(@PathVariable int userID, Model model){
        model.addAttribute(userID);
        return "todolist";
    }

    @GetMapping("achievements/{userID}")
    public String achievements(@PathVariable int userID, Model model){
        model.addAttribute(userID);
        return "achievements";
    }

    @GetMapping("logout/{userID}")
    public String logout(@PathVariable int userID, Model model){
        model.addAttribute(userID);
        return "redirect:/login";}

}
