package com.demo.Shopping_Cart.Service.Impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.Shopping_Cart.Entity.User;
import com.demo.Shopping_Cart.Exceptions.UserDoesNotExistException;
import com.demo.Shopping_Cart.Repository.UserRepository;
import com.demo.Shopping_Cart.Service.UserService;
@Service
@Transactional
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository userRepo;
	
	@Override
	public User addUser(User user) {
		
		return userRepo.save(user);
		
	}
	@Override
	  public User getUserById(int userId) throws UserDoesNotExistException {
		  return userRepo.findById(userId)
				  .orElseThrow(()-> new UserDoesNotExistException("There is no user found with this id"));
	  }
	
	@Override
	  public User deleteUserDetails(int userId) throws UserDoesNotExistException {
	//	User user1 = new User();
		User user =userRepo.findById(userId)
				.orElseThrow(()-> new UserDoesNotExistException("There is no user found with this id in order to delete provide valid details"));;
		
		 userRepo.delete(user);
		 return user;
		 		
		
		
		
	}
	@Override
	  public List<User> getAllUser(){
		
		return userRepo.findAll();
		  
	  }




}
