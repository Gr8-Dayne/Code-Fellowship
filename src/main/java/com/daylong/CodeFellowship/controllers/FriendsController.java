package com.daylong.CodeFellowship.controllers;


import com.daylong.CodeFellowship.models.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.security.Principal;
import java.util.List;


@Controller
public class FriendsController {

    @Autowired
    private ApplicationUserRepository applicationUserRepository;

    @GetMapping("/friends")
    public String showFriends(Principal p, Model m){

        // This gets logged in user's Username
        ApplicationUser user = applicationUserRepository.findByUsername(p.getName());

        // This gets all users from friends list (List<ApplicationUser>)
        List<ApplicationUser> usersFriended = user.getMyFriends();
        m.addAttribute("usersFriended", usersFriended);


        if(p != null){
            m.addAttribute("username", p.getName());
            m.addAttribute("action","/logout");
        }
        else {
            m.addAttribute("action","/login");
        }
        return "friends";
    }
}
