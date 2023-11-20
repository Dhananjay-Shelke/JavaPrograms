package com.code.test;

import java.util.Scanner;

import com.code.entity.Point2D;

public class TestPoint {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("How many points do you want to plot?");
		Point2D[] points = new Point2D[sc.nextInt()];
		int count = 0;
		boolean flag = true;
		do {
			System.out.println("Choose from following options:");
			System.out.println("1.Plot point");
			System.out.println("2.Display points");
			System.out.println("3.Choose from display points to find distance between them");
			System.out.println("0.Exit");
			switch (sc.nextInt()) {
			case 1:
				if (count == points.length) {
					System.out.println("You cannot add more points");
					break;
				}
				System.out.println("Enter X and Y coordinate:");
				points[count] = new Point2D(sc.nextInt(), sc.nextInt());
				count++;
				break;
			case 2:
				for (int i = 0; i < points.length; i++) {
					if (points[i] != null) {
						System.out.println("Point " + (i + 1));
						System.out.println(points[i].show());

					}
				}
				break;
			case 3:
				System.out.println("Choose point numbers to find distance between them");
				int a = sc.nextInt();
				int b = sc.nextInt();
				if (a < 1 || b < 1 || a >= points.length || b >= points.length) {
					System.out.println("Invalid Input");
					break;
				}
				System.out.print("Distance between points is :");
				System.out.printf("%.2f%n", points[a - 1].calculateDistance(points[b - 1]));
				break;
			case 0:
				break;
			default:
				System.out.println("Invalid input");
			}
			System.out.println("Do you want to continue?(y/n)");
			String temp=sc.next();
			if (temp == "n" || temp=="No") {
				flag = false;
			}
		} while (flag == true);
		System.out.println("Programe ended");
		sc.close();
	}

}
