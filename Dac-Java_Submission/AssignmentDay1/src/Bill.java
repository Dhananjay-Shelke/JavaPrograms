import java.util.*;

class Bill {
	public static void main(String[] args) {
		System.out.println("select from following items you want to purchase");
		System.out.println("1. Dosa=40");
		System.out.println("2. Idli=40");
		System.out.println("3. Poha=30");
		System.out.println("4. Chai=15");
		System.out.println("5. Cofee=20");
		System.out.println("6. Samosa=25");
		System.out.println("7.Kachhori=25");
		System.out.println("8. vadapav=15");
		System.out.println("9.khichadi=40");
		System.out.println("10. Genrate bill");

		Scanner sc = new Scanner(System.in);
		int choice;
		int total = 0;

		do {
			System.out.println("Enter your choice");

			choice = sc.nextInt();
			switch (choice) {

				case 1:
					System.out.println("You have choosen Dosa");
					total += 40;
					System.out.println("Your bill till now is "+total);
					break;
				case 2:
					total += 40;
					System.out.println("Your bill till now is "+total);
					break;
				case 3:
					total += 30;
					System.out.println("Your bill till now is "+total);
					break;
				case 4:
					total += 15;
					System.out.println("Your bill till now is "+total);
					break;
				case 5:
					total += 20;
					System.out.println("Your bill till now is "+total);
					break;
				case 6:
					total += 25;
					System.out.println("Your bill till now is "+total);
					break;
				case 7:
					total += 25;
					System.out.println("Your bill till now is "+total);
					break;
				case 8:
					total += 15;
					System.out.println("Your bill till now is "+total);
					break;
				case 9:
					total += 40;
					System.out.println("Your bill till now is "+total);
					break;
				case 10:
				System.out.println("Your total bill is " + total+" ruppees");
					break;

				default:
					System.out.println("Enter valid option");

			}

		} while (choice != 10);

		

		sc.close();

	}
}
