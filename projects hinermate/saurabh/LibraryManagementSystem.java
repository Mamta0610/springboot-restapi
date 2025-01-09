package saurabh;

public class LibraryManagementSystem {

	public static void main(String[] args) {
		Library library = new Library();
		
		//adding books
		Book b1 = new Book("Java", "abc", true);
		Book b2 = new Book("data structure", "def", false);
		Book b3 = new Book("rest api", "xyz", false);
		
		library.addBook(b1);
		library.addBook(b2);
		library.addBook(b3);
		
		//register member
		Member m1 = new Member("qwe", 123);
		Member m2 = new Member("azx", 124);
	
		library.registerMember(m1);
		library.registerMember(m2);
		
		//borrow a book
		library.borrowBook("Java", m2);
		
		library.borrowBook("Java", m1); //trying to borrow again 
		
		library.borrowBook("database", m1); //trying book to borrow wch is not found in library
		
		// return a book
		library.returnBook("Java");
		
		
		
	}

}
