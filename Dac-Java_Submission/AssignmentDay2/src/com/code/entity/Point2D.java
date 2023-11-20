package com.code.entity;

public class Point2D {

	private int xCoordinate;
	private int yCoordinate;
	
	public Point2D(int x , int y){
		this.xCoordinate=x;
		this.yCoordinate=y;
	}
	
	public String show(){
		return "X Co-ordinate is: "+xCoordinate+"\nY Co-ordinate is: "+yCoordinate; 
	}
	
	public boolean isEqual(Point2D obj){
		
		if(this.xCoordinate==obj.xCoordinate && this.yCoordinate==obj.yCoordinate){
			return true;
		}else{
			return false;
			
		}
		
	}
	
	public double calculateDistance(Point2D p2 ){
			
			
			double ans =Math.sqrt( Math.pow(this.xCoordinate - p2.xCoordinate,2)+Math.pow(this.yCoordinate - p2.yCoordinate,2));
			
			return ans;
			
	}
	
	

}
