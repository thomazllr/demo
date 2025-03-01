package com.thomazllr.demo.service;

import com.thomazllr.demo.entity.Client;
import com.thomazllr.demo.entity.Product;
import com.thomazllr.demo.model.product.ProductResponse;
import com.thomazllr.demo.repository.ClientRepository;
import com.thomazllr.demo.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository repository;

    public Product create(Product entity) {
        return repository.save(entity);
    }

    public List<Product> findAll() {
        return repository.findAll();
    }


}
