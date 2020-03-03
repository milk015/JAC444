package assignmentOne;
//Jorge Bejarano Lucas

public class Tester {

	public static void main(String[] args) {
		//used for both Task 1, Task 2, Task 3
		
		System.out.println("Tester File for all three tasks!");
		
		LoanCal task1 = new LoanCal();
		
		task1.calculate();
		
		System.out.println("Task 1 end\n\n\n");
		System.out.println("Task 2 Start");
		
		SRPGame task2 = new SRPGame();
		
		task2.runGame();
		
		System.out.println("Task 2 end\n\n\n");
		System.out.println("Task 3 Start");
		
		UniqueNum task3 = new UniqueNum();
		
		task3.taskThree();

	}

}
