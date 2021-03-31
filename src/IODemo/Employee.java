package IODemo;

import java.io.Serializable;
public class Employee implements Serializable
{
	private static final long serialVersionUID=1L;

	private int employeeId;
	private String employeesName;
	private String department;
	public Employee() {
		super();
		this.employeeId=101;
		this.employeesName="Kusuma";
		this.department="IT";
	}
	public Employee(int employeeId, String employeesName, String department) {
		super();
		this.employeeId = employeeId;
		this.employeesName = employeesName;
		this.department = department;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeesName() {
		return employeesName;
	}
	public void setEmployeesName(String employeesName) {
		this.employeesName = employeesName;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	//the to string method is used to display the objects directly
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeesName=" + employeesName + ", department=" + department
				+ "]";
	}
}
