package rajkumar;

public class DVD extends MediaItem{
	
	String director;

	public DVD(String title, String publisher, int year, String director) {
		super(title, publisher, year);
		this.director = director;
	}

	@Override
	public void displayInfo() {
		System.out.println("DVD title " + title);
		System.out.println("DVD publisher " + publisher);
		System.out.println("DVD Director " + director);
		
	}

	@Override
	public void borrow() {
		System.out.println("You have borrowed DVD " + title);	
	}

	@Override
	public void returnItem() {
		System.out.println("You have returned DVD " + title);	
		
	}
	
	
}
