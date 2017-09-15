/**
 * 
 */
package com.loggable.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.loggable.demo.model.Employee;
import com.loggable.demo.service.EmployeeService;

/**
 * @author rbhat
 *
 */
@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("/employee")
	public Employee createEmployee(){
		return employeeService.createEmployee("Ravindra");
	}
	
	@GetMapping("/employees")
	public Employee getEmployee(){
		return employeeService.getEmployee("Dinga");
	}

}
