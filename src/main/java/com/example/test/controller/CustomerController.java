package com.example.test.controller;

import com.example.test.entity.Customer;
import com.example.test.service.CustomerSer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;

@Controller
public class CustomerController {
    @Autowired
    private CustomerSer customerSer;

    @GetMapping("/")
    public String asdf(Model model){
        ArrayList<Customer> all = customerSer.get();
        model.addAttribute("datas", all);
        return "asdf";
    }
}
