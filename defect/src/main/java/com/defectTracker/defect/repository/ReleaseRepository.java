package com.defectTracker.defect.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.defectTracker.defect.entity.Release;

@Repository
public interface ReleaseRepository extends JpaRepository<Release, Long> {

	
}