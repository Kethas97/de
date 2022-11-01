package com.sgic.defect.employee.service;

import java.util.List;

import com.sgic.defect.employee.dto.EmployeeDto;
import com.sgic.defect.employee.entities.Employee;

public interface EmployeeService {
	
	void saveEmployee(Employee employee);
	
	List<EmployeeDto> getEmployeeDtos();

    void updateEmployee(Employee employee);

	void deleteEmployee(Long id);

	EmployeeDto getEmployeeDto(Long id);

	



	

}
