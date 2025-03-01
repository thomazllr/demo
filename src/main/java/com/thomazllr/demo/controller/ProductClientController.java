package com.thomazllr.demo.controller;


import com.thomazllr.demo.model.associate.ProductClientResponse;
import com.thomazllr.demo.model.associate.ProductClientRequest;
import com.thomazllr.demo.model.associate.ProductClientMapper;
import com.thomazllr.demo.service.ProductClientService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/product-client")
public class ProductClientController {

    private final ProductClientService productClientService;
    private final ProductClientMapper mapper;

    @PostMapping("/associate")
    public ResponseEntity<ProductClientResponse> associateClientToProduct(@RequestBody ProductClientRequest request) {
        var associate = productClientService.associate(request.idClient(), request.idProduct());
        return ResponseEntity.ok(mapper.toResponse(associate, associate.getClient().getName()));
    }
}
