package com.sgic.defect.employee.controller;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sgic.defect.employee.dto.EmployeeDto;
import com.sgic.defect.employee.entities.Employee;
import com.sgic.defect.employee.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;

	
	@PostMapping("/employee")
	public ResponseEntity<Object> saveEmployee(@RequestBody EmployeeDto employeeDto) {
		  Employee employee = new Employee();
		  BeanUtils.copyProperties(employeeDto, employee);  
		employeeService.saveEmployee(employee);
		return ResponseEntity.ok("save Successfully!");
	}
	
	
	 @GetMapping("/employees")
	    public ResponseEntity<Object> getEmployees() {
		
		 List<EmployeeDto> employeeDtos = employeeService.getEmployeeDtos();
		 return ResponseEntity.ok(employeeDtos);
}
	 
	 @GetMapping("/employee/{id}")
	    public ResponseEntity<Object> getEmployee(@PathVariable Long id) {
		 EmployeeDto employeeDto = employeeService.getEmployeeDto(id);
		 return ResponseEntity.ok(employeeDto);
	 }
	 
	 @PutMapping("/employee/{id}")
	    public ResponseEntity<Object> updateEmployee(@RequestBody EmployeeDto employeeDto) {
		 
		 Employee employee = new Employee();
	        BeanUtils.copyProperties(employeeDto, employee);
	        employeeService.saveEmployee(employee);
	        return ResponseEntity.ok("Updated!");
	 }
	 
	 @DeleteMapping("/employee/{id}")
	    public ResponseEntity<Object> deleteEmployee(@PathVariable Long id) {
		 employeeService.deleteEmployee(id);
		  return ResponseEntity.ok(id);
	 }
}
