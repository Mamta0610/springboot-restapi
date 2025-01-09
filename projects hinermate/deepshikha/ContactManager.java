// fixed data type
// fixed size 
// traverse using index 
// index start 0 
// length nth-1

package deepshikha;
import java.util.Scanner;

public class ContactManager {
	
	private String[] names; //declare array
	private String[] phonenumbers;
	private static final int maxContacts = 10;
	private int contactCount;
	
	public ContactManager() {
		names = new String[maxContacts];
		phonenumbers = new String[maxContacts];
		contactCount =0;
	}

	public void addContacts(String name, String phoneNumber) {
		if(contactCount < maxContacts) { 
			names[contactCount] = name;
			phonenumbers[contactCount] = phoneNumber;
			contactCount++;
			System.out.println("Contact added " + name);
		}else {
			System.out.println("Contact list is fulled, no space");
		}
	}
	
	public void displayContacts() {
		System.out.println(" Contact List ");
		for(int i=0; i<contactCount;i++) {
			System.out.println(names[i] + " "+ phonenumbers[i]);
		}
	}
	
	public void searchContact(String name) {
		for(int i=0;i<contactCount;i++) {
			if(names[i].equalsIgnoreCase(name)) {
				System.out.println("Contact found : " + names[i] + " "+phonenumbers[i]);				
			}
		}
	}
	
	public void deleteContact(String name) {
		for(int i=0;i<contactCount;i++) {
			if(names[i].equalsIgnoreCase(name)) {
				for(int j=i;j<contactCount-1;j++) {
					names[j] = names[j+1];
					phonenumbers[j] = phonenumbers[j+1];
				}
				names[contactCount-1] = null;
				phonenumbers[contactCount-1] =null;
				contactCount--;
				System.out.println("Contact deleted " + name );
				return;
			}
		}
		System.out.println(" Contact Not Found ");
	}
	
	public void updateContact(String name, String newphoneNumber) {
		for(int i=0;i<contactCount;i++) {
			if(names[i].equalsIgnoreCase(name)) {
				phonenumbers[i] = newphoneNumber;
				System.out.println("Contact Updated " + name);
				return;
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ContactManager cc = new ContactManager();
		
		while(true) {
			System.out.println("1. ADD Contact ");
			System.out.println("2. View Contact ");
			System.out.println("3. Search Contact ");
			System.out.println("4. Delete Contact ");
			System.out.println("5. Update Contact ");
			System.out.println("6. Exit ");
			
			System.out.println(" Choose an Option ");
			int choice = sc.nextInt();
			
			sc.nextLine();
			
			switch(choice) {
			case 1: 
				System.out.println("Enter name ");
				String name = sc.nextLine();
				
				System.out.println(" Enter phone number ");
				String phoneNumber = sc.nextLine();
				
				cc.addContacts(name, phoneNumber);
				break;
			case 2 :
				cc.displayContacts();
				break;
			case 3 :
				System.out.println(" Enter name to search ");
				String conname = sc.nextLine();
				cc.searchContact(conname);
				break;
			case 4:
				System.out.println(" Enter name to delete  ");
				String connamee = sc.nextLine();
				cc.deleteContact(connamee);
				break;
			case 5:
				System.out.println(" Enter name to update ");
				String contname = sc.nextLine();
				System.out.println("Enter update number ");
				String upPhone = sc.nextLine();
				cc.updateContact(contname, upPhone);
				break;
			case 6 : 
				System.out.println(" Exiting ");
				return ; 
			default : 
				System.out.println(" Invalid ");
			}
		}

	}

}
