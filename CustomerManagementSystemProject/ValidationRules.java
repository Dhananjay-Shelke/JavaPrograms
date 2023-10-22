package CustomerManagementSystemProject;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.List;

/*4. validation rules
4.1 no dup customers 
(i.e if the customer tries to register using existing email , throw exception)

4.2 Validate plan
plan must be of supported types

4.3 reg amount must match with the plan*/
public class ValidationRules {
	// check foe duplicate email
	public static void checkEmail(List<Customer> customers, String email) throws CustomerExceptionClass {
		if (customers.contains(new Customer(email)))
			throw new CustomerExceptionClass("Email already exists,Please Try with another Email...");
	}

	// checking for correct enum
	public static ServicePlan validatePlan(String plan) throws CustomerExceptionClass {
		if (ServicePlan.valueOf(plan) == null)
			throw new CustomerExceptionClass("Plan not availble");
		return ServicePlan.valueOf(plan.toUpperCase());
	}

	// check amount matches with plan or not
	public static void checkRegAmount(double regAmount, ServicePlan plan) throws CustomerExceptionClass {
		if (regAmount != plan.getCharges())
			throw new CustomerExceptionClass(
					"Amount does not matches with plan, please select correct amount" + ServicePlan.values());
	}

	// check for DOB
	public static LocalDate checkDOB(String dob) throws DateTimeException {
		return LocalDate.parse(dob);
	}

	// validate all inputs taken form user
	public static Customer validateAllInputs(String firstName, String lastName, String email, String password,
			double regAmount, String dob, String plan, List<Customer> customers) throws CustomerExceptionClass {
		checkEmail(customers, email);
		ServicePlan validatedPlan = validatePlan(plan);
		checkRegAmount(regAmount, validatedPlan);
		LocalDate validatedDate = checkDOB(dob);
		return new Customer(firstName, lastName, email, password, regAmount, validatedDate, validatedPlan);

	}

	// check email,password for sign in
	public static void checkEmailAndPassword(String email, String password, List<Customer> customers)
			throws CustomerExceptionClass {
		Customer c = new Customer(email);
		for (Customer c1 : customers) {
			if (c1.equals(c) && c1.getPassword().equals(password))
				System.out.println("Successfully loged in...");
			return;
		}

		throw new CustomerExceptionClass("Invalid EMail");
	}

	// method for Change Password
	public static void changePassword(String email, String password,String newPass, List<Customer> customerList)
			throws CustomerExceptionClass {
		Customer c = new Customer(email);
		for (Customer c1 : customerList) {
			if (c.equals(c1) && c1.getPassword().equals(password)) {
				c1.setPassword(newPass);
				System.out.println("Password Updated...");
				return;
			}
		}
		throw new CustomerExceptionClass("Invalid Credentials");
	}
	
	//Unsubscribe Customer
	public static void UnsubscribeCustomer (String email,List<Customer> customerList) throws CustomerExceptionClass
	{
		for(Customer c : customerList)
		{
			if(c.getEmail().equals(email))
			{
				customerList.remove(c);
				System.out.println("Unsubscribed Succesfully...");
				return;
			}
		}
		throw new CustomerExceptionClass("Email not Found");
	}
}
