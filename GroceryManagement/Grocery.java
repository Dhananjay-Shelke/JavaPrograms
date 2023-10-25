package GroceryManagement;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Grocery {
	private String name;
	private int pricePerUnit;
	private int stock;
	private LocalDate date;
	
	public Grocery(String name, int pricePerUnit, int stock, LocalDate date) {
		super();
		this.name = name;
		this.pricePerUnit = pricePerUnit;
		this.stock = stock;
		this.date = date;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPricePerUnit() {
		return pricePerUnit;
	}

	public void setPricePerUnit(int pricePerUnit) {
		this.pricePerUnit = pricePerUnit;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Grocery [Name=" + name + ", PricePerUnit=" + pricePerUnit + ", Stock=" + stock + ", Date=" + date + "]";
	}
	
	
}
