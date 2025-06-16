package com.va.week7;

public class Employee {
	
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", jobTitle=" + jobTitle + ", salary=" + salary
				+ "]";
	}
	
	

	
	public Employee() {
		
	}




	public Employee(int empId, String empName, String jobTitle, double salary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.jobTitle = jobTitle;
		this.salary = salary;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getJobTitle() {
		return jobTitle;
	}
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	private int empId;
	private String empName;
	private String jobTitle;
	private double salary;

}
