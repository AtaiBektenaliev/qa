package com.example.qa.controller;

import com.example.qa.dto.ShopDto;
import com.example.qa.mappers.ShopMapper;
import com.example.qa.models.Shop;
import com.example.qa.service.ShopService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@AllArgsConstructor
public class ShopController {
    private final ShopService service;
    private final ShopMapper mapper;

    @PostMapping("/shop/save")
    public ShopDto saveShop(@RequestBody ShopDto dto){
        Shop shop = mapper.mapToModel(dto);
        service.saveShop(shop);
        return mapper.mapToDto(shop);
    }

    @GetMapping("/shop/all")
    public List<ShopDto> getAll(){
        return service.getAllShop().stream().
                map(mapper::mapToDto).collect(Collectors.toList());
    }

    @DeleteMapping("/shop/delete")
    public void deleteShop(Long id){
        service.deleteShop(id);
    }
}
