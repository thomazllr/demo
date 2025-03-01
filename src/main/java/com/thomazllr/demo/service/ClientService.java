package com.thomazllr.demo.service;

import com.thomazllr.demo.entity.Client;
import com.thomazllr.demo.model.client.ClientMapper;
import com.thomazllr.demo.model.client.ClientRequest;
import com.thomazllr.demo.model.client.ClientResponse;
import com.thomazllr.demo.repository.ClientRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ClientService {

    private final ClientRepository repository;

    public Client create(Client entity) {
        return repository.save(entity);
    }

    public List<Client> findAll() {
        return repository.findAll();
    }
}
