//set interface - implemented using hashset, treeset classes
// can contain unique elements only
// insertion order depends on type of set used 
//treeset - insertion in ascending order 

package rajkumar;
import java.util.Set;
import java.util.TreeSet;

public class StudentEnrollementSetEg {
	public static void main(String[] args) {
		Set<String> students = new TreeSet<String>();
		
		students.add("John");
		students.add("Sam");
		students.add("Rajkumar");
		students.add("Mamta");
		students.add("Kumar");
		students.add("Shiv");
		students.add("Abhishek");
		students.add("Vinod");
		students.add("Sam"); //duplicate
		students.add("Bob");
		
		System.out.println(" Students enrolled in the course computer science ");
		for(String student : students) {
			System.out.println(student);
		}
		
		students.remove("Shiv"); //delete
		
		System.out.println(" Updated Students in the course computer science ");
		for(String student : students) {
			System.out.println(student);
		}

	}

}
