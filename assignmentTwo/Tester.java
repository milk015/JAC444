package assignmentTwo;

//used to drive all three

import assignmentTwo.TaskOne.Employee;
import assignmentTwo.TaskOne.Faculty;
import assignmentTwo.TaskOne.Person;
import assignmentTwo.TaskOne.Staff;
import assignmentTwo.TaskOne.Student;

public class Tester {

	public static void main(String[] args) {
		
		Person p = new Person("Jorge","Woodbridge","647-555-5555","e@mail.com");
		//Person p = new Person();
		System.out.println("Person = "+p.toString());
		
		Student s = new Student("Jorge","Woodbridge","647-555-5555","e@mail.com",1);
		System.out.println("\nStudent = "+s.toString());
		
		
		Employee e = new Employee("Jorge","Woodbridge","647-555-5555","e@mail.com", 1,58000);
		System.out.println("\nEmployee = "+e.toString());
		
		Faculty f = new Faculty("Jorge","Woodbridge","647-555-5555","e@mail.com",1,60000,"9am - 5pm","Rank");
		System.out.println("\nFaculty = "+f.toString());
		
		Staff staff = new Staff("Jorge","Woodbridge","647-555-5555","e@mail.com", 1,58000,"Does Stuff");
		System.out.println("\nStaff = "+staff.toString());
		
		System.out.println("\n=================Task One End=====================\n");
		
		//tasktwo not working,
		
		
		System.out.println("\n=================Task Two End=====================\n");
		
		TaskThree task = new TaskThree();
		
		task.runTask();
		
		System.out.println("\n=================Task Three End===================\n");
	}

}
