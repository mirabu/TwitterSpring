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
public ResponseEntity<UserLoginResponse> loginProcess(@RequestBody UserLoginRequest userRequest){
    UserRegisterData userLoginResponse =  userRegisterService.findByEmail(userRequest.getEmail());

    if(userLoginResponse==null){
        return ResponseEntity.status(400).body(new UserLoginResponse("Usr NotFound",null,null));
    }

        // Create a UserLoginResponse object to return
        UserLoginResponse response = new UserLoginResponse();
        response.setName(userLoginResponse.getFirstname()); // Assuming you want to return the firstname as name
        response.setEmail(userLoginResponse.getEmail());
        response.setMessage("Login successful"); // Customize this message as needed

        return ResponseEntity.ok(response);
}
}
