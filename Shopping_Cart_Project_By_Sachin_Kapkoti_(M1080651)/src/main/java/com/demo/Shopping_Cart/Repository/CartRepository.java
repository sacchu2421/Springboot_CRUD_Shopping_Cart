package com.demo.Shopping_Cart.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.Shopping_Cart.Entity.Cart;
@Repository
public interface CartRepository extends JpaRepository<Cart,Integer>{

}
