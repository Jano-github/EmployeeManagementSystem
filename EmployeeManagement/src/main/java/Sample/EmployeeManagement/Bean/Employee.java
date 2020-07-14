package Sample.EmployeeManagement.Bean;

import java.io.Serializable;
import java.util.Date;

public class Employee implements Serializable {
	
	transient Integer empId;
	
	public String empName;
	
	public static int refId;
	
	public String address;
	
	public String dob;
	
	public String doj;
	
	public String department;
	
	public Integer salary;
	
	public Employee() {
		
	}
	
	public Employee(int empId, String empName, String address, String dob, String doj, String department,int salary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.address = address;
		this.dob = dob;
		this.doj = doj;
		this.department = department;
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

	public static int getRefId() {
		return refId;
	}

	public static void setRefId(int refId) {
		Employee.refId = refId;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getDoj() {
		return doj;
	}

	public void setDoj(String doj) {
		this.doj = doj;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
	
	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", address=" + address + ", dob=" + dob + ", doj="
				+ doj + ", department=" + department + "]";
	}	
	
}
