package com.daylong.CodeFellowship.controllers;


import com.daylong.CodeFellowship.models.ApplicationUser;
import com.daylong.CodeFellowship.models.ApplicationUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import java.security.Principal;


@Controller
public class ProfileController {

    @Autowired
    private ApplicationUserRepository applicationUserRepository;

    @GetMapping("/profile")
    public String getCreate(Principal p, Model m){
        if(p != null){
            m.addAttribute("username", p.getName());
            m.addAttribute("action","/logout");
        }
        else {
            m.addAttribute("action","/login");
        }
        return "profile";
    }

    // Credit: 01/28/2020 class demo
    @GetMapping("/users/{id}")
    public String showUserDetails(@PathVariable long id, Principal p, Model m){
        ApplicationUser theUser = applicationUserRepository.findById(id).get();
        m.addAttribute("userISeeUsername", theUser.getUsername());
        m.addAttribute("userISeeId", theUser.id);
        m.addAttribute("userISee", theUser);
        m.addAttribute("userISeeGovName", theUser.getFirstNameLastName());
        m.addAttribute("userISeeDOB", theUser.getDateOfBirth());
        m.addAttribute("userISeeBio", theUser.getBio());
        m.addAttribute("myUsername", p.getName());
        return "profile";
    }
}
