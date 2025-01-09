//map interface - implemented using hashmap & treemap classes
// contains an entry : a pair of key & value
// key are always unique but value can be duplicate
// insertion depends on type of map used

package rajkumar;
import java.util.Map;
import java.util.TreeMap;

public class StudentGradeMapEg {
	public static void main(String[] args) {
		Map<Integer, String> studentgrade = new TreeMap<Integer, String>();
		
		studentgrade.put(101, "A grade");
		studentgrade.put(102, "B grade");
		studentgrade.put(103, "C grade");
		studentgrade.put(105, "A+ grade");
		studentgrade.put(108, "A grade"); 
		studentgrade.put(106, "fail");
		studentgrade.put(107, "B grade"); //duplicate values
		studentgrade.put(101, "D grade"); //duplicate key, value get updated
		
		System.out.println("Students Grades ");
		for(Map.Entry<Integer, String> entry :studentgrade.entrySet()) {
			System.out.println(entry.getKey() +" "+ entry.getValue());
			
		}
		
		studentgrade.remove(106); //delete
		
		System.out.println("Students Grades ");
		for(Map.Entry<Integer, String> entry :studentgrade.entrySet()) {
			System.out.println(entry.getKey() +" "+ entry.getValue());
			
		}
	}

}
 