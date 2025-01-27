package com.example.TwitterSpring.Model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;


public class UserLoginResponse {
    private String name;
    private String email;
    private String message;

    // Constructor for error response
    public UserLoginResponse(String message, String name, String email) {
        this.message = message;
        this.name = name;
        this.email = email;
    }

    public UserLoginResponse() {

    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for email
    public String getEmail() {
        return email;
    }

    // Setter for email
    public void setEmail(String email) {
        this.email = email;
    }

    // Getter for message
    public String getMessage() {
        return message;
    }

    // Setter for message
    public void setMessage(String message) {
        this.message = message;
    }

}
