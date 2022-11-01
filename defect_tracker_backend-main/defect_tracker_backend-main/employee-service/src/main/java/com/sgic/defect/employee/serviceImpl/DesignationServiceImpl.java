package com.sgic.defect.employee.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sgic.defect.employee.dto.DesignationDto;
import com.sgic.defect.employee.entities.Designation;
import com.sgic.defect.employee.repositories.DesignationRepository;
import com.sgic.defect.employee.service.DesignationService;

@Service
public class DesignationServiceImpl implements DesignationService {
    @Autowired
    private DesignationRepository designationRepository;

    
    @Override
    public void saveDesignation(Designation designation) {
        designationRepository.save(designation);
    }

 
    public List<DesignationDto> getDesignationDtos() {
		List<DesignationDto> designationDtos = new ArrayList<>();
        List<Designation> designations = designationRepository.findAll();

        for (Designation designation : designations) {
        	DesignationDto designationDto = new DesignationDto();
            BeanUtils.copyProperties(designation, designationDto);
            designationDtos.add(designationDto);
        }

        return designationDtos;
}
    
    
    @Override
	public DesignationDto getDesignationDto(Long id) {
    	Designation designation = designationRepository.findById(id).get();
    	DesignationDto designationDto = new DesignationDto();
        BeanUtils.copyProperties(designation, designationDto);

        return designationDto;
    }
    
    
    
    @Override
    @Transactional
    public void deleteDesignation(Long id) {
        designationRepository.deleteById(id);
    }

    @Override
    public void updateDesignation(Designation designation) {
    	Designation existingDesignation = designationRepository.findById(designation.getId()).get();
        BeanUtils.copyProperties(designation, existingDesignation);
        designationRepository.save(existingDesignation);
    }


}