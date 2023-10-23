package CricketerAppl;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CricketerTest {

	public static void main(String[] args) {
		boolean exit = true;

		Map<String, Cricketer> map = new HashMap<>();
		try (Scanner sc = new Scanner(System.in)) {
			while (exit) {
				try {
					System.out.println("***************************************************************\n"
							+ "1.Accept minimum 5 Cricketers in the collection.\r\n" + "2.Modify Cricketer's rating\r\n"
							+ "3.Search Cricketer by name\r\n" + "4.Display all Cricketers added in collection.\r\n"
							+ "5.Display All Cricketers in sorted form by rating.\n" + "6.Search Cricketer by email\n"
							+ "0.Exit\n" + "***************************************************************");
					switch (sc.nextInt()) {
					case 1:
						System.out.println("Enter name, age, email, phone, ratings:");
						Cricketer c1 = new Cricketer(sc.next(), sc.nextInt(), sc.next(), sc.next(), sc.nextInt());
						map.put(c1.getEmail(), c1);
						break;
					case 2:
						System.out.println("Enter Cricketer email and rating : ");
						String email = sc.next();
						int rate = sc.nextInt();
						map.get(email).setRatings(rate);
						break;
					case 3:
						System.out.println("Cricketer by its name :: Enter name:");
						String name = sc.next();
						map.values().stream().filter(p1 -> p1.getName().equals(name))
								.forEach(p2 -> System.out.println(p2));
						break;
					case 4:
						System.out.println("All cricketers in collection");
						map.values().forEach(p -> System.out.println(p));
						break;
					case 5:
						System.out.println("All cricketers in sorted form...");
						map.values().stream().sorted(Comparator.comparing(Cricketer::getRatings))
								.forEach(p2 -> System.out.println(p2));
						/*
						 * tasks.values().stream().sorted(Comparator.comparing(Task::getTaskDate))
						 * .forEach(p -> System.out.println(p));
						 */
						break;
					case 6:
						System.out.println("Cricketers by email: Enter email:");
						String email1 = sc.next();
						map.values().stream().filter(p1-> p1.getEmail().equals(email1)).forEach(p-> System.out.println(p));
						break;
					case 0:
						exit = false;
						System.out.println("EXIT SUCCESS\nThank you!!!");
						break;

					default:
						break;
					}
				} catch (Exception e) {
					e.getMessage();
				}
			}

		}
	}

}
