package com.thomazllr.demo.controller;

import com.thomazllr.demo.model.client.ClientMapper;
import com.thomazllr.demo.model.client.ClientRequest;
import com.thomazllr.demo.model.client.ClientResponse;
import com.thomazllr.demo.service.ClientService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/client")
public class ClientController {

    private final ClientService service;
    private final ClientMapper mapper;

    @PostMapping
    public ResponseEntity<ClientResponse> create(@RequestBody ClientRequest request) {
        var client = service.create(mapper.fromRequest(request));
        return ResponseEntity.status(HttpStatus.CREATED).body(mapper.toResponse(client));
    }

    @GetMapping
    public ResponseEntity<List<ClientResponse>> findAll() {
        var clients = service.findAll().stream().map(mapper::toResponse).toList();
        return ResponseEntity.ok(clients);
    }
}
