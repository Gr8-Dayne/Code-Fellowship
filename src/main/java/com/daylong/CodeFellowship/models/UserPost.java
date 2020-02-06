package com.daylong.CodeFellowship.models;


import javax.persistence.*;


@Entity
public class UserPost {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;

    @ManyToOne
    ApplicationUser savedUser;

    private String content;

    public UserPost(String content, ApplicationUser savedUser){
        this.content = content;
        this.savedUser = savedUser;
    }

    public UserPost(){}

    public String getPostContent() {
        return content;
    }

    public String getAuthor() {
        return savedUser.getUsername();
    }

    public long getPostId() {
        return id;
    }
}
