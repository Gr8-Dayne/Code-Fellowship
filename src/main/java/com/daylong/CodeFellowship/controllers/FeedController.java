package com.daylong.CodeFellowship.controllers;

import com.daylong.CodeFellowship.models.ApplicationUser;
import com.daylong.CodeFellowship.models.ApplicationUserRepository;
import com.daylong.CodeFellowship.models.UserPost;
import com.daylong.CodeFellowship.models.UserPostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.security.Principal;

public class FeedController {

    @Autowired
    private ApplicationUserRepository applicationUserRepository;

    @Autowired
    private UserPostRepository userPostRepository;

    @GetMapping("/feed")
    public String showUserDetails(@PathVariable long id, Principal p, Model m){

        m.addAttribute("myUsername", p.getName());

        

        if(p != null){
            m.addAttribute("username", p.getName());
            m.addAttribute("action","/logout");
        }
        else {
            m.addAttribute("action","/login");
        }

        return "feed";
    }
}
