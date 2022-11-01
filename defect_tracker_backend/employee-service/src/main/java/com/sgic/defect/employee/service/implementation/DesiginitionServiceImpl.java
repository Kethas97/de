package com.sgic.defect.employee.service.implementation;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;

import com.sgic.defect.employee.entities.Designation;
import com.sgic.defect.employee.repositories.DesiginationRepository;
import com.sgic.defect.employee.service.DesiginationService;

import net.bytebuddy.dynamic.DynamicType.Builder.FieldDefinition.Optional;

public class DesiginitionServiceImpl implements DesiginationService {

	@Autowired
    private DesiginationRepository designationRepo;

    public DesiginitionServiceImpl() {
    }

    public Designation saveDesignation(Designation designation) {
        return (Designation)this.designationRepo.save(designation);
    }

    public List<Designation> findAllDesignation() {
        return this.designationRepo.findAll();
    }



    public Designation updateDesignation(Designation designation, Long designation_id) {
        Designation desDB = (Designation)this.designationRepo.findById(designation_id).get();
        if (Objects.nonNull(designation.getDesignation_name())) {
            desDB.setDesignation_name(designation.getDesignation_name());
        }

        if (Objects.nonNull(designation.isApproval())) {
            desDB.setApproval(designation.isApproval());
        }

        return (Designation)this.designationRepo.save(desDB);
    }

    public String deleteDesignation(Long designation_id) {
        if (this.designationRepo.existsById(designation_id)) {
            this.designationRepo.deleteById(designation_id);
            return "designationID:" + designation_id + ": data deleted";
        } else {
            return "data doesn't exist";
        }
    }
}
