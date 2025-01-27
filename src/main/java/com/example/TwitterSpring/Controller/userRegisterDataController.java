package com.example.TwitterSpring.Controller;

import com.example.TwitterSpring.Model.UserRegisterData;

import com.example.TwitterSpring.Repo.UserRegisterImpl;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1")
@CrossOrigin(origins = "http://localhost:3000")
public class userRegisterDataController {

    private final UserRegisterImpl userRegisterService;

    public userRegisterDataController(UserRegisterImpl userRegisterService) {
        this.userRegisterService = userRegisterService;
    }


    @PostMapping("/register")
    public ResponseEntity<?> registerUser(@RequestBody UserRegisterData userRegisterData) {

        try{

        boolean userExist = userRegisterService.existingUserName(userRegisterData.getFirstname());
        boolean userEmailExist = userRegisterService.existingEmail(userRegisterData.getEmail());

            if (userExist && userEmailExist) {
                ResponseEntity.badRequest().body("User Already Exist!");
            } else if (userExist) {
                ResponseEntity.badRequest().body("User name Already Taken");
            } else if (userEmailExist) {
                ResponseEntity.badRequest().body("User mail Already Taken ");
            }

            UserRegisterData savedUser = userRegisterService.saveUserData(userRegisterData);
            return ResponseEntity.ok().body(savedUser);
        } catch (Exception e) {
            // Log the exception for debugging purposes (optional)
            e.printStackTrace();
            // Return a generic error message
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("An error occurred during registration. Please try again.");
        }
    }






}
