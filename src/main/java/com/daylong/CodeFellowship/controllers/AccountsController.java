package com.daylong.CodeFellowship.controllers;


import com.daylong.CodeFellowship.models.ApplicationUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.security.Principal;


@Controller
public class AccountsController {

    @Autowired
    private ApplicationUserRepository applicationUserRepository;

    @GetMapping("/accounts")
    public String getCreate(Principal p, Model m){
        if(p != null){
            m.addAttribute("username", p.getName());
            m.addAttribute("action","/logout");
        }
        else {
            m.addAttribute("action","/login");
        }
        m.addAttribute("allUsers", applicationUserRepository.findAll());
        return "accounts";
    }
}