package assignmentOne;

import java.util.Scanner;

//Jorge Bejarano Lucas

public class UniqueNum {
	
	int counter;
	int duplicate;
	int[] numArray = new int[10];
	int[] uniqueArray = new int[10];
	
	UniqueNum() {
		counter = 0;
		duplicate = 0;
	}
	
	public void taskThree() {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the Numbers: ");
		
		for (int i = 0; i < numArray.length;i++) {
			//counter = 0;
			duplicate = 0;
			
			numArray[i] = input.nextInt();
			
			for (int c = 0;c <counter;c++) {
				if(numArray[c]==numArray[i]) {
					duplicate = 1;//true
					break;
				}
			}
			
			if (duplicate != 1) {
				uniqueArray[counter] = numArray[i];
				counter++;
			}
			
		}
		
		System.out.println("Number of Distinct numbers is: "+ counter);
		
		System.out.println("Numbers: ");
		for(int i = 0;i<counter;i++) {
			System.out.println(" " + uniqueArray[i]);
		}
		
		input.close();
		
	}

}
