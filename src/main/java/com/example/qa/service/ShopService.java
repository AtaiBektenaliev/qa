package com.example.qa.service;

import com.example.qa.models.Shop;
import com.example.qa.repository.ShopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShopService {
    private final ShopRepository shopRepo;

    @Autowired
    public ShopService(ShopRepository shopRepo) {
        this.shopRepo = shopRepo;
    }

    public List<Shop> getAllShop(){
        return shopRepo.findAll();
    }

    public Shop saveShop(Shop shop){
        return shopRepo.save(shop);
    }

    public void deleteShop(Long id){
        shopRepo.deleteById(id);
    }
}
