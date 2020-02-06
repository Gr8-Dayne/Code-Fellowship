package com.daylong.CodeFellowship.controllers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.security.Principal;

public class ErrorController {

    @GetMapping("/error")
    public String getHome(Principal p, Model m){
        if(p != null){
            m.addAttribute("username", p.getName());
            m.addAttribute("action","/logout");
        }
        else {
            m.addAttribute("action","/login");
        }
        return "error";
    }
}
