package com.mapsa.store.service;

import com.mapsa.store.dao.impl.CustomerDaoImpl;
import com.mapsa.store.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {
    @Autowired
    CustomerDaoImpl customerDaoImpl;

    public List<Customer> findAllCustomer() {
        return customerDaoImpl.findAllCustomer();
    }
}
