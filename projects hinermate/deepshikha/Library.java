package deepshikha;

import java.util.ArrayList;

//library class to manage books using collection
public class Library {
	private ArrayList<User> users;
	private ArrayList<Book> books;
	
	public Library() {
		this.users = new ArrayList<User>();
		this.books = new ArrayList<Book>();
	}

	public void addBook(Book book) {
		books.add(book);
	}
	
	public void addUser(User user) {
		users.add(user);
	}
	
	public void displayBook() {
		System.out.println("Books in library ");
		for(Book bk : books) {
			System.out.println(bk);
		}
	}
	
	public Book findBookByTitle(String title) {
		for(Book book : books) {
			if(book.getTitle().equalsIgnoreCase(title)) {
				return book;
			}
		}
		return null;
	}
}
