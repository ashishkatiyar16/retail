package com.xebia.retail.constant;

public enum Constants {
	GROCERIES("groceries"), FASHION("fashion");

	private String value;

	private Constants(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}
}
