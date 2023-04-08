package com.example.qa.dto;

import com.example.qa.models.City;
import com.example.qa.models.Street;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Timestamp;
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ShopDto {
    private Long id;
    private City city;
    private Street street;
    private String home;
    private Timestamp openTime;
    private Timestamp closeTime;
}
