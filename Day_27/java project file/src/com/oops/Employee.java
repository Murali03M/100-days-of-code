package com.oops;

public class Employee {

	    private String empName;
	    private int empAge;
	    private int empId;
	    
	    
	    public Employee()
	    {
	    	
	    }


		public Employee(String empName, int empAge, int empId) {
			
			this.empName = empName;
			this.empAge = empAge;
			this.empId = empId;
		}


		public String getEmpName() {
			return empName;
		}


		public void setEmpName(String empName) {
			this.empName = empName;
		}


		public int getEmpAge() {
			return empAge;
		}


		public void setEmpAge(int empAge) {
			this.empAge = empAge;
		}


		public int getEmpId() {
			return empId;
		}


		public void setEmpId(int empId) {
			this.empId = empId;
		}


		@Override
		public String toString() {
			return "Employee [empName=" + empName + ", empAge=" + empAge + ", empId=" + empId + "]";
		}
	    
	    
	
}
