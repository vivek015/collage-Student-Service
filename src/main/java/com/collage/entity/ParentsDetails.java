package com.collage.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;

@Data
@Entity
@Table(name ="Parents_Details")
public class ParentsDetails implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name="First_Name")
    private String firstname;

    @Column(name="Last_Name")
    private String lastName;

    @Column(name ="Email")
    private String email;

    @Column(name ="Mobile_No")
    private String mobileNo;

    @Column(name ="Address")
    private String address;
}
