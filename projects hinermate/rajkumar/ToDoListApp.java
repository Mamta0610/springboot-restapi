package rajkumar;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ToDoListApp {
	
	//list to store tasks
	private List<String> tasks;

	public ToDoListApp() {
		tasks = new ArrayList<String>();
	}
	
	//method to add a task 
	public void addTask(String task) {
		tasks.add(task);
		System.out.println("Task added : " + task);
	}
	
	//method to remove a task
	public void removeTask(int index) {
		if(index>=0 && index<tasks.size()) {
			System.out.println("Task removed " + tasks.remove(index));
		}else {
			System.out.println("Invalid index. No task removed ");
		}
	}
	
	//method to display all tasks
	public void displayTasks() {
		if(tasks.isEmpty()) {
			System.out.println("No tasks to display ");
		}else {
			System.out.println("Your to-do list ");
			for(int i=0;i<tasks.size();i++) {
				System.out.println(tasks.get(i));
			}
		}
	}
	
	public static void main(String args[]) {
		ToDoListApp td = new ToDoListApp();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println(" To-Do List Application ");
			System.out.println("1. Add");
			System.out.println("2. Remove");
			System.out.println("3. View Tasks");
			System.out.println("4. Exit");
			System.out.println("Choose an option ");
			int choice = sc.nextInt();
			sc.nextLine();
			
			switch(choice) {
			case 1:
				System.out.println(" Enter the task description ");
				String task = sc.nextLine();
				td.addTask(task);
				break;
			case 2:
				td.displayTasks();
				System.out.println("Enter the task number to remove ");
				int taskNumber = sc.nextInt();
				td.removeTask(taskNumber);
				break;
			case 3 :
				td.displayTasks();
				break;
			case 4 :
				System.out.println(" bye ");
				sc.close();
				return;
			default :
				System.out.println("Invalid choice enter ");
			}
		}
	}
}
