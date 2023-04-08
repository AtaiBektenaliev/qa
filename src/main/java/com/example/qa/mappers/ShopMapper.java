package com.example.qa.mappers;

import com.example.qa.dto.ShopDto;
import com.example.qa.models.Shop;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ShopMapper {
    private final ModelMapper modelMapper;

    @Autowired
    public ShopMapper(ModelMapper modelMapper){this.modelMapper = modelMapper;}

    public ShopDto mapToDto(Shop shop){return modelMapper.map(shop, ShopDto.class);}
    public Shop mapToModel(ShopDto dto){return modelMapper.map(dto, Shop.class);}
}
