package com.sgic.defect.employee.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(
	    name = "designation"
	)
public class Designation implements Serializable {
	 private static final long serialVersionUID = 1L;
	    @Id
	    @GeneratedValue(
	        strategy = GenerationType.AUTO
	    )
	    private Long designation_id;
	    private String designation_name;
	    private boolean approval;

	   //@ManyToOne(mappedBy="designationId")
	   private Employee employee;
	   
	   
	    
	    public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

		public Designation() {
	    }

	    public Designation(Long designation_id, String designation_name, boolean approval) {
	        this.designation_id = designation_id;
	        this.designation_name = designation_name;
	        this.approval = approval;
	    }

	    public Long getDesignation_id() {
	        return this.designation_id;
	    }

	    public void setDesignation_id(Long designation_id) {
	        this.designation_id = designation_id;
	    }

	    public String getDesignation_name() {
	        return this.designation_name;
	    }

	    public void setDesignation_name(String designation_name) {
	        this.designation_name = designation_name;
	    }

	    public boolean isApproval() {
	        return this.approval;
	    }

	    public void setApproval(boolean approval) {
	        this.approval = approval;
	    }

	    public static long getSerialversionuid() {
	        return 1L;
	    }
	

}
