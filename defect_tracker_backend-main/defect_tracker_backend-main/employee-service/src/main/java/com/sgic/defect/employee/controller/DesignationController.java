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

import com.sgic.defect.employee.dto.DesignationDto;
import com.sgic.defect.employee.entities.Designation;
import com.sgic.defect.employee.service.DesignationService;

@RestController
public class DesignationController {
    @Autowired
    private DesignationService designationService;

   
    @PostMapping("/designation")
    public ResponseEntity<Object> addDesignation(@RequestBody DesignationDto designationdto) {
      
        Designation designation = new Designation();
        BeanUtils.copyProperties(designationdto, designation);
        designationService.saveDesignation(designation);
        return ResponseEntity.ok("save Successfully!");
    }

    
    @GetMapping("/designations")
    public ResponseEntity<Object> getAllDesignations() {
        List<DesignationDto> designationDtos= designationService.getDesignationDtos();
        return ResponseEntity.ok(designationDtos);

    }

 
    @GetMapping("/designation/{id}")
    public ResponseEntity<Object> getDesignation(@PathVariable Long id) {
    	DesignationDto designationDto= designationService.getDesignationDto(id);
    	 return ResponseEntity.ok(designationDto);

    }

  
    @DeleteMapping("/designation/{id}")
    public ResponseEntity<Object> deleteDesignation(@PathVariable Long id) {
        
        designationService.deleteDesignation(id);
        return ResponseEntity.ok(id);
    }

   
    @PutMapping("/designation/{id}")
    public ResponseEntity<Object> updateDesignation(@RequestBody DesignationDto designationDto) {
        Designation designation = new Designation();
        BeanUtils.copyProperties(designationDto, designation);
        designationService.updateDesignation(designation);
        return ResponseEntity.ok("Updated!");
    }
}