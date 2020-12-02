package com.cg.onlinepizza.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.onlinepizza.model.Customer;

public interface ICustomerRepository extends JpaRepository<Customer, Integer>{

   

}
