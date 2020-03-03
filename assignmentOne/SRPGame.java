package assignmentOne;

//Jorge Bejarano Lucas

import java.util.Random;
import java.util.Scanner;

public class SRPGame {
	
	int option;
	int computer;
	
	SRPGame(){
		
	}
	
	public void runGame() {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Choose\nScissor (0), Rock (1), Paper (2): ");
		option = input.nextInt();
		
		Random rand = new Random();
		computer = rand.nextInt(3);
		
		input.close();
		
		switch(option) {
		
		case 0: 
			if(computer == 1) {
				System.out.println("The computer is Rock. You are Scissor. You Lost");
			}
			else if(computer == 2) {
				System.out.println("The computer is Paper. You are Scissor. You Win");
			}
			else {
				System.out.println("The computer is Scissor. You are Scissor. It's a Draw");
			}
			break;
		
		case 1:
			if(computer == 1) {
				System.out.println("The computer is Rock. You are Rock. It's a Draw");
			}
			else if(computer == 2) {
				System.out.println("The computer is Paper. You are Rock. You Lost");
			}
			else {
				System.out.println("The computer is Scissor. You are Rock. You Win");
			}
			break;
			
		case 2:
			if(computer == 1) {
				System.out.println("The computer is Rock. You are Paper. You Win");
			}
			else if(computer == 2) {
				System.out.println("The computer is Paper. You are Paper. It's a Draw");
			}
			else {
				System.out.println("The computer is Scissor. You are Paper. You lost");
			}
			break;
		
		}
		
	}
	
	
}
