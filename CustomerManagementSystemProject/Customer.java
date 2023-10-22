package CustomerManagementSystemProject;
/*Customer management system
Supply Options
1. Sign up (customer registration)
2. Sign in (login)
i/p : email n password
3. Change password
i/p : email n old password n new password
4. Un subscribe customer
i/p : customer email

5. Display all customers.
0. Exit 

Design 
Identify the core classes/enums involved
1. Customer class (core class)
state  : customer id(int) ,first name, last name (string),email(string),password(string),registrationAmount(double),dob(LocalDate),plan(ServicePlan : enum)
idGenerator : static 
Must generate customer ids automatically : auto increment)
PK(UID) : email

ctors 
1. all args ctor
2. PK based ctor

Will you need to override toString n equals ?


2. ServicePlan : enum
ServicePlan charges : 
SILVER : 1000 
GOLD : 2000
DIAMOND : 5000
PLATINUM : 10000


3. custom exception class

4. validation rules
4.1 no dup customers 
(i.e if the customer tries to register using existing email , throw exception)

4.2 Validate plan
plan must be of supported types

4.3 reg amount must match with the plan


5. Tester, with UI , scanner
Create a template as discussed n test the functionality

*/

import java.time.LocalDate;
import java.util.Objects;

public class Customer implements Comparable{
	private int id;
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private double regAmount;
	LocalDate dob;
	ServicePlan plan;
	private static int idGenerator = 0;
	
	//Constructor calling
	public Customer( String firstName, String lastName, String email, String password, double regAmount,
			LocalDate dob, ServicePlan plan) {
		super();
		this.id = ++idGenerator;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.regAmount = regAmount;
		this.dob = dob;
		this.plan = plan;
	}

	@Override
	public String toString() {
		return "Customer [Id=" + id + ", FirstName=" + firstName + ", LastName=" + lastName + ", Email=" + email
				+ ", Password=" + password + ", RegAmount=" + regAmount + ", DOB=" + dob + ", Plan=" + plan + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		return Objects.equals(email, other.email);
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public double getRegAmount() {
		return regAmount;
	}

	public void setRegAmount(double regAmount) {
		this.regAmount = regAmount;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public ServicePlan getPlan() {
		return plan;
	}

	public void setPlan(ServicePlan plan) {
		this.plan = plan;
	}

	public Customer(String email) {
		super();
		this.email = email;
	}

	@Override
	public int compareTo(Object o) {
		return email.compareTo((((Customer) o).getEmail()));
	}
	
}
	
	
	
	
	
	
	
	
	
	

