package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(name="products")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Product  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    @JoinColumn(name="customers_id", nullable=false)
    private Customer customer;

    @Column
    private String title;

    @Column
    private String description;

    @Column
    private double price;

    @Column
    private boolean is_deleted;

    @Column
    private LocalDateTime created_at;

    @Column
    private LocalDateTime modified_at;



    public Product(long id, Customer customer, String title, String description, double price, boolean is_deleted, LocalDateTime created_at, LocalDateTime modified_at) {
        this.id = id;
        this.customer = customer;
        this.title = title;
        this.description = description;
        this.price = price;
        this.is_deleted = is_deleted;
        this.created_at = created_at;
        this.modified_at = modified_at;
    }

    public Product() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Customer getCustomer () {
        return customer;
    }

    public void setCustomer (Customer customer) {
        this.customer = customer;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean getIs_deleted() {
        return is_deleted;
    }

    public void setIs_deleted(boolean is_deleted) {
        this.is_deleted = is_deleted;
    }

    public LocalDateTime getCreated_at() {
        return created_at;
    }

    public void setCreated_at(LocalDateTime created_at) {
        this.created_at = created_at;
    }

    public LocalDateTime getModified_at() {
        return modified_at;
    }

    public void setModified_at(LocalDateTime modified_at) {
        this.modified_at = modified_at;
    }
}
