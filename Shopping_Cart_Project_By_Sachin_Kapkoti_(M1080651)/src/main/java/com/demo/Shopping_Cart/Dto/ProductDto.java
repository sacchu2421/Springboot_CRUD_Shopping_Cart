package com.demo.Shopping_Cart.Dto;

import java.util.Objects;

import com.demo.Shopping_Cart.Dto.CartDto;

public class ProductDto {
	
	private int productId;
	private String productName;
	private double price;
	
//	@ManyToOne(cascade = CascadeType.PERSIST)
	private CartDto cartDto;
	
	
	public CartDto getCartDto() {
		return cartDto;
	}
	public void setCartDto(CartDto cartDto) {
		this.cartDto = cartDto;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public ProductDto(int productId, String productName, double price) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.price = price;
	}
	
	public ProductDto() {
		
	}
	
	@Override
	public String toString() {
		return "ProductDto [productId=" + productId + ", productName=" + productName + ", price=" + price + ", cartDto="
				+ cartDto + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(cartDto, price, productId, productName);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ProductDto other = (ProductDto) obj;
		return Objects.equals(cartDto, other.cartDto)
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price)
				&& productId == other.productId && Objects.equals(productName, other.productName);
	}
	


}
