package com.anpc8001.daoimpl;

import java.util.List;
import java.util.Scanner;
import java.util.Set;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import com.anpc8001.config.HibernateHelper;
import com.anpc8001.dao.StudentDao;
import com.anpc8001.entity.Batches;
import com.anpc8001.entity.Courses;
import com.anpc8001.entity.Student;
import jakarta.persistence.TypedQuery;
import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validation;
import jakarta.validation.Validator;
import jakarta.validation.ValidatorFactory;

public class StudentDaoImpl implements StudentDao {
	Session session = HibernateHelper.getSessionFactory().openSession();
	Transaction transaction = session.beginTransaction();
	Scanner sc = new Scanner(System.in);	
	ValidatorFactory vf = Validation.buildDefaultValidatorFactory();
	Validator v = vf.getValidator();

    @SuppressWarnings("deprecation")
	@Override
    public void registerStudent() {
        try {// Get user input
            System.out.println("Enter your first name:");
            String fname = sc.next();

            System.out.println("Enter your surname:");
            String surname = sc.next();

            System.out.println("Enter your email id:");
            String email = sc.next();

            System.out.println("Enter your phone number:");
            String phone = sc.next();

            // To handle addresses with spaces
            sc.nextLine(); // Consume newline left-over from nextLong()

            System.out.println("Enter your address:");
            String addr = sc.nextLine();

            System.out.println("Enter your qualification:");
            String qual = sc.next();

            System.out.println("Enter your passout year:");
            int passout = sc.nextInt();
            
            System.out.println("Enter Course ID (cid):");
	        int cid = sc.nextInt();
	        sc.nextLine();  // Consume newline
	        
            // Create and set values for Student entity
            Student student = new Student();
            student.setSname(fname);
            student.setSurname(surname);
            student.setSemail(email);
            student.setSphone(phone);
            student.setSaddr(addr);
            student.setSqual(qual);
            student.setSpassout(passout);
            
            // Fetch the Courses entity based on cid
	        Courses course = session.get(Courses.class, cid);
	        
	        // Set the course and teacher relationships
	        student.setCourses(course);

            // Validate the Student object
            Set<ConstraintViolation<Student>> violations = v.validate(student);
            if (violations.isEmpty()) {
                // Save and commit if no validation errors
                session.save(student);
                transaction.commit();
                System.out.println("Student registered successfully.");
            } else {
                // Print validation errors
                for (ConstraintViolation<Student> violation : violations) {
                    System.out.println(violation.getMessage());
                }
                transaction.rollback(); // Rollback transaction if validation fails
            }
        } catch (Exception e) {
            if (transaction != null) transaction.rollback();
            e.printStackTrace();
        } 
    }

    public List<Student> viewStudentDetail() {
        try {
            Query<Student> query = session.createQuery("FROM Student", Student.class);
            List<Student> students = query.list();

            if (students.isEmpty()) {
                System.out.println("No students found.");
            } else {
                for (Student student : students) {
                    String batchCode = student.getBatch() != null ? student.getBatch().getBcode() : "No Batch";
                    System.out.println(student.getSid() + " " +
                            student.getSname() + " " +
                            student.getSurname() + " " +
                            student.getSphone() + " " +
                            student.getSemail() + " " +
                            student.getSaddr() + " " +
                            student.getSqual() + " " +
                            student.getSpassout() + " " +
                            "Batch Code: " + batchCode+ " " +student.getCourses().getCid());
                }
            }
            return students;
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }
  
    @Override
    public void viewStudentDetailById() {
        try {
            System.out.println("Enter your student ID:");
            int id = sc.nextInt();

            // Fetch the student object from the database using the provided ID
            Student student = session.get(Student.class, id);

            if (student != null) {
                String batchCode = student.getBatch() != null ? student.getBatch().getBcode() : "No Batch";
                System.out.println(student.getSid() + " " +
                        student.getSname() + " " +
                        student.getSurname() + " " +
                        student.getSphone() + " " +
                        student.getSemail() + " " +
                        student.getSaddr() + " " +
                        student.getSqual() + " " +
                        student.getSpassout() + " " +
                        "Batch Code: " + batchCode);
            } else {
                System.out.println("No student found with ID: " + id);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
   
    public void viewStudentByName(String sname) {
        try {
            TypedQuery<Student> query = session.createQuery(
                "Select s from Student s where s.sname =:sname", Student.class);
            query.setParameter("sname", sname);
            List<Student> students = query.getResultList();

            if (students.isEmpty()) {
                System.out.println("No student found with Name: " + sname);
            } else {
                // Print the list of students
                for (Student student : students) {
                    String batchCode = student.getBatch() != null ? student.getBatch().getBcode() : "No Batch";
                    System.out.println(student.getSid() + " " +
                            student.getSname() + " " +
                            student.getSphone() + " " +
                            student.getSaddr() + " " +
                            "Batch Code: " + batchCode);
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

	@SuppressWarnings("deprecation")
	@Override
	public void addBatchCode() {
		 try {
	            System.out.println("Enter student id");
	            int sid = sc.nextInt();
	            Student student = session.get(Student.class, sid);
	            if (student != null) {
	                       System.out.println("Enter new batch code:");
	                        String newBatchCode = sc.next();

	                        Batches newBatch = session.get(Batches.class, newBatchCode);

	                        if (newBatch != null) {
	                            student.setBatch(newBatch);
	                        } else {
	                            System.out.println("No such batch exists.");
	                            return;
	                        }
	                session.update(student);
	                transaction.commit();
	                System.out.println("Details updated.");
	            } else {
	                System.out.println("No such student exists.");
	            }
	        } catch (Exception e) {
	        	System.out.println(e);
	        }
		
	}

    @SuppressWarnings("deprecation")
	@Override
    public void editStudentDetail(){
        try {
            System.out.println("Enter student id");
            int sid = sc.nextInt();
            Student student = session.get(Student.class, sid);
            if (student != null) {
                System.out.println("What details do you want to modify?");
                System.out.println("1. Phone Number ");
                System.out.println("2. Address");
                System.out.println("3. Email ID");
                System.out.println("4. Batch Code"); // New option for updating batch code
                int choice = sc.nextInt();
                switch (choice) {
                    case 1:
                        System.out.println("Enter updated phone number:");
                        String newPhone = sc.next();
                        student.setSphone(newPhone);
                        break;
                    case 2:
                        System.out.println("Enter updated address:");
                        sc.nextLine(); // consume newline
                        String newAddr = sc.nextLine();
                        student.setSaddr(newAddr);
                        break;
                    case 3:
                        System.out.println("Enter updated email ID:");
                        String newEmail = sc.next();
                        student.setSemail(newEmail);
                        break;
                  case 4:
                        System.out.println("Enter new batch code:");
                        String newBatchCode = sc.next();

                        Batches newBatch = session.get(Batches.class, newBatchCode);

                        if (newBatch != null) {
                            student.setBatch(newBatch);
                        } else {
                            System.out.println("No such batch exists.");
                            return;
                        }
                        break;
                    default:
                        System.out.println("Invalid choice.");
                        return;
                }
                session.update(student);
                transaction.commit();
                System.out.println("Details updated.");
            } else {
                System.out.println("No such student exists.");
            }
        } catch (Exception e) {
            if (transaction != null) transaction.rollback();
            e.printStackTrace();
        }
    }
    
   

   
}
