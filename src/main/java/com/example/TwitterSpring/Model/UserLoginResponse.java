package com.example.TwitterSpring.Model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class UserLoginResponse {
    private String name;
    private String email;
    private String message;
}
