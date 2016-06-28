package com.firstassignment.programs;

public class SumofPreviousTwoIntegers {
	
	
	public static void main(String args[]){
		
		int firstInt=Integer.parseInt(args[0]);
		
		int secondInt=Integer.parseInt(args[1]);
		
		System.out.print(firstInt +"  "+ secondInt+" ");
		
		for(int i=0;i<13;i++){
			
			int result=firstInt+secondInt;
			System.out.print(result+"  ");
			firstInt=secondInt;
			secondInt=result;
		}


		
	}
	
	

}
