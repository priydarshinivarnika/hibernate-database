package com.common.details;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Skill")
public class SkillData {

	private int skillId;
	private String empSkill;

	@Id
	public int getSkillId() {
		return skillId;
	}

	public void setSkillId(int skillId) {
		this.skillId = skillId;
	}

	public String getEmpSkill() {
		return empSkill;
	}

	public void setEmpSkill(String empSkill) {
		this.empSkill = empSkill;
	}

}
