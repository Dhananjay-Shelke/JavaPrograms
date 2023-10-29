 package StyleWithPenApplication;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.Map;


public class ValidationRules {
	
	//validation for Listing date
	public static LocalDate validateListingDate(String listingDate,Map<Integer, Pen> map)throws DateTimeException {
		return LocalDate.parse(listingDate);
	}

	//validation for enum brand, material
	public static Brand checkForBrand(String brand,Map<Integer, Pen> map)throws IllegalArgumentException{
		
		return Brand.valueOf(brand.toUpperCase());
	}



	//validate all inputs
	public static Pen valildateAllInputs(String color, String inkColor, int stock, String listingDate, int price,
			String brand, String mterial,Map<Integer, Pen> map)throws CustomException{
		
		LocalDate date = validateListingDate(listingDate,map);
		Brand b1 = checkForBrand(brand, map);
		
		return new Pen(color, inkColor, stock, date, price,b1, Material.valueOf(mterial.toUpperCase()));
	}
	
	//update stock method
	public static void updateStock(int id,int stock,Map<Integer, Pen> map)throws CustomException{
		if(map.containsKey(id)) {
			map.get(id).updateStock(stock);			
		}
		else
			throw new CustomException("Please enter Correct ID");
		
	}

}
