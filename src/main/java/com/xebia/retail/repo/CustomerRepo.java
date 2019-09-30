package com.xebia.retail.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.xebia.retail.model.Customer;

public interface CustomerRepo extends JpaRepository<Customer, Integer> {

}
