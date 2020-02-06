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
    public RedirectView createNewPost(String content, String username){
        ApplicationUser savedUser = applicationUserRepository.findByUsername(username);
        UserPost t = new UserPost(content, savedUser);

        System.out.println(username);
//        System.out.println(t.getAuthor());
        System.out.println(t.getPostContent());

        userPostRepository.save(t);

        return new RedirectView("/accounts");
    }

//    @GetMapping("/inbox")
//    public String getInbox(Principal p, Model m){
//
//        ApplicationUser user = applicationUserRepository.findByUsername(p.getName());
//
//        m.addAttribute("messages",user.getInbox());
//
//        return "inbox";
//    }
}
