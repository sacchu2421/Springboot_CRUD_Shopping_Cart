package com.demo.Shopping_Cart.Dto;

import java.util.List;
import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.demo.Shopping_Cart.Entity.Product;
import com.demo.Shopping_Cart.Entity.User;

public class CartDto {
	
	private int cartId;
	private  int quantity;
	private double amount;
	
	//@OneToMany(cascade=CascadeType.PERSIST, mappedBy="cart")
	private List <ProductDto> productDto;
	
	//@OneToOne
	
	//	@OneToMany(mappedBy = "cart")
	private List<Product> products;
	
	public List<Product> getProduct() {
		return products;
	}
	public void setProduct(List<Product> product) {
		this.products = product;
	}
	public int getCartId() {
		return cartId;
	}
	public void setCartId(int cartId) {
		this.cartId = cartId;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}

	public CartDto(int cartId, int quantity, double amount, List<Product> product, User user, List<Product> products) {
		super();
		this.cartId = cartId;
		this.quantity = quantity;
		this.amount = amount;
		this.productDto = productDto;
		//this.userDto = userDto;
		this.products = products;
	}
	public CartDto() {
		
	}
	
	@Override
	public String toString() {
		return "CartDto [cartId=" + cartId + ", quantity=" + quantity + ", amount=" + amount + ", productDto="
				+ productDto + ", products=" + products + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(amount, cartId, productDto, products, quantity);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CartDto other = (CartDto) obj;
		return Double.doubleToLongBits(amount) == Double.doubleToLongBits(other.amount) && cartId == other.cartId
				&& Objects.equals(productDto, other.productDto) && Objects.equals(products, other.products)
				&& quantity == other.quantity;
	}

}
