package core;
//stock id (unique : string), stock name (string), company name(string) , price (double), closing date (Date) , quantity (int)

import java.time.LocalDate;

public class Stock {
	private String stockID;
	private String stockName;
	private String companyName;
	private double price;
	private LocalDate closingDate;
	private int quantity;
	
	//parameterized constructor
	public Stock(String stockID, String stockName, String companyName, double price, LocalDate closingDate,
			int quantity) {
		super();
		this.stockID = stockID;
		this.stockName = stockName;
		this.companyName = companyName;
		this.price = price;
		this.closingDate = closingDate;
		this.quantity = quantity;
	}

	public String getStockID() {
		return stockID;
	}

	public void setStockID(String stockID) {
		this.stockID = stockID;
	}

	public String getStockName() {
		return stockName;
	}

	public void setStockName(String stockName) {
		this.stockName = stockName;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public LocalDate getClosingDate() {
		return closingDate;
	}

	public void setClosingDate(LocalDate closingDate) {
		this.closingDate = closingDate;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setSaleQuantity(int quantity) {
		this.quantity -= quantity;
	}
	
	public void setPurchaseQuantity(int quantity) {
		this.quantity += quantity;
	}

	@Override
	public String toString() {
		return "Stock [stockID=" + stockID + ", stockName=" + stockName + ", companyName=" + companyName + ", price="
				+ price + ", closingDate=" + closingDate + ", quantity=" + quantity + "]";
	}
	
	
	
	
	
	
}
