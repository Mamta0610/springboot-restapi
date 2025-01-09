package deepshikha;

public class LibraryMgmt {

	public static void main(String[] args) {
		Library library = new Library();
		
		Book book1 = new Book("abc", "aaa", true);
		Book book2 = new Book("def", "baa", true);
		Book book3 = new Book("ghi", "caa", true);
		Book book4 = new Book("zxr", "daa", true);
		Book book5 = new Book("aqaw", "eaa", true);
		
		library.addBook(book1);
		library.addBook(book2);
		library.addBook(book3);
		library.addBook(book4);
		library.addBook(book5);
		
		User user1 = new User("John", 98765432);
		User user2 = new User("Sam", 87654320);
		User user3 = new User("Alice", 60765432);
		
		library.addUser(user1);
		library.addUser(user2);
		library.addUser(user3);
		
		library.displayBook();
		
		//user1 tries to borrow book 
		try {
			user1.borrowBook(book1);
		}catch(Exception e) {
			System.out.println("Error : " + e.getMessage());
		}
		
		//user1 tries to borrow same book again
		try {
			user1.borrowBook(book1);
		}catch(Exception e) {
			System.out.println("Error : " + e.getMessage());
		}
		
		//user2 tries to borrow same book which is already borrowed by someone
				try {
					user2.borrowBook(book1);
				}catch(Exception e) {
					System.out.println("Error : " + e.getMessage());
				}
	//user1 return the book
				try {
					user1.returnBook(book1);
				} catch (Exception e) {
					System.out.println("Error : " + e.getMessage());
				}
		
	}

}
