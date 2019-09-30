package com.xebia.retail.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xebia.retail.model.Employee;
import com.xebia.retail.repo.EmployeeRepo;

/**
 * 
 * @author ashish
 *
 */

@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	private EmployeeRepo employeeRepo;

	@Override
	public boolean isEmployee(Integer userId) {
		Optional<Employee> findById = employeeRepo.findById(userId);
		return findById.isPresent();
	}

}
