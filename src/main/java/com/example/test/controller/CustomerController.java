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
    // 오브 콜스, 은삣삐...
    //은삣삐, 스탑 오버 띵킹.일단 좀 걸을까?
    @GetMapping("/")
    public String asdf(Model model){
        ArrayList<Customer> all = customerSer.get();
        model.addAttribute("datas", all);
        return "asdf";
    }
}
