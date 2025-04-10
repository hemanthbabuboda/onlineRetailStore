package com.onlineretailstore.cart.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.onlinereatilstore.cart.entity.Cart;

@Repository
public interface CartDao extends JpaRepository<Cart, Integer> {

}
