package com.xebia.retail.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.xebia.retail.constant.UserTypeConstants;
import com.xebia.retail.service.AffiliateUserService;
import com.xebia.retail.service.CustomerService;
import com.xebia.retail.service.EmployeeService;
import com.xebia.retail.util.AppUtils;

import lombok.extern.slf4j.Slf4j;
/**
 * 
 * @author ashish
 * 
 */
@Controller
@Slf4j
public class BillingController {

	@Autowired
	private EmployeeService employeeService;

	@Autowired
	private AffiliateUserService affiliateUserService;

	@Autowired
	private CustomerService customerService;

	/*
	 * 
	 * calaclute discount for all user's
	 */
	public float getPayableAmount(Integer userId, float netAmount, String billType, String userType) {
		float fAmount = 0.0f;
		float fPaidAmount = 0.0f;
		if (!com.xebia.retail.constant.Constants.GROCERIES.getValue().equals(billType)) {
			if (com.xebia.retail.constant.UserTypeConstants.EMPLOYEE.getValue().equals(userType)
					&& employeeService.isEmployee(userId)) {
				log.info("User is Employee :: {} ", userId);
				fAmount = AppUtils.getPercentage(netAmount, 30);
			} else if (UserTypeConstants.AFFILIATUSER.getValue().equals(userType)
					&& affiliateUserService.isUserExists(userId)) {
				log.info("User is affiliateuser :: {} ", userId);
				fAmount = AppUtils.getPercentage(netAmount, 10);
			} else if (UserTypeConstants.CUSTOMER.getValue().equals(userType)
					&& customerService.isOldCustomer(userId)) {
				log.info("User is customer :: {} ", userId);
				fAmount = AppUtils.getPercentage(netAmount, 5);
			}
		}

		fPaidAmount = netAmount - fAmount;
		fPaidAmount = fPaidAmount - AppUtils.getCalculatedDiscount(fPaidAmount);
		log.info("Final net amount to be paid :: {} ", fPaidAmount);
		return fPaidAmount;
	}

}
