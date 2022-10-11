package com.xworkz.houseConstent;

public enum Type {
	
	APARTMENT("apartment"), INDIVIDUAL("individula"), VILLA("villa");

	private String value;

	private Type(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}
}
