package com.example.TwitterSpring.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.TwitterSpring.Model.StrudentData;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepo extends JpaRepository<StrudentData, Long> {

}
