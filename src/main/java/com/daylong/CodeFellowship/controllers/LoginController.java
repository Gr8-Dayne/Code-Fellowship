package com.daylong.CodeFellowship.controllers;


import com.daylong.CodeFellowship.models.ApplicationUser;
import com.daylong.CodeFellowship.models.ApplicationUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;


@Controller
public class LoginController {

    @Autowired
    private ApplicationUserRepository applicationUserRepo;

    @GetMapping("/login")
    public String getLogin(){
        return "login";
    }

    @PostMapping("/login")
    public RedirectView loginUser(String username, Long id){

        ApplicationUser userNumerical = applicationUserRepo.findById(id).get();

        ApplicationUser currentUser = applicationUserRepo.findByUsername(username);

        return new RedirectView("/profile");
    }
}
