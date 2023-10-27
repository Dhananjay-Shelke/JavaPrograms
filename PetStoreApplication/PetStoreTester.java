package PetStoreApplication;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PetStoreTester {

	public static void main(String[] args) {
		boolean exit = true;
		String adminLoginId = "admin";
		String adminPassword = "admin";
		String customerLoginId = "c1";
		String customerPassword = "c1";

		Map<Integer, Pet> map = new HashMap<>();
		Map<Integer, Order> map2 = new HashMap<>();
		try (Scanner sc = new Scanner(System.in)) {
			try {
				while (exit) {
					System.out.println("**************************\n" + "1.Login\r\n" + "0.Exit\r\n"
							+ "**************************");
					switch (sc.nextInt()) {
					case 1:
						System.out.println("Enter LoginId and Password: ");
						String loginId = sc.next();
						String password = sc.next();
						if (adminLoginId.equals(loginId) && adminPassword.equals(password)) {
							System.out.println("Admin Logged in Successfully...");
							boolean check = true;
							while (check) {
								System.out.println("---------------------------------------\n"
										+ "1.Add new Pet (Admin only functionality)\n"
										+ "2.Update Pet details (Admin only functionality)\n"
										+ "3.Update order status (Admin only functionality)" + "\n0.Exit"
										+ "\n---------------------------------------");
								switch (sc.nextInt()) {
								case 1:
									System.out.println("Enter petId,name,category,unitPrice,stocks");
									Pet p1 = new Pet(sc.nextInt(), sc.next(), Category.valueOf(sc.next().toUpperCase()),
											sc.nextInt(), sc.nextInt());
									map.put(p1.getPetId(), p1);
									System.out.println("Pet added Successfully...");
									break;
								case 2:
									System.out.println("Update Pet details");
									System.out.println("Enter petId,name,category,unitPrice,stocks: ");
									int petid = sc.nextInt();
									String name = sc.next();
									Category c = Category.valueOf(sc.next().toUpperCase());
									int price = sc.nextInt();
									int stock = sc.nextInt();

									map.get(petid).setName(name);
									map.get(petid).setCategory(c);
									map.get(petid).setUnitPrice(price);
									map.get(petid).setStocks(stock);
									System.out.println("Details Updated...");

									break;
								case 3:
									System.out.println("Update order Status");
									System.out.println("Enter order id , Status:");
									int orderid = sc.nextInt();
									String st = sc.next().toUpperCase();
									Status s = Status.valueOf(st);

									map.get(orderid).setStatus(s);
									break;
								case 0:
									check = false;
									System.out.println("Admin Logged out Successfully...");
									break;
								default:
									break;
								}
							}
						} else if (customerLoginId.equals(loginId) && customerPassword.equals(password)) {
							System.out.println("Customer Logged in Successfully...");
							boolean check2 = true;
							while (check2) {
								System.out.println("\n---------------------------------------\n"
										+ "1.Display all available pets\n" + "2.Order a Pet\n"
										+ "3.Check order status by Order Id\n" + "4.Show Orders\n" + "0.Exit"
										+ "\n---------------------------------------");
								switch (sc.nextInt()) {
								case 1:
									System.out.println("Avilable Pets...");
									map.values().forEach(p -> System.out.println(p));
									break;
								case 2:
									System.out.println("Order Pet");
									System.out.println("Enter petId, quantity:");
									int petid = sc.nextInt();
									int quantity = sc.nextInt();
									Order o1 = new Order(petid, quantity);
									map2.put(o1.getOrderId(), o1);
									map.get(petid).updateStock(quantity);
									System.out.println("Order Placed Successfully...");
									break;
								case 3:
									System.out.println("Enter order Id:");
									int orderid = sc.nextInt();
									System.out.println(map2.get(orderid).getStatus());
									break;
								case 4:
									System.out.println("Available orders");
									map2.values().stream().forEach(o -> System.out.println(o));
									break;
								case 0:
									check2 = false;
									System.out.println("Customer logged out Successfully...");
									break;

								default:
									break;
								}
							}
						} else
							System.out.println("Enter Correct Login Id and Password.");
						break;

					default:
						break;
					}
				}
			} catch (Exception e) {
				e.printStackTrace();
				sc.nextLine();
			}
		}

	}
}
