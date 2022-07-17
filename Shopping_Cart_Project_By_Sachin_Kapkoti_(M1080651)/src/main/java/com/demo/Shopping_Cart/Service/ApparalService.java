package com.demo.Shopping_Cart.Service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.demo.Shopping_Cart.Entity.Apparal;
import com.demo.Shopping_Cart.Repository.ApparalRepository;

@Service
@Transactional
@Component
public interface ApparalService {
	
	public Apparal addApparalToProducts(Apparal apparal);	

}
