package com.demo.Shopping_Cart.Service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.demo.Shopping_Cart.Entity.User;
import com.demo.Shopping_Cart.Exceptions.UserDoesNotExistException;
@Service
@Transactional
@Component
public interface UserService {
	
  public User addUser(User user);
  
  public User getUserById(int userId) throws UserDoesNotExistException;
  
  public User deleteUserDetails(int userId) throws UserDoesNotExistException;
  
  public List<User> getAllUser();

}