package com.mockingbird;

public class TestingThree {

	public String bookName;
	public int millionsSold;
	public Link next;
	
	public void Link(String bookName, int milllionsSold){
		this.bookName = bookName;
		this.millionsSold = millionsSold;
	}
	
	public void display(){
		System.out.println("");
	}
	
	public String toString(){
		return bookName;
	}
	
	public static void main(String[] args){
	
	}
	
}