package com.example.TwitterSpring.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.util.Date;

@Data
@Entity
@Table(name="StudentDatabase")
public class StrudentData {

    @Id
    private long id;

    @Column
    private String Firstname;

    @Column
    private String Lastname;

    @Column
    private String City;

    @Column
    private Double age;

    @Column
    private String State;

    @Column
    private String Country;


}
