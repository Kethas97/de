package com.sgic.defect.employee.dto;

public class DesignationDto {

	private long id;
    private String designation;
    private boolean approval;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public boolean isApproval() {
		return approval;
	}
	public void setApproval(boolean approval) {
		this.approval = approval;
	}
    
    
}
