package Tester;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import CollectionUtils.PopulatedData;

import static ValidationRules.ValidationRules.*;
import core.Stock;

public class Tester {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			boolean exit = true;
			Map<String, Stock>map = new HashMap<>();
			
			while (true) {
					System.out.println("******************************************************************"
							+ "\n1. Add at least 5 sample stocks in the beginning of application"
							+ "\n2. Add New stock in the market"
							+ "\n3. View Available stocks by Company Name"
							+ "\n4. Purchase stocks - input : stock id , quantity"
							+ "\n5. Sell Stocks"
							+ "\n6. Show All Stocks"
							+ "\n0. Exit"
							+ "\n******************************************************************");
				try {
					switch (sc.nextInt()) {
					case 1:
						map = PopulatedData.populatedMap();
						System.out.println("Stcoks Added!!!");
						break;
					case 2:
						System.out.println("Enter stockID, stockName, companyName, price, closingDate, quantity:");
						Stock s = validateAllInputs(sc.next(), sc.next(),sc.next(),sc.nextDouble(), sc.next(), sc.nextInt(), map);
						map.put(s.getStockID(), s); 
						break;
					case 3:
						System.out.println("Enter Company name to view its Stocks:");
						String name = sc.next();
						map.values().stream().filter(p-> p.getCompanyName().equals(name)).forEach(p->System.out.println(p));
						break;
					case 4:
						System.out.println("Enter StockId and Quantity to puchase stock:");
						String stockID = sc.next();
						int quantity = sc.nextInt();
						checkIdAndQuantity(stockID,map);
						map.get(stockID).setPurchaseQuantity(quantity);
						System.out.println("Stock Purchased!!!");
						break;
					case 5:
						System.out.println("Enter StockId and Quantity to Sale stock:");
						String stockId = sc.next();
						int quant = sc.nextInt();
						checkIdAndQuantity(stockId, quant, map);
						map.get(stockId).setSaleQuantity(quant);
						System.out.println("Stocks Sold!!!");
						break;
					case 6:
						map.values().forEach(p->System.out.println(p));
						break;
					case 0:
						exit = false;
						System.out.println("Exit Success\nThank You!!!");
						break;
					default:
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
