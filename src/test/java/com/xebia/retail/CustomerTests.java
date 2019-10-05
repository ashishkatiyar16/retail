package com.xebia.retail;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.xebia.retail.constant.Constants;
import com.xebia.retail.constant.UserTypeConstants;
import com.xebia.retail.controller.BillingController;

import lombok.extern.slf4j.Slf4j;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class CustomerTests {
	@Autowired
	private BillingController billingController;

	@Test
	public void when_thenAccept() {
		assertTrue(950 == billingController.getPayableAmount(1, 1000, Constants.FASHION.getValue(),
				UserTypeConstants.CUSTOMER.getValue()));
	}

	@Test
	public void when_thenReject() {
		assertFalse(900 == billingController.getPayableAmount(1, 1000, Constants.FASHION.getValue(),
				UserTypeConstants.CUSTOMER.getValue()));
	}
	
	
	
	

}
