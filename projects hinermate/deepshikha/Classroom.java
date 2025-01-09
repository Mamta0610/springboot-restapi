package deepshikha;

import java.util.ArrayList;

public class Classroom {
	private ArrayList<Student> students;
	
	public Classroom() {
		students = new ArrayList<Student>();
	}
	
	//add a student to the classroom
	public void addStudent(Student student) {
		students.add(student);
	}
	
	//remove a student by name
	public boolean removeStudent(String studentName) {
		for(Student student : students) {
			if(student.getName().equals(studentName)) {
				students.remove(student);
				return true;
			}
		}
		return false;
	}
	
	//get the list of students
	public void displayStudents() {
		if(students.isEmpty()) {
			System.out.println("No students in classroom");
		}else {
			System.out.println("List of students in the classroom ");
			for(Student student : students) {
				System.out.println(student);
			}
		}
	}
	//get the number of students in the classroom 
	public int getStudentCount() {
		return students.size();
	}
}
