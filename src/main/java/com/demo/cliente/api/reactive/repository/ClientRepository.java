package com.demo.cliente.api.reactive.repository;

import com.demo.cliente.api.reactive.model.Client;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface ClientRepository extends ReactiveMongoRepository<Client, Long> {
}
