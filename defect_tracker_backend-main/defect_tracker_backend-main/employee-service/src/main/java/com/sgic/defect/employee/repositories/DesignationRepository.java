package com.sgic.defect.employee.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sgic.defect.employee.entities.Designation;

@Repository
public interface DesignationRepository extends JpaRepository<Designation, Long> {

	
}