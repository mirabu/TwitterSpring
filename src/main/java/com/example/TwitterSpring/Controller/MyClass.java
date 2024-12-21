package com.example.TwitterSpring.Controller;

import com.example.TwitterSpring.Model.StrudentData;
import com.example.TwitterSpring.Repo.StudentRepo;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MyClass {

    private final StudentRepo studentRepo;

    public MyClass(StudentRepo studentRepo) {
        this.studentRepo = studentRepo;
    }

    @GetMapping("country")
    public String getName(){
        return "England";
    }

    @PostMapping("/add")
    public ResponseEntity<StrudentData> getAdd(@RequestBody StrudentData strudentData){
        try {
            return new ResponseEntity<>(studentRepo.save(strudentData),HttpStatus.CREATED);
        }catch (Exception exp){
            return new ResponseEntity<>(null,HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }

    @GetMapping("/allData")
    public ResponseEntity<List<StrudentData>> getAllDetails(){
        return new ResponseEntity<>(studentRepo.findAll(), HttpStatus.OK);
    }
}
