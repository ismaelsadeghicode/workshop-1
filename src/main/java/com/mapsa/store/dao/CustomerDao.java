package com.mapsa.store.dao;

import com.mapsa.store.model.Customer;

import java.util.List;

public interface CustomerDao {
    List<Customer> findAllCustomer();
}
