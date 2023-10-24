package CompanyEmployeeManagement;
//For FTE, monthly salary is also captured.

import java.time.LocalDate;

public class FullTimeEmp extends Employee {
	private int monthlySal;

	public FullTimeEmp(String name, LocalDate doj, String phone, String aadhar, int monthlySal) {
		super(name, doj, phone, aadhar);
		this.monthlySal = monthlySal;
	}

	public int getMonthlySal() {
		return monthlySal;
	}

	public void setMonthlySal(int monthlySal) {
		this.monthlySal = monthlySal;
	}

	@Override
	public String toString() {
		return "FullTimeEmp " +super.toString() + " Monthly Salary" + monthlySal;
	}

}
