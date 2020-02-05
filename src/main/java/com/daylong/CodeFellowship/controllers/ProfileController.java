package com.daylong.CodeFellowship.controllers;

import com.daylong.CodeFellowship.models.ApplicationUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.security.Principal;


@Controller
public class ProfileController {

    @Autowired
    private ApplicationUserRepository applicationUser;

    @GetMapping("/profile")
    public String getCreate(Principal p, Model m){

        if (p != null) {
            m.addAttribute("username", p.getName());
        }

        return "profile";
    }
}
