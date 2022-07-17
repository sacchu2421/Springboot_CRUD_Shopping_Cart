package com.demo.Shopping_Cart.Dto;

import java.util.Objects;

import javax.persistence.OneToOne;

import com.demo.Shopping_Cart.Entity.Cart;

public class UserDto {
	
	private int userId;
	private String userName;
	private String address;
	
	//@OneToOne
	private CartDto cartDto;
	
	
	public CartDto getCartDto() {
		return cartDto;
	}
	public void setCartDto(CartDto cartDto) {
		this.cartDto = cartDto;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public UserDto(int userId, String userName, String address) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.address = address;
	}
	
	public UserDto() {
		
	}
	
	@Override
	public String toString() {
		return "UserDto [userId=" + userId + ", userName=" + userName + ", address=" + address + ", cartDto=" + cartDto
				+ "]";
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(address, cartDto, userId, userName);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserDto other = (UserDto) obj;
		return Objects.equals(address, other.address) && Objects.equals(cartDto, other.cartDto)
				&& userId == other.userId && Objects.equals(userName, other.userName);
	}
	


}
