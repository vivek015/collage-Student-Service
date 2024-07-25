package com.collage.controller;

import com.collage.entity.ParentsDetails;
import com.collage.model.ParentsDetailsDTO;
import com.collage.service.ParentsDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/parents")
public class ParentsDetailsController {


    @Autowired
    private ParentsDetailsService parentsDetailsService;

    @GetMapping("/parent/getAllParent")
    public List<ParentsDetails> getAllParent()
    {
            List<ParentsDetails> parentsDetails = parentsDetailsService.getAllParents();

            return parentsDetails;
    }

    @PostMapping("/parent/create")
    public ParentsDetailsDTO createParent(@RequestBody ParentsDetailsDTO parentsDetailsDTO)
    {
        return parentsDetailsService.createParents(parentsDetailsDTO);
    }
}
