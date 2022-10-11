package com.xworkz.hosueDto;

import java.io.Serializable;

import com.xworkz.houseConstent.OwningType;
import com.xworkz.houseConstent.Type;

public class HouseDTO implements Serializable {
	
	private Integer id;
	private String name;
	private String owner;
	private Type type=Type.APARTMENT;
	private Integer noOfFloors;
	private Boolean loan;
	private OwningType owningType=OwningType.LEASE;
	private Double sqFeet;
	
	public HouseDTO() {
		System.out.println("This is Default Constructor of house");
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public Integer getNoOfFloors() {
		return noOfFloors;
	}

	public void setNoOfFloors(Integer noOfFloors) {
		this.noOfFloors = noOfFloors;
	}

	public Boolean getLoan() {
		return loan;
	}

	public void setLoan(Boolean loan) {
		this.loan = loan;
	}

	public OwningType getOwningType() {
		return owningType;
	}

	public void setOwningType(OwningType owningType) {
		this.owningType = owningType;
	}

	public Double getSqFeet() {
		return sqFeet;
	}

	public void setSqFeet(Double sqFeet) {
		this.sqFeet = sqFeet;
	}

	@Override
	public String toString() {
		return "HouseDTO [id=" + id + ", name=" + name + ", owner=" + owner + ", type=" + type + ", noOfFloors="
				+ noOfFloors + ", loan=" + loan + ", owningType=" + owningType + ", sqFeet=" + sqFeet + "]";
	}

	public HouseDTO(Integer id, String name, String owner, Type type, Integer noOfFloors, Boolean loan,
			OwningType owningType, Double sqFeet) {
		super();
		this.id = id;
		this.name = name;
		this.owner = owner;
		this.type = type;
		this.noOfFloors = noOfFloors;
		this.loan = loan;
		this.owningType = owningType;
		this.sqFeet = sqFeet;
	}
	
	
	
}
