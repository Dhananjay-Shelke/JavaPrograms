package StyleWithPenApplication;

import java.time.LocalDate;

public class Pen {
	private int id;
	private String color;
	private String inkColor;
	private int stock;
	LocalDate stockDate;
	LocalDate listingDate;
	private int price;
	private int discount;
	private Brand brand;
	private Material mterial;
	
	private static int idGenerator = 0;

	public Pen(String color, String inkColor, int stock, LocalDate listingDate, int price,
			Brand brand, Material mterial) {
		super();
		this.id = ++idGenerator;
		this.color = color;
		this.inkColor = inkColor;
		this.stock = stock;
		this.listingDate = listingDate;
		this.stockDate = listingDate;
		this.price = price;
		this.discount = discount;
		this.brand = brand;
		this.mterial = mterial;
	}

	public LocalDate getListingDate() {
		return listingDate;
	}

	public void setListingDate(LocalDate listingDate) {
		this.listingDate = listingDate;
	}

	public int getStock() {
		return stock;
	}

	public void updateStock(int stock) {
		this.stock = stock;
	}

	public int getDiscount() {
		return discount;
	}

	public void updateDiscount(int discount) {
		this.discount = price * (discount/100);
	}
	
	public void setDiscount(int discount) {
		this.discount = discount;
	}
	

	public Brand getBrand() {
		return brand;
	}

	public void setBrand(Brand brand) {
		this.brand = brand;
	}

	public LocalDate getStockDate() {
		return stockDate;
	}

	public void setStockDate(LocalDate stockDate) {
		this.stockDate = stockDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Pen [Id=" + id + ", Color=" + color + ", InkColor=" + inkColor + ", Stock=" + stock + ", StockDate="
				+ stockDate + ", ListingDate=" + listingDate + ", Price=" + price + ", Discount=" + discount
				+ ", Brand=" + brand + ", Material=" + mterial + "]";
	}
	
}
