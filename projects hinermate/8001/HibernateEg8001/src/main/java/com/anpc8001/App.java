package com.anpc8001;

import java.util.Scanner;
import com.anpc8001.daoimpl.AdminDaoImpl;
import com.anpc8001.daoimpl.BatchesDaoImpl;
import com.anpc8001.daoimpl.CourseDaoImpl;
import com.anpc8001.daoimpl.StudentDaoImpl;
import com.anpc8001.daoimpl.TeacherDaoimpl;

public class App {
    public static void main(String[] args) {
        AdminDaoImpl adminDao = new AdminDaoImpl();
        StudentDaoImpl simpl = new StudentDaoImpl();
        TeacherDaoimpl tdao = new TeacherDaoimpl();
        CourseDaoImpl cimpl = new CourseDaoImpl();
        BatchesDaoImpl bimpl = new BatchesDaoImpl();
        Scanner sc = new Scanner(System.in);
        boolean loggedIn = false;

        // Admin Login
        while (!loggedIn) {
            System.out.print("Enter admin username: ");
            String username = sc.next();

            System.out.print("Enter admin password: ");
            String password = sc.next();

            loggedIn = adminDao.login(username, password);

            if (!loggedIn) {
                System.out.println("Invalid username or password. Please try again.");
            }
        }

        System.out.println("Login successful. Welcome!");

        try {
            char mainMenuChoice;
            do {
                System.out.println("Main Menu");
                System.out.println("1. Student ");
                System.out.println("2. Teacher ");
                System.out.println("3. Courses ");
                System.out.println("4. Batches ");
                System.out.println("5. Exit");
                System.out.print("Enter choice: ");

                while (!sc.hasNextInt()) {
                    System.out.println("Invalid input. Please enter a number between 1 and 3.");
                    sc.next(); // clear invalid input
                }

                int mainChoice = sc.nextInt();
                sc.nextLine(); // consume the newline left-over

                switch (mainChoice) {
                    case 1:
                        // Student Submenu
                        studentMenu(simpl, sc);
                        break;
                    case 2:
                        // Teacher Submenu
                        teacherMenu(tdao, sc);
                        break;
                    case 3:
                        // Course Submenu
                        courseMenu(cimpl, sc);
                        break;
                    case 4:
                        // Batches Submenu
                        batchesMenu(bimpl, sc);
                        break;
                    case 5:
                        System.out.println("Exiting... Thank you!");
                        return;
                    default:
                        System.out.println("Incorrect choice entered. Please try again.");
                        break;
                }

                System.out.print("Do you want to return to the main menu? (Y/N): ");
                String input = sc.nextLine().trim();
                mainMenuChoice = (input.isEmpty() || (input.charAt(0) != 'Y' && input.charAt(0) != 'y')) ? 'N' : 'Y';

            } while (mainMenuChoice == 'Y' || mainMenuChoice == 'y');

            System.out.println("Thank You..");

        } finally {
            sc.close();  // Ensure that the Scanner is closed
        }
    }

    // Student Menu
    private static void studentMenu(StudentDaoImpl simpl, Scanner sc) {
        char studentMenuChoice;
        do {
            System.out.println("Students System");
            System.out.println("1. Register Student");
            System.out.println("2. View All Students");
            System.out.println("3. View Student by Id");
            System.out.println("4. Edit Student Details ");
            System.out.println("5. View Student by Name");
            System.out.println("6. Add batch code");
            System.out.println("7. Back to Main Menu");
            System.out.print("Enter choice: ");

            while (!sc.hasNextInt()) {
                System.out.println("Invalid input. Please enter a number between 1 and 5.");
                sc.next(); // clear invalid input
            }

            int choice = sc.nextInt();
            sc.nextLine(); // consume the newline left-over

            switch (choice) {
                case 1:
                    simpl.registerStudent();
                    break;
                case 2:
                    simpl.viewStudentDetail();
                    break;
                case 3:
                    simpl.viewStudentDetailById();
                    break;
                case 4:
                    simpl.editStudentDetail();
                    break;
                case 5:
                    System.out.print("Enter the student's name to search: ");
                    String studentName = sc.nextLine();
                    simpl.viewStudentByName(studentName);
                    break;
                case 6 :
                	simpl.addBatchCode();
                	break;
                case 7:
                    return; // Back to main menu
                default:
                    System.out.println("Incorrect choice entered. Please try again.");
                    break;
            }

            System.out.print("Do you want to continue in the Student Menu? (Y/N): ");
            String input = sc.nextLine().trim();
            studentMenuChoice = (input.isEmpty() || (input.charAt(0) != 'Y' && input.charAt(0) != 'y')) ? 'N' : 'Y';

        } while (studentMenuChoice == 'Y' || studentMenuChoice == 'y');
    }

