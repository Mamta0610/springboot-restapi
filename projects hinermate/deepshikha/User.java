package deepshikha;
//user class to represent a library user

import java.util.List;

public class User {
	
	private String name;
	private long phone;
	
	public User(String name, long phone) {
		super();
		this.name = name;
		this.phone = phone;
	}

	public String getName() {
		return name;
	}

	public long getPhone() {
		return phone;
	}
	
	public List<Book> getBorrowedBooks(){
		return getBorrowedBooks();
	}
	
	public void borrowBook(Book book) throws Exception {
		if(getBorrowedBooks().size()>=3) {
			throw new Exception("You cannot borrow more than 3 books at a time ");
		}if(!book.isAvailable()) {
			getBorrowedBooks().add(book);
			book.borrow();
		}else {
			throw new Exception("The book is already borrowed by someone else ");
		}
	}
	
  public void returnBook(Book book) throws Exception {
	  if(getBorrowedBooks().contains(book)) {
		  getBorrowedBooks().remove(book);
		  book.returnBook();
	  }else {
		  System.out.println("You havent borrowed book ");
	  }
  }
	
}
