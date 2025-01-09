package com.anpc8001.daoimpl;

import java.util.List;
import java.util.Scanner;
import java.util.Set;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import com.anpc8001.config.HibernateHelper;
import com.anpc8001.dao.TeacherDao;
import com.anpc8001.entity.Teacher;
import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validation;
import jakarta.validation.Validator;
import jakarta.validation.ValidatorFactory;

public class TeacherDaoimpl implements TeacherDao{
	Session session = HibernateHelper.getSessionFactory().openSession();
	Transaction transaction = session.beginTransaction();
	Scanner sc = new Scanner(System.in);	
	ValidatorFactory vf = Validation.buildDefaultValidatorFactory();
	Validator v = vf.getValidator();

	@SuppressWarnings("deprecation")
	@Override
	public void registerTeacher() {
		 try {// Get user input
	            System.out.println("Enter your first name:");
	            String tname = sc.next();

	            System.out.println("Enter your surname:");
	            String tsurname = sc.next();

	            System.out.println("Enter your email id:");
	            String temail = sc.next();

	            System.out.println("Enter your phone number:");
	            String tphone = sc.next();

	            // To handle addresses with spaces
	            sc.nextLine(); // Consume newline left-over from nextLong()

	            System.out.println("Enter your address:");
	            String taddr = sc.nextLine();

	            System.out.println("Enter your technicalskills:");
	            String technicalskills = sc.nextLine();

	            System.out.println("Enter your experience:");
	            String experience = sc.nextLine();

	            // Create and set values for Teacher entity
	            Teacher teacher1 = new Teacher();
	            teacher1.setTname(tname);
	            teacher1.setTsurname(tsurname);
	            teacher1.setTemailid(temail);
	            teacher1.setTphone(tphone);
	            teacher1.setTaddr(taddr);
	            teacher1.setTechnicalSkills(technicalskills);
	            teacher1.setExperience(experience);

	            // Validate the Student object
	            Set<ConstraintViolation<Teacher>> violations = v.validate(teacher1);
	            if (violations.isEmpty()) {
	                // Save and commit if no validation errors
	                session.save(teacher1);
	                transaction.commit();
	                System.out.println("teacher registered successfully.");
	            } else {
	                // Print validation errors
	                for (ConstraintViolation<Teacher> violation : violations) {
	                    System.out.println(violation.getMessage());
	                }
	                transaction.rollback(); // Rollback transaction if validation fails
	            }
	        } catch (Exception e) {
	            if (transaction != null) transaction.rollback();
	            e.printStackTrace();
	        } 		
	}

	@Override
	public void viewTeacherDetails() {
        try {
        	System.out.println("Enter your teacher ID:");
            long id1 = sc.nextInt();

            // Fetch the teacher object from the database using the provided ID
            Teacher teacher = session.get(Teacher.class, id1);

            if (teacher != null) {
                System.out.println(teacher.getId() + " " +
                        teacher.getTname() + " " +
                        teacher.getTsurname() + " " +
                        teacher.getTphone() + " " +
                        teacher.getTemailid() + " " +
                        teacher.getTaddr() + " " +
                        teacher.getTechnicalSkills() + " " +
                        teacher.getExperience());
            } else {
                System.out.println("No teacher found with ID: " + id1);
            }
        }catch(Exception e) {
            System.out.println(e);	
            }
	}

	 @Override
	public List<Teacher> getAllTeachers() {
	        try {
	            Query<Teacher> query = session.createQuery("FROM Teacher", Teacher.class);
	            List<Teacher> teachers = query.list();

	            if (teachers.isEmpty()) {
	                System.out.println("No teachers found.");
	            } else {
	                for (Teacher teacher : teachers) {
	                    System.out.println(teacher.getId() + " " +
	                            teacher.getTname() + " " +
	                            teacher.getTsurname() + " " +
	                            teacher.getTphone() + " " +
	                            teacher.getTemailid() + " " +
	                            teacher.getTaddr() + " " +
	                            teacher.getTechnicalSkills() + " " +
	                            teacher.getExperience());
	                }
	            }
	            return teachers;
	        } catch (Exception e) {
	            e.printStackTrace();
	            return null;
	        }
	    }

	@SuppressWarnings("deprecation")
	@Override
	public void updateTeacherDetails() {
    try {
        System.out.println("Enter teacher id");
        int tid = sc.nextInt();

        Teacher teacher2 = session.get(Teacher.class, tid);

        if (teacher2 != null) {
            System.out.println("What details you want to modify?");
            System.out.println("1. Teachnical Skills ");
            System.out.println("2. Address");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter updated technical skills:");
                    String technical = sc.next();
                    teacher2.setTechnicalSkills(technical);
                    break;
                case 2:
                    System.out.println("Enter updated address:");
                    sc.nextLine(); // consume newline
                    String newAddr = sc.nextLine();
                    teacher2.setTaddr(newAddr);
                    break;
                default:
                    System.out.println("Invalid choice.");
                    return;
            }
            session.update(teacher2);
            transaction.commit();
            System.out.println("Details updated.");
        } else {
            System.out.println("No such teacher exists.");
        }
    } catch (Exception e) {
        if (transaction != null) transaction.rollback();
        e.printStackTrace();
    } 

}
}
