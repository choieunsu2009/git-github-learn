package com.example.test.dto;

import com.example.test.entity.Customer;

import java.time.LocalDate;

public class Dto {
    private Long id;
    private String name;
    private String phone;
    private String memo;
    private LocalDate createdAt;

    public Customer toEntity(){
        return new Customer(id, name, phone, memo, createdAt);
    }
}
