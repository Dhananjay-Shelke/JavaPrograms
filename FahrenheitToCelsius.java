package com.programs;

import java.util.Scanner;

public class FahrenheitToCelsius {

	public static void main(String[] args) {

		  Scanner sc = new Scanner(System.in);
		  
		  System.out.println("Enter Temperature: "); 
		  double temp = sc.nextInt();
		  
		  temp =((temp-32)*5)/9;
		  
		  System.out.printf("Temperature in Celcius: %.2f",temp);
		  sc.close();
		 
	}

}
