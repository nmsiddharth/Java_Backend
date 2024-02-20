package com.One_T0_One;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Department_data {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int deptId;
	private String deptName;
	
	@OneToOne(mappedBy="department")
	
	private Employee_data emp;
	
	public Employee_data getEmp() {
		return emp;
	}
	public void setEmp(Employee_data emp) {
		this.emp = emp;
	}
	
	public Department_data() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getDeptId() {
		return deptId;
	}
	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	
	
	
}
