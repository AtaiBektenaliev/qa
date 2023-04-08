package com.example.qa.mappers;

import com.example.qa.dto.StreetDto;
import com.example.qa.models.Street;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class StreetMapper {
    private final ModelMapper modelMapper;

    @Autowired
    public StreetMapper(ModelMapper modelMapper){this.modelMapper = modelMapper;}

    public StreetDto mapToDto(Street street){return modelMapper.map(street, StreetDto.class);}
    public Street mapToModel(StreetDto dto){return modelMapper.map(dto, Street.class);}
}
