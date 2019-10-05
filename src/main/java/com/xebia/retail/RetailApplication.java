package com.xebia.retail;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.xebia.retail.constant.UserTypeConstants;
import com.xebia.retail.controller.BillingController;

import lombok.extern.slf4j.Slf4j;
/**
 * 
 * @author ashish
 * Sprign boot application main classs. it is entry point of application.
 */
@SpringBootApplication
@Slf4j
public class RetailApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(RetailApplication.class, args);
		BillingController bean = ctx.getBean(BillingController.class);
		log.info("net Payable amount :: {}",
				bean.getPayableAmount(1, 5000, "Fashion", UserTypeConstants.EMPLOYEE.getValue()));

	}

}
