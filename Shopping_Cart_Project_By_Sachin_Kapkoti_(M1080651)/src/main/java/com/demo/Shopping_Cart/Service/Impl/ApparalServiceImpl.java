package com.demo.Shopping_Cart.Service.Impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.Shopping_Cart.Entity.Apparal;
import com.demo.Shopping_Cart.Repository.ApparalRepository;
import com.demo.Shopping_Cart.Service.ApparalService;

@Service
@Transactional
public class ApparalServiceImpl implements ApparalService {
	
	@Autowired
	private ApparalRepository apparalRepo;
	
	public Apparal addApparalToProducts(Apparal apparal) {
		return apparalRepo.save(apparal);
		
		
	}


}
