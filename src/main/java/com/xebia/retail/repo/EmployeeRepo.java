package com.xebia.retail.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.xebia.retail.model.Employee;
/**
 * 
 * @author ashish
 *
 * Employee Repository interfaces
 */
public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

}
