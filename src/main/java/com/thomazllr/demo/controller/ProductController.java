package com.thomazllr.demo.controller;

import com.thomazllr.demo.model.product.ProductMapper;
import com.thomazllr.demo.model.product.ProductRequest;
import com.thomazllr.demo.model.product.ProductResponse;
import com.thomazllr.demo.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/product")
public class ProductController {

    private final ProductService service;
    private final ProductMapper mapper;

    @PostMapping
    public ResponseEntity<ProductResponse> create(@RequestBody ProductRequest request) {
        var product = service.create(mapper.fromRequest(request));
        return ResponseEntity.status(HttpStatus.CREATED).body(mapper.toResponse(product));
    }

    @GetMapping
    public ResponseEntity<List<ProductResponse>> getAll() {
        return ResponseEntity.ok(service.findAll().stream().map(mapper::toResponse).toList());
    }

}
