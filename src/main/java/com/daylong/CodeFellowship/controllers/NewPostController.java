package com.daylong.CodeFellowship.controllers;


import com.daylong.CodeFellowship.models.ApplicationUser;
import com.daylong.CodeFellowship.models.ApplicationUserRepository;
import com.daylong.CodeFellowship.models.UserPost;
import com.daylong.CodeFellowship.models.UserPostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;
import java.security.Principal;


@Controller
public class NewPostController {

    @Autowired
    ApplicationUserRepository applicationUserRepository;

    @Autowired
    UserPostRepository userPostRepository;

    @GetMapping("/newpost")
    public String getNewPostPage(){
        return "newpost";
    }

    @PostMapping("/newpost")
    public RedirectView createNewPost(String content, Principal p){
        ApplicationUser loggedInUser = applicationUserRepository.findByUsername(p.getName());
        UserPost t = new UserPost(content, loggedInUser);

        userPostRepository.save(t);

        return new RedirectView("/myprofile");
    }
}
