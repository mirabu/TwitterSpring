package com.example.TwitterSpring.Repo;

import com.example.TwitterSpring.Model.UserRegisterData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRegisterService extends JpaRepository<UserRegisterData, Long> {

    @Query("SELECT CASE WHEN COUNT(u) > 0 THEN true ELSE false END FROM UserRegisterData u WHERE u.firstname = :userName")
    boolean existingUserName(String userName);

    @Query("SELECT CASE WHEN COUNT(u) > 0 THEN true ELSE false END FROM UserRegisterData u WHERE u.email = :email")
    boolean existingEmail(String email);

    @Query("SELECT u FROM UserRegisterData u WHERE u.email = :email")
    UserRegisterData findByEmail(String email);
}
