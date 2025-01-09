// list interface - implemented using arraylist, linkedlist classes
// can maintain insertion order
// can contain duplicate elements
//arraylist - dynamic array, store values based on index
//linkedlist - implement list, data-nextaddr

package rajkumar;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class StudentRegistrationListEg {
	private List<Student> students;

	public StudentRegistrationListEg() {
		students = new LinkedList<Student>();
	}
	
	public void addStudent(String name, int age, long idproof) {
		students.add(new Student(name, age, idproof));
		System.out.println("Added Successfully " + name );
	}
	
	public void removeStudent(long idproof) {
		boolean found = false;
		for(Student student : students) {
			if(student.getIdproof() == idproof) {
				students.remove(student);
				System.out.println("Student removed ");
				found =true;
				break;
			}
		}if(!found) {
			System.out.println("Student not found ");
		}
	}
	
	public void displayStudents() {
		if(students.isEmpty()) {
			System.out.println(" No students registered ");
		}else {
			System.out.println("List of Registered students ");
			for(Student student : students) {
				System.out.println(student);
			}
		}
	}


	public static void main(String[] args) {
		StudentRegistrationListEg sr = new StudentRegistrationListEg();
Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println(" Student Registeration Application ");
			System.out.println("1. Add");
			System.out.println("2. Remove");
			System.out.println("3. View Tasks");
			System.out.println("4. Exit");
			System.out.println("Choose an option ");
			int choice = sc.nextInt();
			sc.nextLine();
			
			switch(choice) {
			case 1:
				System.out.println("Enter student name");
				String name = sc.nextLine();
				System.out.println("Enter student age");
				int age = sc.nextInt();
				System.out.println("Enter student idproof");
				long idproof = sc.nextLong();
				sc.nextLine();
				sr.addStudent(name, age, idproof);
				break;
			case 2:
				System.out.println("Enter student id to remove");
				int rid = sc.nextInt();
				sr.removeStudent(rid);
				break;
			case 3:
				sr.displayStudents();
				break;
			case 4:
				System.out.println(" bye ");
				sc.close();
				return;
			default:
				System.out.println(" Invalid ");
			}
		}
	}
}
