package com.sgic.defect.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sgic.defect.employee.entities.Designation;
import com.sgic.defect.employee.service.DesiginationService;

@RestController
@RequestMapping("employee")
public class DesiginitionController {
  @Autowired
  DesiginationService serviceImpl;
	
	@PostMapping("designation")
	public Designation createDesignation(@RequestBody Designation designation) {
		 return serviceImpl.saveDesignation(designation);
	}
		 
    @GetMapping("designation")
    public List<Designation> getAllDesignation() {
		return serviceImpl.findAllDesignation();
	}
    
    @PutMapping("designation/{designation_id}")
	public Designation updateDesignation(@RequestBody Designation designation, @PathVariable Long designation_id) {
		return serviceImpl.updateDesignation(designation, designation_id);
	}
    
    @DeleteMapping("designation/{designation_id}")
	public String deleteStudent(@PathVariable Long designation_id) {
		return serviceImpl.deleteDesignation(designation_id);
		
	}
  
  
	
	
	

}
