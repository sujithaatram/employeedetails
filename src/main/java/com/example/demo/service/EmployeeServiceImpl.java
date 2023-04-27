package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Employee;
import com.example.demo.exception.InValidEmployeeIDException;
import com.example.demo.repository.EmployeeRepository;
import com.example.demo.vo.EmployeeVO;


@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	EmployeeRepository employeeRepository;

	@Override
	public EmployeeVO getEmployeeById(long employeeID) throws InValidEmployeeIDException {
		Employee employee = employeeRepository.findById(employeeID).orElseThrow(
				() -> new InValidEmployeeIDException("Invalid EmployeeId : " + employeeID));
		EmployeeVO employeeVO = new EmployeeVO(employee.getEmployeeID(), employee.getEmployeeName(), employee.getDateOfBirth());
		return employeeVO;
	}
	

}
