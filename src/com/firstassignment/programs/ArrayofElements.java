package com.firstassignment.programs;

public class ArrayofElements {
	
	public static void main(String args[]){
		
		int array[]={3,2,4,5,6,4,5,7,3,2,3,4,7,1,2,0,0,0};
		int sum=0,min=array[0];
		
		for(int i=0;i<15;i++){
			sum=sum+array[i];

			if(array[i]<min){
				min=array[i];
			}
		}
		int meanofArray=sum/15;
		
		array[15]=sum;
		array[16]=meanofArray;
		array[17]=min;
		
		for(int i=0;i<18;i++){
			
			System.out.print(array[i]+"  ");
		}
				
		
	}

}
