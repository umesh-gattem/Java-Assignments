package com.assignment.one.program;

/**
 * 
 * @author umesh
 * 
 *         Program that allows you to create an integer array of 18 elements
 *         with the following values: int
 *         A[]={3,2,4,5,6,4,5,7,3,2,3,4,7,1,2,0,0,0}. The program computes the
 *         sum of element 0 to 14 and stores it at element 15, computes the
 *         average and stores it at element 16 and identifies the smallest value
 *         from the array and stores it at element 17.
 *
 */

public class ArrayofElements {

	public static void main(String args[]) {
		int array[] = { 3, 2, 4, 5, 6, 4, 5, 7, 3, 2, 3, 4, 7, 1, 2, 0, 0, 0 };
		array[15]=sumofArrayElements(array);
		array[16]=averageofArrayElements(array);
		array[17]=smallestValueofArrayElements(array);
	}
	
/**
 * This function will calculate the mean/average of array elements.
 * 	
 * @param array
 * return averageofElements
 */

	private static int averageofArrayElements(int[] array) {
		int sum=0;
		for(int item=0;item<15;item++){
			sum=sum+array[item];
		}
		int averageofElements=sum/15;
		System.out.println("Average of array elements is :" +averageofElements);
		return averageofElements;		
	}
	
/**
 * This function will find out the smallest value of the array elements
 * 
 * @param array
 * return min
 */

	private static int smallestValueofArrayElements(int[] array) {
		int min = array[0];
		for(int item=0;item<15;item++){
			if(array[item]<min){
				min=array[item];
			}
		}
		System.out.println("Smallest value of array elements is :" +min);
		return min;
	}
	
	
/**
 * This function will calculate the sum of array elements .
 *  	
 * @param array
 * return sum
 */

	private static int sumofArrayElements(int[] array) {
		int sum = 0;
		for (int item=0;item<15;item++) {
			sum = sum + array[item];
		}
		System.out.println("Sum of array elements is :" +sum);
		return sum;
	}
}
