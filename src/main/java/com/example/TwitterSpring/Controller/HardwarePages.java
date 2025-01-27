package com.example.TwitterSpring.Controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class HardwarePages {

    @GetMapping("/products")
    public ResponseEntity<String> ShowProducts(){
        return new ResponseEntity<>("ProductsPage From Backend Side", HttpStatus.OK);
    }

    
}

