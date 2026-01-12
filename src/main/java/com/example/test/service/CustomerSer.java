package com.example.test.service;

import com.example.test.entity.Customer;
import com.example.test.repo.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class CustomerSer {
    @Autowired
    private CustomerRepo repo;


    public ArrayList<Customer> get() {
        return repo.findAll();
    }
}
