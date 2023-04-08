package com.example.qa.mappers;

import com.example.qa.dto.CityDto;
import com.example.qa.models.City;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CityMapper {
    private final ModelMapper modelMapper;
    @Autowired
    public CityMapper(ModelMapper modelMapper) {this.modelMapper = modelMapper;}

    public CityDto mapToDto(City city){return modelMapper.map(city, CityDto.class);}
    public City mapToEntity(CityDto cityDto){return modelMapper.map(cityDto, City.class);}
}
