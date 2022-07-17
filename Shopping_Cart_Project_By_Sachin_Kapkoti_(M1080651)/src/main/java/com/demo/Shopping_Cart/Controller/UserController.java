package com.demo.Shopping_Cart.Controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.Shopping_Cart.Entity.User;
import com.demo.Shopping_Cart.Exceptions.UserDoesNotExistException;
import com.demo.Shopping_Cart.Service.UserService;

@RestController
public class UserController {
	
	Logger log = LoggerFactory.getLogger(UserController.class);

	
	@Autowired
	private UserService userService;
	
	@GetMapping("/")
	public String getMessage() {
		log.info("This is a Welcome Screen message for my CRUD app");
		return "Welcome to the crud Application on springboot created by Sachin kapkoti";
	}
	
	@PostMapping("/addUser")
	public User addUser(@RequestBody User user) {
		log.info("This will help in adding users to the database");
		log.warn("Exception can be raised in case of wrong value insertion");
		User user1 = this.userService.addUser(user);
		return user1;
		
	}
	
	@GetMapping("/user/{userId}")
	public User getUserById(@PathVariable int userId) throws UserDoesNotExistException {
		log.info("This will show user details by providing userId");
		log.warn("Exception like UserDoesNotExist can occur be aware");
		log.error("Internal server Error could raise in case of wrong insertion of endpoints");
		 User user =userService.getUserById(userId);
		 return user;
	}
	
	@DeleteMapping("/deleteUser/{userId}")
	public String deleteUserDetails(@PathVariable int userId) throws UserDoesNotExistException {
		log.info("This will delete user details by providing userId");
        log.warn("Kindly be good with userIds as insertion of wrong userid may lead to raise of an exception");
		User user = userService.deleteUserDetails(userId);
		return "User deleted Successfully";
	}
	@GetMapping("/users")
	public List<User> getAllUsers(){
		log.info("This will show all users with their details");
		return userService.getAllUser();
	}

	
	
	
	
	
	
	

}
