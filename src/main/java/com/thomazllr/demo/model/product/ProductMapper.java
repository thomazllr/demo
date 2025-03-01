package com.thomazllr.demo.model.product;

import com.thomazllr.demo.core.mapper.BaseMapper;
import com.thomazllr.demo.entity.Product;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProductMapper extends BaseMapper<Product, ProductRequest, ProductResponse> {
}
