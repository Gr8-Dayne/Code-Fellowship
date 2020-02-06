package com.daylong.CodeFellowship.controllers;


import com.daylong.CodeFellowship.models.ApplicationUser;
import com.daylong.CodeFellowship.models.ApplicationUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;

import java.util.LinkedList;


@Controller
public class LoginController {

    @Autowired
    private ApplicationUserRepository applicationUserRepo;

    @GetMapping("/login")
    public String getLogin(){
        return "login";
    }

    @PostMapping("/login/{id}")
    public RedirectView loginUser(String username, String password){

        ApplicationUser currentUser = applicationUserRepo.findByUsername(username);

        return new RedirectView("/profile");
    }

//    @PostMapping("/create")
//    public RedirectView registerUser(String username, String password){
//        ApplicationUser newUser = new ApplicationUser(username, passwordEncoder.encode(password));
//        applicationUserRepo.save(newUser);
//        Authentication authentication = new UsernamePasswordAuthenticationToken(newUser, null, new LinkedList<>());
//        SecurityContextHolder.getContext().setAuthentication(authentication);
//        return new RedirectView("/profile");
//    }

}
