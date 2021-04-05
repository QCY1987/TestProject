package com.example.demo.service;

import com.example.demo.model.Product;

import java.util.List;

public interface ProductService {
    List<Product> listAllCustomerProducts();
    void createCustomerProduct (Product product);
    void deleteCustomerProduct (Long productId);
    Product getCustomerProductById (Long productId);
    void updateCustomerProduct (Product product);
}
