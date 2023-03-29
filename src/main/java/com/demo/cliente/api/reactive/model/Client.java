package com.demo.cliente.api.reactive.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Client {
    @Id
    private long id;
    private String name;
    private String lastName;
    private String identification;
    private String country;
    private String nationality;
    private String address;
    private String phone;
}
