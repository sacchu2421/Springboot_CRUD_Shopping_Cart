package com.demo.Shopping_Cart.Entity;

import java.util.List;
import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.demo.Shopping_Cart.Entity.Product;

@Entity
public class Cart {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cartId;
	private  int quantity;
	private double amount;
	
	@OneToMany(cascade=CascadeType.PERSIST, mappedBy="cart")
	private List <Product> product;
	
	@OneToOne
	private User user;
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}

	@OneToMany(mappedBy = "cart")
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

	public Cart(int cartId, int quantity, double amount, List<Product> product, User user, List<Product> products) {
		super();
		this.cartId = cartId;
		this.quantity = quantity;
		this.amount = amount;
		this.product = product;
		this.user = user;
		this.products = products;
	}
	public Cart() {
		
	}
	@Override
	public int hashCode() {
		return Objects.hash(amount, cartId, product, products, quantity, user);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cart other = (Cart) obj;
		return Double.doubleToLongBits(amount) == Double.doubleToLongBits(other.amount) && cartId == other.cartId
				&& Objects.equals(product, other.product) && Objects.equals(products, other.products)
				&& quantity == other.quantity && Objects.equals(user, other.user);
	}
	@Override
	public String toString() {
		return "Cart [cartId=" + cartId + ", quantity=" + quantity + ", amount=" + amount + ", product=" + product
				+ ", user=" + user + ", products=" + products + "]";
	}
	

}
