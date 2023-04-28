package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.example.demo.exception.EmployeeIDException;
import com.example.demo.exception.InValidEmployeeIDException;
import com.example.demo.service.EmployeeService;
import com.example.demo.vo.EmployeeVO;

import lombok.extern.slf4j.Slf4j;

/**
 * @author Sujith
 * @created 21-April-2023
 *
 */
@RestController
@Slf4j
@RequestMapping("Employee")
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;
	private static final Logger logger = LoggerFactory.getLogger(EmployeeController.class);
	@GetMapping("/get/{employeeID}")
	public EmployeeVO getEmployeeById(@PathVariable long employeeID)
			throws EmployeeIDException, InValidEmployeeIDException {
		logger.info("Getting user by ID: {}", employeeID );
		
		return employeeService.getEmployeeById(employeeID);
	}

}