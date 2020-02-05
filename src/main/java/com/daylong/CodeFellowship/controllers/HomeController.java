package com.daylong.CodeFellowship.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.security.Principal;


@Controller
public class HomeController {
    @GetMapping("/")
    public String getHome(Principal p, Model m){
//        MorseCode.morseToEnglish("");
        if(p != null){
            m.addAttribute("username", p.getName());
            m.addAttribute("action","/logout");
        } else {
            m.addAttribute("action","/login");

        }
        return "home";
    }
}