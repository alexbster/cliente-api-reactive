package com.demo.cliente.api.reactive.service;

import com.demo.cliente.api.reactive.model.Client;
import com.demo.cliente.api.reactive.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class ClientService {

    @Autowired
    private ClientRepository clientRepository;

    public Flux<Client> findAll()
    {
        return clientRepository.findAll();
    }

    public Mono<Client> create(Client employee) {
        return clientRepository.save(employee);
    }
}
