package com.collage.model;

import lombok.Data;

@Data
public class StudentDetailsDTO {
    private long id;
    private String firstName;
    private String lastName;
    private String dataBirth;
    private String parentName;
    private String emailId;
    private Long mobileNo;
    private String address;
}
