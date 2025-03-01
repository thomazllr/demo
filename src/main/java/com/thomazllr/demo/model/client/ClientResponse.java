package com.thomazllr.demo.model.client;

import com.thomazllr.demo.model.product.ProductResponse;

import java.util.List;

public record ClientResponse(Long id, String name, String cpf, String email, List<ProductResponse> products) {

    public ClientResponse(Long id, String name, String cpf, String email) {
        this(id, name, cpf, email, null);
    }
}
