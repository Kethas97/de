package com.sgic.defect.employee.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sgic.defect.employee.entities.Designation;

public interface DesiginationRepository extends JpaRepository<Designation, Long> {

}
