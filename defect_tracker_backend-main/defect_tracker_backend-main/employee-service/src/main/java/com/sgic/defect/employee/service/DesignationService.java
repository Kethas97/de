package com.sgic.defect.employee.service;

import java.util.List;

import com.sgic.defect.employee.dto.DesignationDto;
import com.sgic.defect.employee.entities.Designation;

public interface DesignationService {

	

	 void saveDesignation(Designation designation);

		List<DesignationDto> getDesignationDtos();
		
		DesignationDto getDesignationDto(Long id);


	    void deleteDesignation(Long id);

	    void updateDesignation(Designation designation);





}
