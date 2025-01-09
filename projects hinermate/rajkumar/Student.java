package rajkumar;

public class Student {	
	private String name;
	private int age;
	private long idproof;
	
	public Student(String name, int age, long idproof) {
		super();
		this.name = name;
		this.age = age;
		this.idproof = idproof;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public long getIdproof() {
		return idproof;
	}

	public void setIdproof(long idproof) {
		this.idproof = idproof;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", idproof=" + idproof + "]";
	}
	
	

}
