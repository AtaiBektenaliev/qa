package com.example.qa.service;

import com.example.qa.models.Street;
import com.example.qa.repository.StreetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StreetService {
    private final StreetRepository streetRepo;

    @Autowired
    public StreetService(StreetRepository streetRepo) {
        this.streetRepo = streetRepo;
    }

    public List<Street> getAllStreets(){
        return streetRepo.findAll();
    }

    public Street saveStreet(Street street){
        street.setId(street.getId());
        street.setName(street.getName());
        street.setCity(street.getCity());

        return streetRepo.save(street);
    }

    public void deleteStreet(Long id){
        streetRepo.deleteById(id);
    }
}
