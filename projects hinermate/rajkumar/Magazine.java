package rajkumar;

public class Magazine extends MediaItem{
	
	int issueNumber;

	public Magazine(String title, String publisher, int year, int issueNumber) {
		super(title, publisher, year);
		this.issueNumber = issueNumber;
	}

	@Override
	public void displayInfo() {
		System.out.println("Magazine title " + title);
		System.out.println("Magazine publisher " + publisher);
		System.out.println("Issue number " + issueNumber);
	}

	@Override
	public void borrow() {
		System.out.println("You have borrowed magazine " + title);		
	}

	@Override
	public void returnItem() {
		System.out.println("You have returned magazine " + title);		
	}
	
	
}
