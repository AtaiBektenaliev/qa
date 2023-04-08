package com.example.qa.service;

import com.example.qa.models.City;
import com.example.qa.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityService {
    private final CityRepository cityRepo;

    @Autowired
    public CityService(CityRepository cityRepo) {
        this.cityRepo = cityRepo;
    }

    public List<City> getAllCity(){
        return cityRepo.findAll();
    }

    public City saveCity(City city){
        city.setId(city.getId());
        city.setName(city.getName());

        return cityRepo.save(city);
    }

    public void deleteCity(Long id){
        cityRepo.deleteById(id);
    }
}