    // Teacher Menu
    private static void teacherMenu(TeacherDaoimpl tdao, Scanner sc) {
        char teacherMenuChoice;
        do {
            System.out.println("Teachers System");
            System.out.println("1. Register Teacher");
            System.out.println("2. View Teacher by Id");
            System.out.println("3. Edit Teacher Details");
            System.out.println("4. View All Teachers");
            System.out.println("5. Back to Main Menu");
            System.out.print("Enter choice: ");

            while (!sc.hasNextInt()) {
                System.out.println("Invalid input. Please enter a number between 1 and 5.");
                sc.next(); // clear invalid input
            }

            int choice = sc.nextInt();
            sc.nextLine(); // consume the newline left-over

            switch (choice) {
                case 1:
                    tdao.registerTeacher();
                    break;
                case 2:
                    tdao.viewTeacherDetails();
                    break;
                case 3:
                	tdao.updateTeacherDetails();
                	break;
                case 4:
                    tdao.getAllTeachers();
                    break;
                case 5:
                    return; // Back to main menu
                default:
                    System.out.println("Incorrect choice entered. Please try again.");
                    break;
            }

            System.out.print("Do you want to continue in the Teacher Menu? (Y/N): ");
            String input = sc.nextLine().trim();
            teacherMenuChoice = (input.isEmpty() || (input.charAt(0) != 'Y' && input.charAt(0) != 'y')) ? 'N' : 'Y';

        } while (teacherMenuChoice == 'Y' || teacherMenuChoice == 'y');
    }

 // Course Menu
    private static void courseMenu(CourseDaoImpl cimpl, Scanner sc) {
        char courseMenuChoice;
        do {
            System.out.println("Course System");
            System.out.println("1. Add new Course ");
            System.out.println("2. View Course by Id");
            System.out.println("3. View Course by course code");
            System.out.println("4. View All Courses");
            System.out.println("5. Back to Main Menu");
            System.out.print("Enter choice: ");

            while (!sc.hasNextInt()) {
                System.out.println("Invalid input. Please enter a number between 1 and 5.");
                sc.next(); // clear invalid input
            }

            int choice = sc.nextInt();
            sc.nextLine(); // consume the newline left-over

            switch (choice) {
                case 1:
                    cimpl.addNewCourse();
                    break;
                case 2:
                    cimpl.viewCourseById();
                    break;
                case 3:
                	System.out.print("Enter the course code to search: ");
                    String courseCode = sc.nextLine();
                    cimpl.viewCourseByCode(courseCode);
                    break;
                case 4:
                    cimpl.getAllCourses();
                    break;
                case 5:
                    return; // Back to main menu
                default:
                    System.out.println("Incorrect choice entered. Please try again.");
                    break;
            }

            System.out.print("Do you want to continue in the Course Menu? (Y/N): ");
            String input = sc.nextLine().trim();
            courseMenuChoice = (input.isEmpty() || (input.charAt(0) != 'Y' && input.charAt(0) != 'y')) ? 'N' : 'Y';

        } while (courseMenuChoice == 'Y' || courseMenuChoice == 'y');
    }

    //Batches Menu
    private static void batchesMenu(BatchesDaoImpl bi, Scanner sc) {
        char batchMenuChoice;
        do {
            System.out.println("Batch System");
            System.out.println("1. create new Batch");
            System.out.println("2. View Batch by Id");
            System.out.println("3. View batch by center");
            System.out.println("4. View All Batches");
            System.out.println("5.Update the Batch Details");
            System.out.println("6. Back to Main Menu");
            System.out.print("Enter choice: ");

            while (!sc.hasNextInt()) {
                System.out.println("Invalid input. Please enter a number between 1 and 5.");
                sc.next(); // clear invalid input
            }

            int choice = sc.nextInt();
            sc.nextLine(); // consume the newline left-over

            switch (choice) {
                case 1:
                	bi.createNewBatch();
                    break;
                case 2:
                	bi.viewBatchById();
                    break;
                case 3 : 
                	System.out.println("Enter center code to search");
                	String centerCode = sc.nextLine();
                	bi.viewBatchByCenter(centerCode);
                	break;
                case 4:
                	bi.getAllBatches();
                	break;
                case 5:
                	bi.updateBatchDetails();
                	break;	
                case 6:
                    return; // Back to main menu
                default:
                    System.out.println("Incorrect choice entered. Please try again.");
                    break;
            }

            System.out.print("Do you want to continue in the Batch Menu? (Y/N): ");
            String input = sc.nextLine().trim();
            batchMenuChoice = (input.isEmpty() || (input.charAt(0) != 'Y' && input.charAt(0) != 'y')) ? 'N' : 'Y';

        } while (batchMenuChoice == 'Y' || batchMenuChoice == 'y');
    }

}
