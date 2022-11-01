package com.defectTracker.defect.service;

import java.util.List;

import com.defectTracker.defect.dto.ReleaseDto;
import com.defectTracker.defect.entity.Release;


public interface ReleaseService {

	void saveRelease(Release release);
	
	List<ReleaseDto> getReleaseDtos();

    void updateRelease(Release release);

    void deleteRelease(Long id);

	ReleaseDto getReleaseDto(Long id);

	
}
