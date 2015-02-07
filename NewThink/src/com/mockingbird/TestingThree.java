package com.mockingbird;

/*This code is based on Derek Banas NewThinkTank Tuts (http://www.newthinktank.com) - AAB working on some testing of various
 * data structures in java.  C0D3JUNKIE wuz here!
 * 02/03/2014
 */

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