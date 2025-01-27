package com.example.TwitterSpring.Model;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;


public class UserLoginRequest {
    private String email;
    private String password;

    public String getEmail() {
        return email;
    }

    // Setter for email
    public void setEmail(String email) {
        this.email = email;
    }

    // Getter for password
    public String getPassword() {
        return password;
    }

    // Setter for password
    public void setPassword(String password) {
        this.password = password;
    }
}
