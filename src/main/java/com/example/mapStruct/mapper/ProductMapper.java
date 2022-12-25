package com.example.mapStruct.mapper;


import com.example.mapStruct.dto.ProductDTO;
import com.example.mapStruct.model.Product;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.UUID;

@Mapper(componentModel = "spring", imports = UUID.class)
public interface ProductMapper {

    @Mapping(source = "desc", target = "description", ignore = true)
    @Mapping(target = "itemId", expression = "java(UUID.randomUUID().toString())")
    ProductDTO toDTO(Product product);

    @InheritInverseConfiguration
    Product toEntity(ProductDTO productDTO);
}
