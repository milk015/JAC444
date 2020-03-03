package assignmentTwo;

import java.util.Scanner;

public class TaskTwo {
	
	private int nrow, ncol;
	int[][] mat =new int[2][2];
	
	public static final int N = 10;
	
	private static int count = 0;
	
	public TaskTwo(){
		nrow = 2;
		ncol =2;
	}
	
	public TaskTwo(int row, int col){
		this.nrow = row;
		this.ncol = col;
	}
	
	TaskTwo(TaskTwo cpy){
		nrow = cpy.nrow;
		ncol = cpy.ncol;
	}
	
	public void setRow() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number of Rows up to ten: ");
		int row = input.nextInt();
		while(row > 10 || row < 2) {
			System.out.println("Enter number of Rows from TWO to TEN: ");
			row = input.nextInt();
		}
		nrow = row;
		input.close();
	}
	
	public int getRow() {
		return this.nrow;
	}
	
	public void setCol() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number of Rows up to ten: ");
		int col = input.nextInt();
		while(col > 10 || col < 2) {
			System.out.println("Enter number of Rows from TWO to TEN: ");
			col = input.nextInt();
		}
		ncol = col;
		input.close();
	}
	
	public int getCol() {
		return this.ncol;
	}
	
	public int getCount() {
		return count;
	}
	
	public TaskTwo sum(TaskTwo t) { //example not clear not sure what the output is supposed to be
		
		return t;
	}
	
	public Boolean isSymmetric() {
		Boolean tf = true;
		
		for(int i = 0; i < getRow();i++) {
			for(int x = 0; x < getCol();x++) {
				if(mat[i][x] != mat[x][i]) {
					tf = false;
				}
			}
			
		}
		
		return tf;
		
	}
	
	public void fillMat() {
		Scanner input = new Scanner(System.in);
		for(int i = 0; i < getRow();i++) {
			for(int x = 0; x < getCol(); x++) {
				mat[i][x] = input.nextInt();
			}
		}
	}
	
	public String toString() {
		String output = " ";
		
		for(int i = 0; i < getRow(); i++) {
			for(int x = 0; x < getCol();x++) {
				
			}
		}
		
		return "A = " + output;
	}
	
	public void runTask() {
		
		
		
	}

}
