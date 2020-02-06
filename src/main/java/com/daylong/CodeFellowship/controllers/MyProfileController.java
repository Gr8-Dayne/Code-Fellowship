package com.daylong.CodeFellowship.controllers;


import com.daylong.CodeFellowship.models.ApplicationUser;
import com.daylong.CodeFellowship.models.ApplicationUserRepository;
import com.daylong.CodeFellowship.models.UserPostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.security.Principal;


@Controller
public class MyProfileController {

    @Autowired
    private ApplicationUserRepository applicationUserRepository;

    @Autowired
    private UserPostRepository userPostRepository;

    @GetMapping("/myprofile")
    public String showMyDetails(Principal p, Model m){

        ApplicationUser myProfile = applicationUserRepository.findByUsername(p.getName());
        m.addAttribute("myId", myProfile.getId());
        m.addAttribute("myGovName", myProfile.getFirstNameLastName());
        m.addAttribute("myDOB", myProfile.getDateOfBirth());
        m.addAttribute("myBio", myProfile.getBio());

        if(p != null){
            m.addAttribute("username", p.getName());
            m.addAttribute("action","/logout");
        }
        else {
            m.addAttribute("action","/login");
        }
        m.addAttribute("postsByMe", myProfile.getMyPosts());
        System.out.println(myProfile.getMyPosts());
        return "myprofile";
    }

//    @GetMapping("/friends/{id}")
//    public String getAllFriends(@PathVariable long id, Principal p, Model d){
//        ApplicationUser friendsList = applicationUserRepo.findById(id).get();
//        ApplicationUser loggedInUser = applicationUserRepo.findByUsername(p.getName());
//        d.addAttribute("friendsList", friendsList);
//        d.addAttribute("loggedInUser", loggedInUser);
//        return "/profile";
//    }
}
