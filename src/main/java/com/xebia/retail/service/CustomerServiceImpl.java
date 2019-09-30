package com.xebia.retail.service;

import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xebia.retail.model.Customer;
import com.xebia.retail.repo.CustomerRepo;

@Service
public class CustomerServiceImpl implements CustomerService {
	@Autowired
	private CustomerRepo customerRepo;

	@Override
	public boolean isOldCustomer(Integer userId) {
		boolean result = false;
		Optional<Customer> findById = customerRepo.findById(userId);
		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.YEAR, -2);
		Timestamp yearBack = new Timestamp(calendar.getTimeInMillis());
		if (findById.isPresent() && findById.get().getCreateAt().before(yearBack)) {
			result = true;
		}
		return result;
	}

}
