package saurabh;

public class Book {
	
	// encapsulation
	private String title;
	private String author;
	private boolean isavaliable;
	
	// parameter constructor
	public Book(String title, String author, boolean isavaliable) {
		super();
		this.title = title;
		this.author = author;
		this.isavaliable = isavaliable;
	}

	//public getter - setter 
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public boolean isIsavaliable() {
		return isavaliable;
	}

	public void setIsavaliable(boolean isavaliable) {
		this.isavaliable = isavaliable;
	}
	
	//default method 
	public void borrow() throws BookNotAvailableException{
		if(isavaliable) {
			isavaliable=false;
			System.out.println("You borrowed " + title);
		}else {
		throw new BookNotAvailableException("Sorry currently not avaliable ");
		}
	}
	public void returnBook() throws BookAlreadyReturnException{
	if(isavaliable) {	 isavaliable= true;
		System.out.println("You returned "+ title);
	}else {
		throw new BookAlreadyReturnException("You cannot reutrn book because it was not borrowed ");
		}
	}
}
