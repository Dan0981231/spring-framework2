package com.cydeo.repository;

import com.cydeo.model.Customer;
import com.cydeo.model.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {



}
