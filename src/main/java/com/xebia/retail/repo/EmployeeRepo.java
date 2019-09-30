package com.xebia.retail.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.xebia.retail.model.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

}
