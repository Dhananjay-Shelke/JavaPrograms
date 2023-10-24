package CompanyEmployeeManagement;

import java.time.LocalDate;

//For PTE, hourly payment amount is also captured.
public class PartTimeEmp extends Employee {
	private int hourlySal;

	public PartTimeEmp( String name, LocalDate doj, String phone, String aadhar, int hourlySal) {
		super(name, doj, phone, aadhar);
		this.hourlySal = hourlySal;
	}

	public int getHourlySal() {
		return hourlySal;
	}

	public void setHourlySal(int hourlySal) {
		this.hourlySal = hourlySal;
	}
	@Override
	public String toString() {
		return "PartTimeEmp " +super.toString() + " Hourly Salary" + hourlySal;
	}
}
