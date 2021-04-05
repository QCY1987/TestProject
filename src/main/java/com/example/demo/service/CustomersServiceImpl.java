package com.example.demo.service;

import com.example.demo.model.Customer;
import com.example.demo.repository.CustomerReposirory;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomersServiceImpl implements CustomerService {
    CustomerReposirory customerReposirory;

    @Override
    public List<Customer> listAllCustomers() {

        return customerReposirory.findAll();
    }

    @Override
    public void createCustomer(Customer customer) {

        customerReposirory.save(customer);
    }

    @Override
    public void deleteCustomer(Long id) {
        customerReposirory.deleteById(id);

    }

    @Override
    public Customer getCustomer(Long id) {
        return customerReposirory.findById(id).orElse(null);
    }

    @Override
    public void updateCustomer(Customer customer) {

        customerReposirory.save(customer);

    }
}
