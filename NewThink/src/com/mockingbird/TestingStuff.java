
package com.mockingbird;

/*This code is based on Derek Banas NewThinkTank Tuts (http://www.newthinktank.com) - AAB working on some testing of various
 * data structures in java.  C0D3JUNKIE wuz here!
 * 02/03/2014
 */

public class TestingStuff {
		
	private int[] theArray = new int [50];
	private int arraySize = 10;
		
		public void generateRandomArray(){
			for(int i=0; i < arraySize; i++){
				theArray[i] = (int)(Math.random()*10)+10;
			}
		}
		public void printArray(){
			System.out.println("-----------");
			for (int i=0;i < arraySize; i++){
				System.out.print(" | " + i + " | ");
				System.out.println(theArray[i] + " | ");
				System.out.println("-----------");
			}
		}
		public int getValueAtIndex(int index){
			if(index < arraySize) return theArray[index];
			return 0;
		}
		public boolean doesArrayContainThisValue(int searchValue) {
			boolean valueInArray = false;
			for (int i=0; i < arraySize; i++){
				if (theArray[i] == searchValue){
					valueInArray = true;
				}
			}
			return valueInArray;
		}
		public void deleteIndex(int index){
			if (index < arraySize){
				for(int i = index; i <arraySize; i++){
					theArray [i] = theArray[i+1];
				}
				arraySize --;
			}
		}	
		public void insertValue(int value){
			if (arraySize < 50){
				theArray[arraySize] = value;
				arraySize ++;
			}
		}
		public String linearSearchForValue(int value){
			boolean valueInArray = false;
			String indexsWithValue = "";
			System.out.print("The Value was Found in the Following: ");
			for (int i = 0; i < arraySize; i++){
				if (theArray [i] == value){
					valueInArray = true;
					System.out.println(i + " ");
					indexsWithValue = i + " ";
				}
			}
			if(!valueInArray){
				indexsWithValue = "None";
				System.out.print(indexsWithValue);
			}
			return indexsWithValue;
		}
		public static void main(String[] args){
			TestingStuff newArray = new TestingStuff();
			newArray.generateRandomArray();
			newArray.printArray();
			System.out.println(newArray.getValueAtIndex(3));
			System.out.println(newArray.doesArrayContainThisValue(33));
			newArray.deleteIndex(4);
			newArray.printArray();
			newArray.insertValue(55);
			newArray.printArray();
		}

}
