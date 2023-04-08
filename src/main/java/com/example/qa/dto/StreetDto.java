package com.example.qa.dto;

import com.example.qa.models.City;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class StreetDto {
    private Long id;
    private String name;
    private City city;

}
