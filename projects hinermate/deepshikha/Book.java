package deepshikha;

//book class to represent a book in the library
public class Book {
	
	private String title;
	private String author;
	private boolean isAvailable;
	
	public Book(String title, String author, boolean isAvailable) {
		this.title = title;
		this.author = author;
		this.isAvailable = true; //book is available
	}

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

	public boolean isAvailable() {
		return isAvailable;
	}

	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}
	
	public void borrow() throws Exception{
		if(!isAvailable) {
			throw new Exception("Book is already borrowed ");
		}
		isAvailable = false;
	}
	
	public void returnBook() throws Exception {
		if(isAvailable) {
			throw new Exception("Book was not borrowed ");
		}
		isAvailable = true;
	}

}
