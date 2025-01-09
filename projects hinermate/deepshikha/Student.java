package deepshikha;

public class Student {
	
	private String name;
	private long phone;
	private double grade;
	
	public Student(String name, long i, double grade) {
		this.name = name;
		this.phone = i;
		this.grade = grade;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public double getGrade() {
		return grade;
	}

	public void setGrade(double grade) {
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", phone=" + phone + ", grade=" + grade + "]";
	}
	
	
	

}
