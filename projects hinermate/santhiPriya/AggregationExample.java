package santhiPriya;

public class AggregationExample {

	public static void main(String[] args) {
		Employee e = new Employee("Sam", "John", 9876543, "sam@gmail.co");
		Employee e1 = new Employee("mamta", "boga", 7891234, "mamt@gmail.com");
		Department d = new Department("IT", "Bob", 8765432, e);
		Department d1 = new Department("Admin", "Alice", 7890654, e1);
		
		d.displayDeptInfo();
		d1.displayDeptInfo();

	}

}
