package assignmentTwo;

import java.util.Scanner;

public class TaskThree {
	
	
	int[] list = new int[10];
	int[] uniList = new int[10];
	int cnt;
	int distinct;
	
	public TaskThree() {
		cnt = 0;
		distinct = 0;
	}
	
	public void runTask() {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the Numbers: ");
		
		for (int i = 0; i < list.length;i++) {
			//counter = 0;
			distinct = 0;
			
			list[i] = input.nextInt();
			
			for (int c = 0;c <cnt;c++) {
				if(list[c]==list[i]) {
					distinct = 1;//true
					break;
				}
			}
			
			if (distinct != 1) {
				uniList[cnt] = list[i];
				cnt++;
			}
			
		}
		System.out.println("Number of Distinct numbers is: "+ cnt);
		
		System.out.println("Numbers: ");
		for(int i = 0;i<cnt;i++) {
			System.out.println(" " + uniList[i]);
		}
		
		input.close();
	}
		
		

}
