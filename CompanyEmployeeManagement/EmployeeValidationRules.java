package CompanyEmployeeManagement;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmployeeValidationRules {
	// parse and validate date of joining
	public static LocalDate parseAndValidateDOJ(String doj, Map<Integer, Employee> map) throws DateTimeException {
		return LocalDate.parse(doj);
	}

	// check phone number
	public static void checkPhone(String phone, Map<Integer, Employee> map) throws CustomExceptions {

		Pattern pattern = Pattern.compile("^\\d{10}$");
		Matcher matcher = pattern.matcher(phone);
		boolean b = matcher.matches();

		if (b == true) {
			System.out.println("Valid phone number");
		} 
		else {
			throw new CustomExceptions("Please enter 10 digit phone number, dont enter characters");
		}
		for (Employee e : map.values()) {
			if(e.getPhone().equals(phone))
				throw new CustomExceptions("Phone number already exists.");
		}

	}

	// check for aadhar number
	public static void checkAadhar(String aadhar, Map<Integer, Employee> map) throws CustomExceptions {
		Pattern pattern = Pattern.compile("^\\d{12}$");
		Matcher matcher = pattern.matcher(aadhar);
		boolean b = matcher.matches();
		
		if (b == true) {
			System.out.println("Valid Aadhar number");
		} else {
			throw new CustomExceptions("Please enter 12 digit phone number, dont enter characters");
		}
		for (Employee e : map.values()) {
			if (e.getAadhar().equals(aadhar))
				throw new CustomExceptions("Addhar already exists.");
		}
	}

	// validate all inputs for fullTimeEmployee
	public static Employee validateAllInputsFullTimeEmployee(String name, String doj, String phone, String aadhar,
			int monthlySal, Map<Integer, Employee> map) throws CustomExceptions {
		LocalDate doj2 = parseAndValidateDOJ(doj, map);
		checkPhone(phone, map);
		checkAadhar(aadhar, map);

		return new FullTimeEmp(name, doj2, phone, aadhar, monthlySal);
	}

	//// validate all inputs for partTimeEmployee
	public static Employee validateAllInputsPartTimeEmployee(String name, String doj, String phone, String aadhar,
			int hourhourlySal, Map<Integer, Employee> map) throws CustomExceptions {
		LocalDate doj2 = parseAndValidateDOJ(doj, map);
		checkPhone(phone, map);
		checkAadhar(aadhar, map);

		return new PartTimeEmp(name, doj2, phone, aadhar, hourhourlySal);
	}

}
