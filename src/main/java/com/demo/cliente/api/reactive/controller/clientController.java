package com.demo.cliente.api.reactive.controller;

import com.demo.cliente.api.reactive.model.Client;
import com.demo.cliente.api.reactive.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/v1/api/clients")
public class clientController {

    @Autowired
    private ClientService clientService;

    @GetMapping(produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Flux<Client> findAll()
    {
        return clientService.findAll();
    }

    @PostMapping(produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Mono<Client> create(@RequestBody Client client) {
        return clientService.create(client);
    }
}
