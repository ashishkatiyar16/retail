package com.xebia.retail.constant;

public enum UserTypeConstants {
	EMPLOYEE("employee"), AFFILIATUSER("affiliateuser"), CUSTOMER("customer");

	private String value;

	private UserTypeConstants(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}
}
