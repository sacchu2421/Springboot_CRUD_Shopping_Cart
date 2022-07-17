package com.demo.Shopping_Cart.Controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.Shopping_Cart.Entity.Apparal;
import com.demo.Shopping_Cart.Service.ApparalService;

@RestController
public class ApparalController {
	
	@Autowired
	private ApparalService apparalService;
	
	
	Logger log = LoggerFactory.getLogger(ApparalController.class);

	@PostMapping("/addApparal")
	public Apparal addApparalToProducts(@RequestBody Apparal apparal) {
		log.info("The product apparal got added in table product");
		return apparalService.addApparalToProducts(apparal);
	}

}
