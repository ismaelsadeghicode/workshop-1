package com.mapsa.store.controller;

import com.mapsa.store.model.Customer;
import com.mapsa.store.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("customer")
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @RequestMapping
    public String customers(Model model) {
        List<Customer> customers = customerService.findAllCustomer();
        model.addAttribute("customers", customers);
        return "customer";
    }
}
