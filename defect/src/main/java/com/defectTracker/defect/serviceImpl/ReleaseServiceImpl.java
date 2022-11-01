package com.defectTracker.defect.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.defectTracker.defect.dto.ReleaseDto;
import com.defectTracker.defect.entity.Release;
import com.defectTracker.defect.repository.ReleaseRepository;
import com.defectTracker.defect.service.ReleaseService;


@Service
public class ReleaseServiceImpl implements ReleaseService{

	@Autowired
	ReleaseRepository releaseRepository;


	@Override
	public void saveRelease(Release release) {
		releaseRepository.save(release);
    
	}
	
	public List<ReleaseDto> getReleaseDtos() {
		List<ReleaseDto> releaseDtos = new ArrayList<>();
        List<Release> releases = releaseRepository.findAll();

        for (Release release : releases) {
        	ReleaseDto releaseDto = new ReleaseDto();
            BeanUtils.copyProperties(release, releaseDto);
            releaseDtos.add(releaseDto);
        }

        return releaseDtos;
}
	
	@Override
	public ReleaseDto getReleaseDto(Long id) {
		Release release = releaseRepository.findById(id).get();
		ReleaseDto releaseDto = new ReleaseDto();
        BeanUtils.copyProperties(release, releaseDto);

        return releaseDto;
    }
	
	
	@Override
    public void updateRelease(Release release) {
		Release existingRelease = releaseRepository.findById(release.getId()).get();
        BeanUtils.copyProperties(release, existingRelease);
        releaseRepository.save(existingRelease);
    }

	
	@Override
	  @Transactional
	    public void deleteRelease(Long id) {
		releaseRepository.deleteById(id);
	    }
}
