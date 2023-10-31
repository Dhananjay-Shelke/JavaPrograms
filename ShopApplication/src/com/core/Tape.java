package com.core;

import java.time.LocalDate;

public class Tape extends Publication{
	
	    private int time;
		
//	    public Tape(String title, int price, LocalDate publishDate, int ratings, int time) {
//		
//	    	super(title, price, publishDate, ratings);
		
	public Tape(String title, int price, LocalDate publishDate, int ratings, int time) {
			super(title, price, publishDate, ratings);
			this.time = time;
		}
	
		@Override
		public String toString() {
			return "Tape [time=" + time + " "+ super.toString() + "]";
		}
		
	
}
