package com.demo.Shopping_Cart.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.Shopping_Cart.Entity.Apparal;
@Repository
public interface ApparalRepository extends JpaRepository< Apparal, Integer>{

}
