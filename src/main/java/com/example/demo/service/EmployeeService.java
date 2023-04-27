package com.example.demo.service;

import com.example.demo.exception.InValidEmployeeIDException;
import com.example.demo.vo.EmployeeVO;

public interface EmployeeService {

	public EmployeeVO getEmployeeById(long employeeID) throws InValidEmployeeIDException;
}
