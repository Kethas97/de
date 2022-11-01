package com.defectTracker.defect.controller;

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

import com.defectTracker.defect.dto.ReleaseDto;
import com.defectTracker.defect.entity.Release;
import com.defectTracker.defect.service.ReleaseService;



@RestController
public class ReleaseController {
	@Autowired
	ReleaseService releaseService;

	
	@PostMapping("/release")
	public ResponseEntity<Object> saveRelease(@RequestBody ReleaseDto releaseDto) {
		Release release = new Release();
		  BeanUtils.copyProperties(releaseDto, release);  
		  releaseService.saveRelease(release);
		return ResponseEntity.ok("save Successfully!");
	}
	
	
	 @GetMapping("/releases")
	    public ResponseEntity<Object> getReleases() {
		 List<ReleaseDto> releaseDtos = releaseService.getReleaseDtos();
		 return ResponseEntity.ok(releaseDtos);
}
	 
	 @GetMapping("/release/{id}")
	    public ResponseEntity<Object> getRelease(@PathVariable Long id) {
		 ReleaseDto releaseDto = releaseService.getReleaseDto(id);
		 return ResponseEntity.ok(releaseDto);
	 }
	 
	 @PutMapping("/release/{id}")
	    public ResponseEntity<Object> updateRelease(@RequestBody ReleaseDto releaseDto) {
		 
		 Release release = new Release();
	        BeanUtils.copyProperties(releaseDto, release);
	        releaseService.saveRelease(release);
	        return ResponseEntity.ok("Updated!");
	 }
	 
	 @DeleteMapping("/release/{id}")
	    public ResponseEntity<Object> deleteRelease(@PathVariable Long id) {
		 releaseService.deleteRelease(id);
		  return ResponseEntity.ok(id);
	 }
}
