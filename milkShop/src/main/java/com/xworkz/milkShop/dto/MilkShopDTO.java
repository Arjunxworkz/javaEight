package com.xworkz.milkShop.dto;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Table;
@Entity
@Table(name="milkShop_info")
public class MilkShopDTO implements Serializable {
	
	private Integer id;
	private String brand;
	private String ownerName;
	private String type;
	private String ambassador;

	public MilkShopDTO() {
		System.out.println("Started " + this.getClass().getSimpleName());
	}

	public MilkShopDTO(Integer id, String brand, String ownerName, String type, String ambassador) {
		super();
		this.id = id;
		this.brand = brand;
		this.ownerName = ownerName;
		this.type = type;
		this.ambassador = ambassador;
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

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getAmbassador() {
		return ambassador;
	}

	public void setAmbassador(String ambassador) {
		this.ambassador = ambassador;
	}

	@Override
	public String toString() {
		return "MilkShopDTO [id=" + id + ", brand=" + brand + ", ownerName=" + ownerName + ", type=" + type
				+ ", ambassador=" + ambassador + "]";
	}

}
