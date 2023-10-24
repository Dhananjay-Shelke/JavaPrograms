package CompanyEmployeeManagement;
// Name, Date of joining, Phone Number, Aadhaar number  

import java.time.LocalDate;

public class Employee {
	private int empId;
	private String name;
	private LocalDate doj;
	private String phone;
	private String aadhar;
	private static int idGenerator = 100;

	public Employee(String name, LocalDate doj, String phone, String aadhar) {
		super();
		this.empId = ++idGenerator;
		this.name = name;
		this.doj = doj;
		this.phone = phone;
		this.aadhar = aadhar;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getDoj() {
		return doj;
	}

	public void setDoj(LocalDate doj) {
		this.doj = doj;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAadhar() {
		return aadhar;
	}

	public void setAadhar(String aadhar) {
		this.aadhar = aadhar;
	}

	@Override
	public String toString() {
		return "Employee [EmpId=" + empId + ", Name=" + name + ", Doj=" + doj + ", Phone=" + phone + ", Aadhar="
				+ aadhar + "]";
	}

}
