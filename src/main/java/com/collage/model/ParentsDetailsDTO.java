package com.collage.model;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class ParentsDetailsDTO {

    private Long id;
    private String firstname;
    private String lastName;
    private String email;
    private String mobileNo;
    private String address;
}
