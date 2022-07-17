package com.demo.Shopping_Cart.Dto;

import java.util.Objects;

import com.demo.Shopping_Cart.Entity.Product;

public class ApparalDto {
	
	private String brand;
	private String type;
	private String design;
	
	
	public ApparalDto(int apparalId, String brand, String type, String design, Product products) {
		super();
		this.brand = brand;
		this.type = type;
		this.design = design;
	}
	
	public ApparalDto() {
		
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getDesign() {
		return design;
	}
	public void setDesign(String design) {
		this.design = design;
	}

	@Override
	public int hashCode() {
		return Objects.hash(brand, design, type);
	}

	@Override
	public String toString() {
		return "ApparalDto [brand=" + brand + ", type=" + type + ", design=" + design + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ApparalDto other = (ApparalDto) obj;
		return Objects.equals(brand, other.brand) && Objects.equals(design, other.design)
				&& Objects.equals(type, other.type);
	}
	

}
