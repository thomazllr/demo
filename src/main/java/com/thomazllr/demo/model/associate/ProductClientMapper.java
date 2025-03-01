package com.thomazllr.demo.model.associate;

import com.thomazllr.demo.entity.Product;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface ProductClientMapper {

    @Mapping(source = "product", target = "product")
    ProductClientResponse toResponse(Product product, String clientName);

}
