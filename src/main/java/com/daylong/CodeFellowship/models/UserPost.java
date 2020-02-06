package com.daylong.CodeFellowship.models;


import javax.persistence.*;
import java.text.SimpleDateFormat;
import java.util.Date;


@Entity
public class UserPost {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;

    @ManyToOne
    ApplicationUser savedUser;

    private String content;
    private String timeCreated;

    public UserPost(String content, ApplicationUser savedUser){
        this.content = content;
        this.savedUser = savedUser;
        this.timeCreated = new SimpleDateFormat("yyyy/MM/dd HH:mm").format(new Date());
    }

    public UserPost(){}

    public String getContent() {
        return content;
    }

    public String getAuthor() {
        return savedUser.getUsername();
    }

    public String getTimeCreated() {
        return timeCreated;
    }

    public long getPostId() {
        return id;
    }
}


