package com.app.fruits;

import java.util.Scanner;

public class FruitBasket {

	public static void main(String[] args) {
		int count = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter basket size:");
		Fruit[] basket = new Fruit[sc.nextInt()];
		boolean flag = true;
		do {
			System.out.println();
			System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------");
			System.out.println("Choose from following \n 1. Add Mango \n" + " 2. Add Orange \n 3. Add Apple \n"
					+ "4. Display names of all fruits in the basket.\n"
					+ "5. Display name,color,weight , taste of all fresh fruits , in the basket.\n"
					+ "6.Mark a fruit in a basket , as stale\n" + "7. Mark all sour fruits stale \n"
					+ "8. Invoke fruit specific functionality (pulp / juice / jam)\n" + "9. Exit");

			switch (sc.nextInt()) {
			case 1:
				if (count < basket.length) {
					System.out.println("Enter color weight and name for mango");
					basket[count] = new Mango(sc.next(), sc.nextDouble(), sc.next());
					System.out.println("Mango is added to basket");
					count++;
				} else {
					System.out.println("You cannot add more fruits!!");
				}
				break;
			case 2:
				if (count < basket.length) {
					System.out.println("Enter color weight and name for orange");
					basket[count] = new Orange(sc.next(), sc.nextDouble(), sc.next());
					System.out.println("Orange is added to basket");
					count++;
				} else {
					System.out.println("You cannot add more fruits!!");
				}
				break;
			case 3:
				if (count < basket.length) {
					System.out.println("Enter color weight and name for Apple");
					basket[count] = new Apple(sc.next(), sc.nextDouble(), sc.next());
					System.out.println("Apple is added to basket");
					count++;
				} else {
					System.out.println("You cannot add more fruits!!");
				}
				break;
			case 4:
				int i = 1;
				for (Fruit f : basket) {
					if(f!=null) {
					System.out.println(i + ". Name: " + f.getName());
					i++;
					}
				}
				break;

			case 5:
				i = 1;
				for (Fruit f : basket) {
					if(f!=null) {
					System.out.println(i + " " + f + " Taste: " + f.taste());
					i++;
					}
				}
				break;

			case 6:
				System.out.println("Enter number fruite to make it stale:");
				int index = sc.nextInt();
				if (index!=0 && (index -1)< basket.length && basket[index-1]!=null) {
					basket[index - 1].setFresh(false);
					System.out.println("Done");
				} else {
					System.out.println("Fruit doesnt exist!!");
				}
				break;

			case 7:
				for (Fruit f : basket) {
					
					if (f!=null && f.taste().equals("sour")) {
						f.setFresh(false);
					}
				}
				System.out.println("Done");
				break;
			case 8:
				for (Fruit f : basket) {
				
					if (f!=null && f instanceof Mango) {
						((Mango) f).pulp();
					} else if (f!=null && f instanceof Orange) {
						((Orange) f).juice();
					} else if(f!=null && f instanceof Apple ){
						((Apple) f).jam();
					}
				}
				break;

			case 9:
				flag = false;
				System.out.println("Thanks for visiting!!");
				break;
			default:
				System.out.println("Invalid choice!!!!!\n pleasse select valid choice.\n");
				break;

//			
//			System.out.println("Do you want to continue?(Y/N)");
//			String asn=sc.next();
//			
//			if(asn=="N") {
//				flag=false;
//			}

			}

		} while (flag == true);

	}
}
