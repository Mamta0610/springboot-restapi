package saurabh;

//inheritance
public class Member {
	
	private String name;
	private int memberId;
	
	public Member(String name, int memberId) {
		super();
		this.name = name;
		this.memberId = memberId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMemberId() {
		return memberId;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}
	
	

}
