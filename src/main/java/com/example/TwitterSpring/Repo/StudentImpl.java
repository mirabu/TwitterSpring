package com.example.TwitterSpring.Repo;

import com.example.TwitterSpring.Model.StrudentData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentImpl {

    @Autowired
    private StudentRepo studentRepo;

    public StrudentData saveStudent(StrudentData student) {
        return studentRepo.save(student);
    }

    public List<StrudentData> findAll(){
        return studentRepo.findAll();
    }

}
