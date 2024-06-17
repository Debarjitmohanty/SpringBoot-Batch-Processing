package com.app.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Serializable> {

}
