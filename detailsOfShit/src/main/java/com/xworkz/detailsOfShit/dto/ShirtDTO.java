package com.xworkz.detailsOfShit.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="shirt_info")
public class ShirtDTO {
	@Id
	@GenericGenerator( name="boss",strategy = "increment")
	@GeneratedValue(generator = "boss")
	private Integer id;
	private String brand;
	private String type;
	private Integer price;
	private String discount;
	private String quantity;
	private String gender;
	private String color;
	
	public ShirtDTO() {
		System.out.println("Shirt Dto Constructor");
	}

	public ShirtDTO(Integer id, String brand, String type, Integer price, String discount, String quantity,
			String gender, String color) {
		super();
		this.id = id;
		this.brand = brand;
		this.type = type;
		this.price = price;
		this.discount = discount;
		this.quantity = quantity;
		this.gender = gender;
		this.color = color;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public String getDiscount() {
		return discount;
	}

	public void setDiscount(String discount) {
		this.discount = discount;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "ShirtDTO [id=" + id + ", brand=" + brand + ", type=" + type + ", price=" + price + ", discount="
				+ discount + ", quantity=" + quantity + ", gender=" + gender + ", color=" + color + "]";
	}

		
}
