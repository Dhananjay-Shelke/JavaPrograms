package CustomerManagementSystemProject;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*Customer management system
Supply Options
1. Sign up (customer registration)
2. Sign in (login)
i/p : email n password
3. Change password
i/p : email n old password n new password
4. Un subscribe customer
i/p : customer email

*/
public class TesterCMS {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			boolean exit = true;
			List<Customer> customerList = new ArrayList<>();
			while (exit) {
				System.out.println("*******************************************************"
						+ "\n1. Sign up (customer registration)\r\n" + "2. Sign in (login)\r\n"
						+ "3. Change password\r\n" + "4. Un subscribe customer \n5. Display all customers.\r\n"
						+ "0. Exit " + "\n*******************************************************");
				try {
					switch (sc.nextInt()) {
					case 1:
						System.out.println("FirstName, LastName, Email, Password, RegAmount, DOB(yyyy-mm-dd),Plan");
						Customer cust = ValidationRules.validateAllInputs(sc.next(), sc.next(), sc.next(), sc.next(), sc.nextDouble(),
								sc.next(), sc.next().toUpperCase(), customerList);
						customerList.add(cust);
						System.out.println("Signed Up Successfully...");
						break;
					case 2:
						System.out.println("Enter Email:");
						System.out.println("Enter Password:");
						ValidationRules.checkEmailAndPassword(sc.next(), sc.next(), customerList);

						break;
					case 3:
						System.out.println("Enter Email and Old password");
						System.out.println("Enter new Password:");
						ValidationRules.changePassword(sc.next(), sc.next(),sc.next(), customerList);

						break;
					case 4:
						System.out.println("Enter email:");
						ValidationRules.UnsubscribeCustomer(sc.next(), customerList);
						break;
					case 5:
						System.out.println("Present Customer on paltform...");
						for (Customer show : customerList)
							System.out.println(show);
						break;
					case 0:
						exit = false;
						System.out.println("EXIT SUCCESS!!!");
						System.out.println("Thanks for using Application.");
						break;
					default:
						break;
					}
				} catch (Exception e) {
					
					System.out.println(e.getMessage());
				}
			}
		}

	}

}
