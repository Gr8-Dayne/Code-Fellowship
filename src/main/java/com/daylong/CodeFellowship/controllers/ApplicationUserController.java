package com.daylong.CodeFellowship.controllers;


import com.daylong.CodeFellowship.models.ApplicationUser;
import com.daylong.CodeFellowship.models.ApplicationUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;


//@Controller
//public class ApplicationUserController {
//
//    @Autowired
//    ApplicationUserRepository applicationUserRepository;
//
//    @Autowired
//    private PasswordEncoder passwordEncoder;
//
//    @PostMapping("/signup")
//    public RedirectView createNewApplicationUser(String username, String password){
//        System.out.println("You are adding a user");
//        // make the user AND salt and hash the password
//        // this does the salting and hashing for you
//        ApplicationUser newUser = new ApplicationUser(username, passwordEncoder.encode(password));
//
//        // save the user to db
//        applicationUserRepository.save(newUser);
//
//        // send them back home
//        return new RedirectView("/profile");
//    }
//
//    @GetMapping("/login")
//    public String showLoginForm(){
//        return "login";
//    }
//
//}
