package com.example.demo.service;

import com.example.demo.model.Customer;
import com.example.demo.model.Product;
import com.example.demo.repository.CustomerReposirory;
import com.example.demo.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ProductServiceImpl implements ProductService {
    ProductRepository productRepository;
    CustomerReposirory customerReposirory;

    @Override
    public List<Product> listAllCustomerProducts() {

        return productRepository.findAll();
    }

    @Override
    public void createCustomerProduct(Product product) {
        productRepository.save(product);

    }

    @Override
    public void deleteCustomerProduct(Long productId) {
        Product deleteProduct = productRepository.findById(productId).orElse(null);
        productRepository.delete(deleteProduct);

    }

    @Override
    public Product getCustomerProductById(Long productId) {
        return productRepository.findById(productId).orElse(null);

    }

    @Override
    public void updateCustomerProduct(Product product) {

        productRepository.save(product);
    }
}