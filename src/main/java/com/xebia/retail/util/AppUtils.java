package com.xebia.retail.util;

public class AppUtils {
	public static Float getPercentage(float amount, int percentage) {
		return (amount * percentage) / 100;
	}

	public static Integer getCalculatedDiscount(float amount) {
		int noofCount = 0;
		if (amount >= 100) {
			noofCount = (int) (amount / 100);
		}
		return noofCount * 5;

	}

}
