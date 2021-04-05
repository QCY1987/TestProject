package com.example.demo.controllers;

import com.example.demo.model.Product;
import com.example.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1")
public class ProductsRestController {

    private final ProductService productService;

    @Autowired
    public ProductsRestController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping(value = "/customers/{customerId}/products", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public List<Product> getAllCustomerProducts () {
       return productService.listAllCustomerProducts();
    }

    @PostMapping(value = "/customers/{customerId}/products", consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.CREATED)
    public void createCustomerProduct (@RequestBody Product product) {
        productService.createCustomerProduct(product);

      }
    @DeleteMapping("/products/{productId}")
    @ResponseStatus(HttpStatus.OK)
    public void deleteCustomerProducts (@PathVariable(name = "productId") Long productId) {
        productService.deleteCustomerProduct(productId);
    }

    @GetMapping(value = "/products/{productId}",produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public Product getCustomerProducts (@PathVariable(name = "productId") Long productId) {
        return productService.getCustomerProductById(productId);
    }

    @PutMapping(value = "/products/{productId}", consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void updateCustomer(@RequestBody Product product) {
        productService.updateCustomerProduct(product);
    }


}
