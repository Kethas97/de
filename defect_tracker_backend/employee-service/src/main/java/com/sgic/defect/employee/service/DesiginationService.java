package com.sgic.defect.employee.service;

import java.util.List;

import com.sgic.defect.employee.entities.Designation;


public interface DesiginationService {
    Designation saveDesignation(Designation var1);

    List<Designation> findAllDesignation();

    Designation updateDesignation(Designation var1, Long var2);

    String deleteDesignation(Long var1);
}
