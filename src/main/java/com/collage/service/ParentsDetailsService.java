package com.collage.service;

import com.collage.entity.ParentsDetails;
import com.collage.model.ParentsDetailsDTO;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface ParentsDetailsService {

    public List<ParentsDetails> getAllParents();
    public ParentsDetailsDTO createParents (ParentsDetailsDTO parentsDetailsDTO);
}
