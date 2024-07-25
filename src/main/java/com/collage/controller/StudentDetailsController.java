package com.collage.controller;


import com.collage.entity.StudentDetails;
import com.collage.model.StudentDetailsDTO;
import com.collage.service.StudentDetailsService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentDetailsController {


    @Autowired
    private StudentDetailsService studentDetailsService;


    @GetMapping("/getAllStudent")
    public List<StudentDetails> getAllStudent()
    {
        return studentDetailsService.getAllStudentDetails();
    }

    @PostMapping("/create")
    public StudentDetailsDTO createStudent(@RequestBody StudentDetailsDTO studentDetailsDTO)
    {
        return studentDetailsService.createStudent(studentDetailsDTO);
    }


}
