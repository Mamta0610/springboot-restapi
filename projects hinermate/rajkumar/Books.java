package rajkumar;

public class Books extends MediaItem{
	
	String author;

	public Books(String title, String publisher, int year, String author) {
		super(title, publisher, year);
		this.author = author;
	}

	@Override
	public void displayInfo() {
		System.out.println("Book title "+ title);
		System.out.println("Book Author " + author);
		System.out.println("Book publisher " + publisher);
		System.out.println("Book launch year " + year);
		
	}

	@Override
	public void borrow() {
		System.out.println("You borrowed book " + title);
		
	}

	@Override
	public void returnItem() {
		System.out.println("You returned book " + title);
		
	}

}
