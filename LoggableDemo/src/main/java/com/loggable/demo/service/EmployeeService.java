/**
 * 
 */
package com.loggable.demo.service;

import org.springframework.stereotype.Service;

import com.jcabi.aspects.Loggable;
import com.loggable.demo.model.Employee;

/**
 * @author rbhat
 *
 */
@Service
public class EmployeeService {

	public Employee createEmployee(String name){
		Employee e = new Employee();
		e.setName(name);
		return e;
	}
	
	@Loggable
	public Employee getEmployee(String name){
		Employee e = new Employee();
		e.setName(name);
		e.setAge("22");
		return e;
	}
}
