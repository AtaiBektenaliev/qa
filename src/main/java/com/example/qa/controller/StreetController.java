package com.example.qa.controller;

import com.example.qa.dto.StreetDto;
import com.example.qa.mappers.StreetMapper;
import com.example.qa.models.Street;
import com.example.qa.service.StreetService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@AllArgsConstructor
public class StreetController {
    private final StreetService service;
    private final StreetMapper mapper;

    @PostMapping("/street/save")
    public StreetDto saveStreet(@RequestBody StreetDto dto){
        Street street = mapper.mapToModel(dto);
        service.saveStreet(street);
        return mapper.mapToDto(street);
    }

    @GetMapping("/street/all")
    public List<StreetDto> getAll(){
        return service.getAllStreets().stream().
                map(mapper::mapToDto).collect(Collectors.toList());
    }

    @DeleteMapping("/street/delete")
    public void deleteStreet(Long id){
        service.deleteStreet(id);
    }
}
