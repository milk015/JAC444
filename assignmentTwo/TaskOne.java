package assignmentTwo;

//import java.text.DateFormat;
//import java.text.SimpleDateFormat;
import java.time.LocalDate;


public class TaskOne {
	
	public static class Person{
		private String name, address, phone, email;
		
		public Person() {
			name = "";
			address = "";
			phone = "";
			email = "";
		}
		
		public Person(String n,String a, String p, String e) {
			this.name = n;
			this.address = a;
			this.phone = p;
			this.email = e;
		}
		
		public String toString() {
			return "Name: " + name + "\nAddress: " + address + "\nPhone number: " + phone + "\nEmail Address: " + email;
		}
		
		//endClass
	}
	
	//Person -> student
	public static class Student extends Person{
		
		private int status;
		public final static int senior = 1;
		public final static int sophomore = 2;
		public final static int junior = 3;
		public final static int freshman = 4;
		
		public Student(String n,String a,String p, String e,int s) {
			super(n,a,p,e);//name address phone email
			this.status = s;
		}
		
		public String getStatus() {
			//if(status == 1) {
				//return "Senior";
			//}
			switch(status) {
			case 1: return "Senior";
			case 2: return "Sophomore";
			case 3: return "Junior";
			case 4: return "Freshman";
			default: return "Invalid";
			}
		}
		
		public String toString() {
			return super.toString() + "\nStatus: " + getStatus();
		}
		
	}
	//date 
	public static class MyDate{
		private int month, day, year;
		
		public MyDate() {
			this.month = 0;
			this.day = 0;
			this.year = 0;
			
		}
		public MyDate(int m, int d, int y) {
			if(m > 0 && m <= 12) {
				month = m;
			}
			else {
				month = 1;
			}
			if (d > 0 && d <= 31) {
				day = d;
			}
			else {
				d = 1;
			}
			
			year = y;
		}
		
		public LocalDate getLocalDate() {
		    return LocalDate.now();
		}
		
		public String toString() {
			/*if(day == 0 && month == 0 && year == 0)
			return month + " : " + day + " : " + year;
			
			else {
				return getLocalDate().toString();
			}*/
			return getLocalDate().toString();
		}
	}
	
	//Person -> Employee
	public static class Employee extends Person{
		//private int office;//1 = yes 0 = no
		private String hasOffice;
		private double salary;
		private MyDate dateHired;
		
		public Employee(String n, String a, String p, String e, int off, double sal) {
			super(n,a,p,e);
			if(off == 1) {
				this.hasOffice = "Yes";
			}
			else {
				this.hasOffice = "No";
			}
			this.salary = sal;
			this.dateHired = new MyDate();
		}
		
		public String toString() {
			return super.toString() + "\nHas an Office: " + hasOffice + "\nSalary: " + salary + "\nDate Hired: " + dateHired.toString();
		}
	}
	
	//Employee -> Faculty
	public static class Faculty extends Employee{
		
		private String hours,rank;
		
		public Faculty(String n,String a,String p,String e,int off, double sal,String offHours,String r) {
			super(n,a,p,e,off,sal);
			this.hours = offHours;
			this.rank = r;
		}
		
		public String toString() {
			return super.toString() + "\nOffice Hours: " + hours + "\nRank: " + rank;
		}
	}
	
	//Employee ->  Staff
	
	public static class Staff extends Employee{
		private String title;
		
		public Staff(String n,String a,String p,String e,int off,double sal,String t) {
			super(n,a,p,e,off,sal);
			this.title = t;
		}
		
		public String toString() {
		return super.toString() + "\nTitle: " + title;
		}
	}


}
