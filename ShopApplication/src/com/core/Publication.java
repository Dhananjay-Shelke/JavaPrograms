package com.core;

import java.time.LocalDate;

public class Publication {
	private int id;
	private String title;
	private int price;
	LocalDate publishDate;
	public LocalDate getPublishDate() {
		return publishDate;
	}

	public void setPublishDate(LocalDate publishDate) {
		this.publishDate = publishDate;
	}

	private int ratings;
	private static int idGenerator = 0;
	
	public Publication(String title, int price, LocalDate publishDate, int ratings) {
		super();
		id = ++idGenerator;
		this.title = title;
		this.price = price;
		this.publishDate = publishDate;
		this.ratings = ratings;
	}

	public int getRatings() {
		return ratings;
	}

	public void setRatings(int ratings) {
		this.ratings = ratings;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Publication [id=" + id + ", title=" + title + ", price=" + price + ", publishDate=" + publishDate
				+ ", ratings=" + ratings + "]";
	}
	
	
	
	
}
