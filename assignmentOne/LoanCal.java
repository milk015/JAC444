package assignmentOne;

//Jorge Bejarano Lucas

import java.util.Scanner;

public class LoanCal {
	
	//initial amounts
	double loan;
	double interest;
	int term; //number of years * 12
	
	//payment
	double balance;
	double principal;
	double monthlyAmount;
	double annualInterest;//= interest
	double monthlyInterest;//annual interest / 1200
	
	
	LoanCal() {
		
	}
	
	public void setValues() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Information below");
		System.out.println("Loan Amount: ");
		loan = input.nextDouble();
		System.out.println("Number of Years: ");
		term = input.nextInt();
		System.out.println("Annual Interest Rate: ");
		interest = input.nextDouble();
		input.close();
	}
	
	public void calculate() { //used to run entire task
		
		setValues();
		System.out.println();
		annualInterest = interest;
		monthlyInterest = annualInterest / 1200;
		int termInMonths = term * 12;
		monthlyAmount = loan * monthlyInterest / (1 - (Math.pow(1 / (1 + monthlyInterest),termInMonths)));
		//System.out.println(monthlyAmount);
		//monthlyAmount = (int)(monthlyAmount * 100) / 100.0;
		System.out.println("Monthly Payment: " + (int)(monthlyAmount * 100) / 100.0); //get Decimal Points
		
		balance = loan;
		System.out.println("Total Payment: "+ (int)(monthlyAmount * termInMonths * 100) / 100.00);
		
		//display loop
		System.out.println("Payment \t\tInterest \tPrincipal \t\tBalance");
		double interestAmount;
		for(int i = 1; i <= termInMonths;i++) {
			interestAmount = (int)(monthlyInterest * balance * 100) / 100.0;
			principal = (int) ((monthlyAmount - interestAmount)* 100)/100.0;
			balance = (int) ((balance - principal) * 100) / 100.0;
			System.out.println(i + "\t\t\t" + interestAmount + "\t\t" + principal + "\t\t\t" + balance);
		}
	}
	
	
	
	
	
}
