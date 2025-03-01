package com.thomazllr.demo.service;

import com.thomazllr.demo.entity.Product;
import com.thomazllr.demo.repository.ClientRepository;
import com.thomazllr.demo.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductClientService {

    private final ProductRepository repository;
    private final ClientRepository clientRepository;

    public Product associate(Long idClient, Long idProduct) {
        var product = repository.findById(idProduct).orElseThrow(() -> new RuntimeException("Nao achei fela"));
        var client = clientRepository.findById(idClient).orElseThrow(() -> new RuntimeException("Nao achei fela"));

        client.getProducts().add(product);
        product.setClient(client);

        return repository.save(product);
    }
}
