package com.collage.service.impl;


import com.collage.entity.ParentsDetails;
import com.collage.model.ParentsDetailsDTO;
import com.collage.repository.ParentsDetailsRepository;
import com.collage.service.ParentsDetailsService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ParentsDetailsServiceImpl implements ParentsDetailsService {

    @Autowired
    private ParentsDetailsRepository parentsDetailsRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public List<ParentsDetails> getAllParents() {
        List<ParentsDetails> getParentsResponse = parentsDetailsRepository.findAll();
        return getParentsResponse;
    }

    @Override
    public ParentsDetailsDTO createParents(ParentsDetailsDTO parentsDetailsDTO) {

        ParentsDetails parentsDetails = this.dtoToEntity(parentsDetailsDTO);
        ParentsDetails saveParentsDetails = parentsDetailsRepository.save(parentsDetails);
        return this.entityToDto(saveParentsDetails);
    }



    public ParentsDetails dtoToEntity(ParentsDetailsDTO parentsDetailsDTO)
    {
        ParentsDetails parentsDetails = this.modelMapper.map(parentsDetailsDTO, ParentsDetails.class);
        return parentsDetails;
    }

    public ParentsDetailsDTO entityToDto(ParentsDetails parentsDetails)
    {
        ParentsDetailsDTO parentsDetailsDTO = this.modelMapper.map(parentsDetails, ParentsDetailsDTO.class);

        return parentsDetailsDTO;
    }
}
