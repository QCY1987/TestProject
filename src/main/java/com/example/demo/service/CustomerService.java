package com.example.demo.service;

import com.example.demo.model.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> listAllCustomers();
    void createCustomer(Customer customer);
    void deleteCustomer (Long id);
    Customer getCustomer (Long id);
    void updateCustomer(Customer customer);

}
