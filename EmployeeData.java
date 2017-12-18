package com.common.details;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Emp")
public class EmployeeData {

	private int empId;
	private String empFirstName, empLastName, empSkill, empDepartment;
	
	

	@Id
	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpFirstName() {
		return empFirstName;
	}

	public void setEmpFirstName(String empFirstName) {
		this.empFirstName = empFirstName;
	}

	public String getEmpLastName() {
		return empLastName;
	}

	public void setEmpLastName(String empLastName) {
		this.empLastName = empLastName;
	}
	
	  public String getEmpSkill() { return empSkill; }
	 
	  public void setEmpSkill(String empSkill) { this.empSkill = empSkill; }
	 

	public String getEmpDepartment() {
		return empDepartment;
	}

	public void setEmpDepartment(String empDepartment) {
		this.empDepartment = empDepartment;
	}
	/*private SkillData skilldata = new SkillData();

	public SkillData getSkilldata() {
		return skilldata;
	}

	public void setSkilldata(SkillData skilldata) {
		this.skilldata = skilldata;
	}*/
}
