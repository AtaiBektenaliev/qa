package com.example.qa.controller;

import com.example.qa.dto.CityDto;
import com.example.qa.mappers.CityMapper;
import com.example.qa.models.City;
import com.example.qa.service.CityService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@AllArgsConstructor
public class CityController {
    private final CityService service;
    private final CityMapper mapper;

    @PostMapping("/city/save")
    public CityDto saveCity(@RequestBody CityDto dto){
        City city = mapper.mapToEntity(dto);
        service.saveCity(city);
        return mapper.mapToDto(city);
    }

    @GetMapping("/city/all")
    public List<CityDto> getAll(){
        return service.getAllCity().stream().
                map(mapper::mapToDto).collect(Collectors.toList());
    }

    @DeleteMapping("/city/delete")
    public void deleteCity(Long id){
        service.deleteCity(id);
    }
}
