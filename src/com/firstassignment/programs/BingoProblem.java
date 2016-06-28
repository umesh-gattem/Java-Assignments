package com.firstassignment.programs;


public class BingoProblem {

	public static void main(String args[]) {

		int firstInt = Integer.parseInt(args[0]);

		int secondInt = Integer.parseInt(args[1]);
		
		System.out.printf("Your First number is %d",firstInt);
		
		System.out.printf("\nYour Second number is %d",secondInt);


		if (firstInt >= 1 && firstInt <= 40 && secondInt >= 1 && secondInt <= 40) {

			int array[] = { 1, 15, 26, 3, 29 };
			int count=0;
			
			for (int i = 0; i < array.length; i++) {
				
				if (array[i] >= 1 && array[i] <= 40) {
					
					if(array[i]==firstInt || array[i]==secondInt)
						count++;
					
				}
				else{
					System.out.println("\nEnter array elements between 1 and 40");
					return;
				}
					
			}
			
			if(count==2){
				System.out.println("\nIts BINGO!");
			}
			else{
				System.out.println("\nIts Not Found");
			}

		}
		
		else{
			System.out.println("\nEnter intergers between 1 and 40 in command arguments");
		}
		
		
	}

}
