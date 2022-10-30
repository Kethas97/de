package com.sgic.defect.employee.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sgic.defect.employee.entities.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
