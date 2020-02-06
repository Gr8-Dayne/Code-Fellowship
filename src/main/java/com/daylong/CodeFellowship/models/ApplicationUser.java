package com.daylong.CodeFellowship.models;


import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Collection;


@Entity
public class ApplicationUser implements UserDetails {



    @Override
    public String toString() {
        return "" + this.id + "";
    }



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long id;

    private String username;
    private String password;
    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private String bio;

    public ApplicationUser(String username, String password, String firstName, String lastName, String dateOfBirth, String bio){
        this.username = username;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.bio = bio;
    }

    public ApplicationUser() {};

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    @Override
    public String getPassword() {
        return this.password;
    }

    @Override
    public String getUsername() {
        return this.username;
    }

    public long getId(){
        return this.id;
    }

    public String getFirstNameLastName(){
        return "Name: " + this.firstName + " " + this.lastName;
    }

    public String getDateOfBirth(){
        return this.dateOfBirth;
    }

    public String getBio(){
        return this.bio;
    }

//    @Override
//    public String toString() {
//        return "You are logged in as: " + firstName + " " + lastName + " (username: " + username + ")";
//    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}