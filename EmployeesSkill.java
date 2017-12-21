package com.common.details;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "EMP_SKILL")
public class EmployeesSkill {
	@Id
	private EmployeeData empId;
	private SkillData skillId;
	private List<EmployeesSkill> es = new ArrayList<EmployeesSkill>();
	
	public List<EmployeesSkill> getEs() {
		return es;
	}

	public void setEs(List<EmployeesSkill> es) {
		this.es = es;
	}

	public EmployeesSkill() {

	}

	public EmployeesSkill(EmployeeData empId, SkillData skillId) {
		super();
		this.empId = empId;
		this.skillId = skillId;
	}

	public EmployeeData getEmpId() {
		return empId;
	}

	public void setEmpId(EmployeeData empId) {
		this.empId = empId;
	}

	public SkillData getSkillId() {
		return skillId;
	}

	public void setSkillId(SkillData skillId) {
		this.skillId = skillId;
	}
}
