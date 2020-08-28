package com.mapsa.store.dao.impl;

import com.mapsa.store.dao.CustomerDao;
import com.mapsa.store.model.Customer;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public class CustomerDaoImpl implements CustomerDao {
    @Autowired
    SessionFactory sessionFactory;
    @Override
    public List<Customer> findAllCustomer() {
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("from Customer");
        List<Customer> customerList= query.list();
        session.flush();
        return customerList;
    }
}
