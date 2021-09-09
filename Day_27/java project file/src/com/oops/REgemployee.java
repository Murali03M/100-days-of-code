package com.oops;

public class REgemployee extends Employee {
	
	private int salary;

	public REgemployee() {
		super();
		
	}

	public REgemployee(String empName, int empAge, int empId,int salary) {
		super(empName, empAge, empId);
		this.salary=salary;
		
	}
	public int getSalary()
	{
		return salary;
	}
	public void setSalary(int salary)
	{
		this.salary=salary;
	}

	@Override
	public String toString() {
		return "REgemployee [salary=" + salary + "empName=" + getEmpName() + ", empAge=" + getEmpAge() + ", empId=" + getEmpId() + "]";
	}



	
   
	
}
