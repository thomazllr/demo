package com.thomazllr.demo.model.associate;

import com.thomazllr.demo.model.product.ProductResponse;

public record ProductClientResponse(ProductResponse product, String clientName){
}
