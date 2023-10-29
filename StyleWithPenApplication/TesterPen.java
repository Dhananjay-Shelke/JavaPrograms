package StyleWithPenApplication;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import static StyleWithPenApplication.ValidationRules.*;

public class TesterPen {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			boolean exit = true;
			Map<Integer, Pen> map = new HashMap<>();
		
			while (exit) {
				System.out.println("*********************************************************************************"
						+ "\n1.   Add new Pen" + "\n2.   Update stock of aPen"
						+ "\n3.   Set discount of 20% for all the pens which are not at all sold in last 3 months"
						+ "\n4.   Remove Pens which are never sold once listed in 9 months"
						+ "\n5.   Show all Pens \n0.   Exit"
						+ "\n*********************************************************************************");
				int choice = sc.nextInt();
				try {
					switch (choice) {
					case 1:
						System.out.println(
								"Enter  color, inkColor, stock, listingDate, price, brand, mterial:");
						Pen p = valildateAllInputs(sc.next(), sc.next(), sc.nextInt(), sc.next(), sc.nextInt(),
								 sc.next(), sc.next(), map);
						map.put(p.getId(), p);
						System.out.println("Pen Added Successfully...");
						break;
					case 2:
						System.out.println("TO update Stock of pen enter Id:");
						int id = sc.nextInt();
						System.out.println("Enter Stock quantity:");
						int stock = sc.nextInt();
						updateStock(id, stock, map);
						break;
					case 3:
						for(Pen P : map.values())
						{
							if(P.getListingDate().isBefore(LocalDate.now().minusMonths(3))){
								P.updateDiscount(20);
								P.setDiscount(20);
								System.out.println("discount of 20% applied for"+ P.getBrand());
							}
						}
						break;
					case 4:
						System.out.println("Pens which are never sold once listed in 9 months");
						map.values().removeIf(p2->p2.getListingDate().isBefore(LocalDate.now().minusMonths(9)));
						break;	
					case 5:
						map.values().forEach(p1 -> System.out.println(p1));
						break;
					case 0:
						exit = false;
						System.out.println("Exit Success\nThank you!!!");
						break;

					default:
						if(choice<0 || choice>5)
							System.out.println("Choose Valid Choice...");
						break;
					}

				} catch (Exception e) {
					System.out.println(e.getMessage());
					e.printStackTrace();
				}
			}
		}

	}
}

