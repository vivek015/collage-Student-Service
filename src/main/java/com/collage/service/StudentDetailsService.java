package com.collage.service;

import com.collage.entity.StudentDetails;
import com.collage.model.StudentDetailsDTO;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface StudentDetailsService {

    public  List<StudentDetails> getAllStudentDetails();
    public StudentDetailsDTO createStudent(StudentDetailsDTO studentDetailsDTO);

}
