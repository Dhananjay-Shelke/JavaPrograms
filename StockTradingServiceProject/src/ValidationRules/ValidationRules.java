package ValidationRules;

import java.time.LocalDate;
import java.util.Map;

import CustomeException.CustomExceptions;
import core.Stock;

public class ValidationRules {
	// no duplicate stock ids.
	public static String checkDupId(String stockId, Map<String, Stock> map) throws CustomExceptions {
		if (map.containsKey(stockId))
			throw new CustomExceptions("Stock already exits");
		return stockId;
	}

	// validation rule that stock closing date must be a future date
	public static LocalDate checkStockDate(String date, Map<String, Stock> map) throws CustomExceptions {
		LocalDate d = LocalDate.parse(date);
		if (d.isAfter(LocalDate.now()))
			return d;
		throw new CustomExceptions("Date is past date...");
	}

	// validate all inputs
	public static Stock validateAllInputs(String stockID, String stockName, String companyName, double price,
			String closingDate, int quantity, Map<String, Stock> map) throws CustomExceptions {
		checkDupId(stockID, map);
		LocalDate validatedDate = checkStockDate(closingDate, map);

		return new Stock(stockID, stockName, companyName, price, validatedDate, quantity);
	}
	
	//validation for checking stock id  for purchase
	public static void checkIdAndQuantity(String id, Map<String, Stock> map) throws CustomExceptions {
		if (!map.containsKey(id))
			throw new CustomExceptions("StockId is incorrect");
	}

	// check stockId and Quantity available or not for sale
	public static void checkIdAndQuantity(String id, int quantity, Map<String, Stock> map) throws CustomExceptions {

		if (!map.containsKey(id))
			throw new CustomExceptions("StockId is incorrect");

		if (map.get(id).getQuantity() < quantity) {
			throw new CustomExceptions("Insufficient Stocks");
		}
	}
}
