package com.core;

import java.time.LocalDate;

public class Book extends Publication{

	private int pageCount;

	public Book(String title, int price, LocalDate publishDate, int ratings, int pageCount) {
		super(title, price, publishDate, ratings);
		this.pageCount = pageCount;
	}

	@Override
	public String toString() {
		return "Book [pageCount=" + pageCount + " "+ super.toString() + "]";
	}

	public int getPageCount() {
		return pageCount;
	}

	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}

	
	

	
}
