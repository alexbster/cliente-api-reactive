package com.demo.cliente.api.reactive.controller;

import com.demo.cliente.api.reactive.service.ClientService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.demo.cliente.api.reactive.model.Client;

@SpringBootTest
public class ClientControllerTests {

    @Autowired
    private ClientService clientService;

    @Test
    public void test() {
        clientService.findAll().subscribe(System.out::println);
    }

    @Test
    public void create(){
        var client = new Client();
        client.setName("Juan");
        client.setLastName("Perez");
        client.setId(1);
        client.setAddress("SJ");
        client.setCountry("CR");
        client.setPhone("12345678");
        clientService.create(client).subscribe(System.out::println);
    }
}
