package GroceryManagement;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GroceryTester {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			Map<String, Grocery> map = new HashMap<>();

			boolean exit = true;
			try {
				while (exit) {
					System.out.println("**************************************************************"
							+ "\n1.Add new grocery item to the list"
							+ "\n2.Update the quantity of a grocery item in stock"
							+ "\n3.Display the list of grocery items including their name,prices and quantities."
							+ "\n4.Remove all empty stock items(Quantity in stock is zero)"
							+ "\n5.Display all products for which stock updated (Quantity changes) in last 3 days."
							+ "\n0.Exit" + "\n**************************************************************");
					
					switch (sc.nextInt()) {
					case 1:
						Grocery g1 = new Grocery("Cup", 50, 2000, LocalDate.parse("2023-08-05"));
						Grocery g2 = new Grocery("Pen", 10, 4000, LocalDate.parse("2023-01-05"));
						Grocery g3 = new Grocery("Soap", 40, 5000, LocalDate.parse("2023-02-05"));
						Grocery g4 = new Grocery("Brush", 30, 1000, LocalDate.parse("2023-05-05"));
						Grocery g5 = new Grocery("Book", 100, 300, LocalDate.parse("2023-03-05"));
						
						map.put(g1.getName(), g1);
						map.put(g2.getName(), g2);
						map.put(g3.getName(), g3);
						map.put(g4.getName(), g4);
						map.put(g5.getName(), g5);
						break;
					case 2:
						System.out.println("Enter Item name and Stock quantity to update:");
						String name = sc.next();
						int quantity = sc.nextInt();
						
						map.get(name).setStock(quantity);
						map.get(name).setDate(LocalDate.now());
						break;
					case 3:
						map.values().forEach(p-> System.out.println(p));
						break;
					case 4:
						System.out.println(map.values().removeIf(p->p.getStock()==0));		
						break;
					case 5:
						LocalDate threeDays = LocalDate.now().minusDays(3);
						map.values().stream().filter(p-> p.getDate().isAfter(threeDays)).forEach(p->System.out.println(p));
//						System.out.println();
						break;
					case 0:
						exit = false;
						System.out.println("Exit Success\nThank you!!!");
						break;

					default:
						break;
					}
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}
}
