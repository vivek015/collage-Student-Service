package com.collage.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;

@Data
@Entity
@Table(name ="STUDENT_DETAILS")
public class StudentDetails  implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name ="First_Name")
    private String firstName;

    @Column(name ="Last_Name")
    private String lastName;

    @Column(name ="Data_Birth")
    private String dataBirth;

    @Column(name ="Parent_Name")
    private String parentName;

    @Column(name ="Email_Id")
    private String emailId;

    @Column(name ="Mobile_No")
    private Long mobileNo;

    @Column(name ="Address")
    private String address;

}
