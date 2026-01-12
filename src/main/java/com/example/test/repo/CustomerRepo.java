package com.example.test.repo;


import com.example.test.entity.Customer;
import org.jspecify.annotations.NullMarked;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;

public interface CustomerRepo extends CrudRepository<Customer, Long> {
    @Override
    @NullMarked
    ArrayList<Customer> findAll();
}
