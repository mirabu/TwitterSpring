package com.example.TwitterSpring.Controller;


import com.example.TwitterSpring.Model.UserLoginRequest;


import com.example.TwitterSpring.Model.UserLoginResponse;
import com.example.TwitterSpring.Model.UserRegisterData;
import com.example.TwitterSpring.Repo.UserRegisterImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1")
@CrossOrigin(origins = "http://localhost:3000")
public class UserLoginController {

    private final UserRegisterImpl userRegisterService;

    public UserLoginController(UserRegisterImpl userRegisterService) {
        this.userRegisterService = userRegisterService;
    }

    @PostMapping("/login")
    public ResponseEntity<?> loginProcess(@RequestBody UserLoginRequest userRequest){
        UserRegisterData userLoginResponse =  userRegisterService.findByEmail(userRequest.getEmail());

        if(userLoginResponse==null){
            ResponseEntity.status(400).body("Usr NotFound");
        }
        return ResponseEntity.ok(userLoginResponse);
    }
}
