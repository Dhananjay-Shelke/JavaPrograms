package CollectionUtils;

import java.time.LocalDate;
import java.util.HashMap;

import core.Stock;

public class PopulatedData {
	
	public static HashMap<String, Stock> populatedMap()
	{
		HashMap<String, Stock> map = new HashMap<>();
		
		map.put("101", new Stock("101","harrier" ,"tata",1212.5,LocalDate.parse("2024-12-05"), 500));
		map.put("102", new Stock("102","hdfc" ,"hdfc",900.5,LocalDate.parse("2024-05-05"), 700));
		map.put("103", new Stock("103","reliance" ,"reliance",720.5,LocalDate.parse("2025-08-20"), 900));
		map.put("104", new Stock("104","icici" ,"icici",820.5,LocalDate.parse("2027-01-09"), 300));
		map.put("105", new Stock("105","tcs" ,"tata",1250.5,LocalDate.parse("2026-10-10"), 200));
		map.put("106", new Stock("106","infosys" ,"infosys",1600.5,LocalDate.parse("2024-03-27"), 600));
		return map;
	}

}
