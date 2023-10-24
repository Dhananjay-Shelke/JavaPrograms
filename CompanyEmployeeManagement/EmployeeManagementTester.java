package CompanyEmployeeManagement;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EmployeeManagementTester {

	public static void main(String[] args) throws CustomExceptions {
//Same collection class is used to store both FTE and PTE	
		Map<Integer, Employee> map = new HashMap<>();
		boolean exit = true;

		try (Scanner sc = new Scanner(System.in)) {
			
				while (exit) {
					try {
					System.out.println("*********************************************************\n"
							+ "1.Add full time employee\r\n" + "2.Add part time employee\r\n"
							+ "3.Delete an employee by Emp Id\r\n" + "4.Search employee details by Aadhaar number\r\n"
							+ "5.Display all employee details\r\n"
							+ "6.Display all employee details sorted by date of joining\r\n" + "0.Exit\r\n"
							+ "*********************************************************");
					switch (sc.nextInt()) {
					case 1:
						System.out.println("Enter Employee Name, DOJ, Phone number, Aadhar number, Monthly Salary");
						FullTimeEmp f = (FullTimeEmp) EmployeeValidationRules.validateAllInputsFullTimeEmployee(
								sc.next(), sc.next(), sc.next(), sc.next(), sc.nextInt(), map);
						System.out.println("Full time employee added Successfully");
						map.put(f.getEmpId(), f);
						break;
					case 2:
						System.out.println("Enter Employee Name, DOJ, Phone number, Aadhar number,Hourly Salary");
						PartTimeEmp p = (PartTimeEmp) EmployeeValidationRules.validateAllInputsPartTimeEmployee(
								sc.next(), sc.next(), sc.next(), sc.next(), sc.nextInt(), map);
						System.out.println("Part time employee added Successfully");
						map.put(p.getEmpId(), p);
						break;
					case 3:
						System.out.println("Enter EmpId to delete employee:");
						int id = sc.nextInt();
						System.out.println(map.remove(id).getName() + " " + "Id=" + id + " employee removed");

						break;
					case 4:
						System.out.println("Enter Aadhar number: ");
						String aadhar = sc.next();
						EmployeeValidationRules.checkAadhar(aadhar, map);
						map.values().stream().filter(pa -> pa.getAadhar().equals(aadhar))
								.forEach(p1 -> System.out.println(p1));
						break;
					case 5:
						map.values().forEach(p3 -> System.out.println(p3));
						break;
					case 6:
						map.values().stream().sorted(Comparator.comparing(Employee::getDoj))
								.forEach(p4 -> System.out.println(p4));
						break;
					case 0:
						exit = false;
						System.out.println("Exit Success\nThank you!!!");
						break;

					default:
						break;
					}

				}catch (Exception e) {
					System.out.println(e.getMessage());
					e.printStackTrace();
					sc.nextLine();
			} 
			}
		}

	}

}
