//Dynamic size : automatically grows or shrink as you add or remove elements unlike arrays which are fixed size
//random access
//easy of use -- add(), remove(), size()
// list - insertion order maintains, allow duplicate elements


package deepshikha;

public class ArrayListExample {

	public static void main(String[] args) {
		Classroom cl = new Classroom();
		
		//create some student objects
		Student s1 = new Student("abc", 123451111, 67);
		Student s2 = new Student("def", 755222, 70);
		Student s3 = new Student("ghgj", 98800, 55.7);
		Student s4 = new Student("abc", 777666, 45);
		Student s5 = new Student("qwr", 467687, 89);
		Student s6 = new Student("piyy", 43565789, 66);
		
		//add students in the classroom
		cl.addStudent(s1);
		cl.addStudent(s2);
		cl.addStudent(s3);
		cl.addStudent(s4);
		cl.addStudent(s5);
		cl.addStudent(s6);
		
		//display students 
		cl.displayStudents();
		
		//remove student
		cl.removeStudent("qwr");
		
		//display students 
				cl.displayStudents();
							
	Student s7 = new Student("oooo", 43565789, 66);
	Student s8 = new Student("ghhjas", 43565789, 66);
	Student s9 = new Student("poiiu", 43565789, 66);
	
	cl.addStudent(s8);
	cl.addStudent(s9);
	cl.addStudent(s7);
	
	//display students 
	cl.displayStudents();
	
	//display number of student count 
	System.out.println(cl.getStudentCount());
	
	}
}
