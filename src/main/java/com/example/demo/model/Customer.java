package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.time.LocalDateTime;
import java.util.Set;

@Entity
@Table (name = "customers")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Customer  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private String title;

    @Column
    private boolean is_deleted;

    @Column
    private LocalDateTime created_at;

    @Column
    private LocalDateTime modified_at;

    @OneToMany (mappedBy = "customer_id", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<Product> products;

    public Customer(long id, String title, boolean is_deleted, LocalDateTime created_at, LocalDateTime modified_at, Set<Product> products) {
        this.id = id;
        this.title = title;
        this.is_deleted = is_deleted;
        this.created_at = created_at;
        this.modified_at = modified_at;
        this.products = products;
    }

    public Customer() {

    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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

    public Set<Product> getProducts() {
        return products;
    }

    public void setProducts(Set<Product> products) {
        this.products = products;
    }
}
