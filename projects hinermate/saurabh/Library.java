package saurabh;

import java.util.ArrayList;
import java.util.List;

//polymorphism
public class Library {
	
	private List<Book> books;
	private List<Member> members;
	
	public Library() {
	books = new ArrayList<Book>();
	members = new ArrayList<Member>();
	}
	
	public void addBook(Book book) {
		books.add(book);
	}
	
	public void registerMember(Member member) {
		members.add(member);
	}
	
	public void borrowBook(String title, Member member) {
		try {
		for(Book book : books) {
			if(book.getTitle().equalsIgnoreCase(title)) {	
					book.borrow();
				
				return;
				}}
		throw new BookNotFoundException("Book not found " + title);
	}catch(BookNotAvailableException | BookNotFoundException e) {
		System.out.println(e);	
	}
	}
	
	public void returnBook(String title) {
		try {
		for(Book book : books) {
			if(book.getTitle().equalsIgnoreCase(title)) {
				book.returnBook();
				
				return;
			}
		}throw new BookNotFoundException("Book Not found " +title);
	}catch(BookAlreadyReturnException | BookNotFoundException e) {
		System.out.println(e);
	}
	}
}
