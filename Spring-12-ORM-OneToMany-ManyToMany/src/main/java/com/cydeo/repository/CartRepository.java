package com.cydeo.repository;

import com.cydeo.model.Cart;
import com.cydeo.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartRepository extends JpaRepository<Cart, Long> {


}
