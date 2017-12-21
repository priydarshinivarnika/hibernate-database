package com.common.details;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.id.insert.InsertSelectIdentityInsert;
import org.hibernate.sql.Insert;

public class StoreData {
	public static void main(String[] args) {

		// creating configuration object
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");// populates the data of the configuration file
		SessionFactory factory = cfg.buildSessionFactory();// creating session factory object
		Session session = factory.openSession();// creating session object
		Transaction t = session.beginTransaction();// creating transaction object

		EmployeeData e1 = new EmployeeData();
		
		e1.setEmpFirstName("First");
		e1.setEmpLastName("Name");
		e1.setEmpDepartment("Development");

		EmployeeData e2 = new EmployeeData();
		
		e2.setEmpFirstName("Second");
		e2.setEmpLastName("Name");
		e2.setEmpDepartment("Support");

		EmployeeData e3 = new EmployeeData();
	
		e3.setEmpFirstName("Third");
		e3.setEmpLastName("Name");
		e3.setEmpDepartment("Management");

		session.persist(e1);// persisting the object
		session.persist(e2);// persisting the object
		session.persist(e3);// persisting the object

		SkillData s1 = new SkillData();
		s1.setSkillId(01);
		s1.setSkillName("Excel");
		SkillData s2 = new SkillData();
		s2.setSkillId(02);
		s2.setSkillName("Java");
	
		session.persist(s1);
		session.persist(s2);
		
		EmployeesSkill empskill = new EmployeesSkill();
		for(EmployeesSkill eskill: empskill.getEs())
		{
			eskill.setEmpId(empskill.getEmpId());
			eskill.setSkillId(empskill.getSkillId());
				System.out.println("EmployeesSkill Table is Updated");
		}
		/*empskill.setEmpId(empskill.getEmpId());
		empskill.setSkillId(empskill.getSkillId());
		session.persist(empskill);
		*/
		t.commit();// transaction is committed
		session.close();
		System.out.println("successfully saved");

	}

}
