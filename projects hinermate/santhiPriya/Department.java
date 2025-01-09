package santhiPriya;

public class Department {
	String deptName;
	String deptHead;
	long deptHeadPhone;
	Employee emp;//reference to Employee class
	
	public Department(String deptName, String deptHead, long deptHeadPhone, Employee emp) {
		this.deptName = deptName;
		this.deptHead = deptHead;
		this.deptHeadPhone = deptHeadPhone;
		this.emp = emp;
	}
	
	public void displayDeptInfo() {
		System.out.println("Department Details ");
		System.out.println(deptName +" "+ deptHead +" "+deptHeadPhone);
		emp.displayInfo(); // employee class method
	}
	
}
