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

@RunWith(SpringRunner.class)
@SpringBootTest
public class EmployeeTests {
	@Autowired
	private BillingController billingController;

	@Test
	public void whenEmployee_thenAccept() {
		assertTrue("Passed", 700 == billingController.getPayableAmount(1, 1000, Constants.FASHION.getValue(),
				UserTypeConstants.EMPLOYEE.getValue()));
	}

	@Test
	public void whenEmployee_thenReject() {
		assertFalse("Failed", 900 == billingController.getPayableAmount(1, 1000, Constants.FASHION.getValue(),
				UserTypeConstants.EMPLOYEE.getValue()));
	}

}
