package com.sgic.defect.employee.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sgic.defect.employee.dto.EmployeeDto;
import com.sgic.defect.employee.entities.Employee;
import com.sgic.defect.employee.repositories.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	EmployeeRepository employeeRepository;


	@Override
	public void saveEmployee(Employee employee) {
		employeeRepository.save(employee);
    
	}
	
	public List<EmployeeDto> getEmployeeDtos() {
		List<EmployeeDto> employeeDtos = new ArrayList<>();
        List<Employee> employees = employeeRepository.findAll();

        for (Employee employee : employees) {
            EmployeeDto employeeDto = new EmployeeDto();
            BeanUtils.copyProperties(employee, employeeDto);
            employeeDtos.add(employeeDto);
        }

        return employeeDtos;
}
	
	@Override
	public EmployeeDto getEmployeeDto(Long id) {
        Employee employee = employeeRepository.findById(id).get();
        EmployeeDto employeeDto = new EmployeeDto();
        BeanUtils.copyProperties(employee, employeeDto);

        return employeeDto;
    }
	
	
	@Override
    public void updateEmployee(Employee employee) {
        Employee existingEmployee = employeeRepository.findById(employee.getId()).get();
        BeanUtils.copyProperties(employee, existingEmployee);
        employeeRepository.save(existingEmployee);
    }

	
	@Override
	  @Transactional
	    public void deleteEmployee(Long id) {
	        employeeRepository.deleteById(id);
	    }

}