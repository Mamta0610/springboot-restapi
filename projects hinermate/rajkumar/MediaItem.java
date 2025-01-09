package rajkumar;

abstract class MediaItem {
	
	String title;
	String publisher; 
	int year;
	
	public MediaItem(String title, String publisher, int year) {
		super();
		this.title = title;
		this.publisher = publisher;
		this.year = year;
	}
	
	public abstract void displayInfo();
	        
	public abstract void borrow();
	
	public abstract void returnItem();

}
