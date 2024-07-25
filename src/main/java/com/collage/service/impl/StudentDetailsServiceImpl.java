package com.collage.service.impl;


import com.collage.entity.StudentDetails;
import com.collage.model.StudentDetailsDTO;
import com.collage.repository.StudentDetailsRepository;
import com.collage.service.StudentDetailsService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentDetailsServiceImpl implements StudentDetailsService {


    @Autowired
    private StudentDetailsRepository studentDetailsRepository;
    @Autowired
    private ModelMapper modelMapper;

    @Override
    public List<StudentDetails> getAllStudentDetails() {

        List<StudentDetails> getStudentResponse =studentDetailsRepository.findAll();
        return getStudentResponse;
    }

    @Override
    public StudentDetailsDTO createStudent(StudentDetailsDTO studentDetailsDTO) {

        StudentDetails studentDetails = this.dtoToEntity(studentDetailsDTO);
        StudentDetails saveStudentDetails = this.studentDetailsRepository.save(studentDetails);

        return this.entityToDto(saveStudentDetails);
    }




    public  StudentDetails  dtoToEntity(StudentDetailsDTO studentDetailsDTO)
    {
        StudentDetails studentDetails = this.modelMapper.map(studentDetailsDTO, StudentDetails.class) ;

        return studentDetails;
    }


    public StudentDetailsDTO entityToDto(StudentDetails studentDetails)
    {
        StudentDetailsDTO studentDetailsDTO = this.modelMapper.map(studentDetails, StudentDetailsDTO.class);

        return studentDetailsDTO;
    }

}
