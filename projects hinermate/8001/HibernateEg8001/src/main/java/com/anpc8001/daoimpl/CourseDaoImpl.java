package com.anpc8001.daoimpl;

import java.util.List;
import java.util.Scanner;
import java.util.Set;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import com.anpc8001.config.HibernateHelper;
import com.anpc8001.dao.CourseDao;
import com.anpc8001.entity.Courses;
import jakarta.persistence.TypedQuery;
import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validation;
import jakarta.validation.Validator;
import jakarta.validation.ValidatorFactory;

public class CourseDaoImpl implements CourseDao{
	Session session = HibernateHelper.getSessionFactory().openSession();
	Transaction transaction = session.beginTransaction();
	Scanner sc = new Scanner(System.in);	
	ValidatorFactory vf = Validation.buildDefaultValidatorFactory();
	Validator v = vf.getValidator();

	@SuppressWarnings("deprecation")
	@Override
	public void addNewCourse() {
		 try {
		        // Get user input
		        System.out.println("Enter course ID (cid):");
		        int cid = sc.nextInt();
		        sc.nextLine();  // Consume newline

		        System.out.println("Enter course name:");
		        String cname = sc.nextLine();

		        System.out.println("Enter course code:");
		        String ccode = sc.nextLine();

		        System.out.println("Enter duration:");
		        int duration = sc.nextInt();

		        System.out.println("Enter min batch size:");
		        int minn = sc.nextInt();

		        System.out.println("Enter max batch size:");
		        int maxx = sc.nextInt();

		        System.out.println("Enter prerequisites (true/false):");
		        boolean prerequisites = sc.nextBoolean();

		        System.out.println("Enter placement support (true/false):");
		        boolean psupport = sc.nextBoolean();
		        sc.nextLine();  // Consume newline

		        System.out.println("Enter pretest details:");
		        String pretest = sc.nextLine();

		        System.out.println("Enter modules name:");
		        String module = sc.nextLine();

	            // Create and set values for Course entity
	            Courses c1 = new Courses();
	            c1.setCid(cid);
	            c1.setCourseName(cname);
	            c1.setCourseCode(ccode);
	            c1.setCourseModules(module);
	            c1.setDuration(duration);
	            c1.setMinBatchSize(minn);
	            c1.setMaxBatchSize(maxx); 
	            c1.setPrerequisites(prerequisites);
	            c1.setPlacementSupport(psupport);
	            c1.setPretest(pretest);

	            // Validate the Student object
	            Set<ConstraintViolation<Courses>> violations = v.validate(c1);
	            if (violations.isEmpty()) {
	                // Save and commit if no validation errors
	                session.save(c1);
	                transaction.commit();
	                System.out.println("course added successfully.");
	            } else {
	                // Print validation errors
	                for (ConstraintViolation<Courses> violation : violations) {
	                    System.out.println(violation.getMessage());
	                } }
	        } catch (Exception e) {
	        	System.out.println(e);
	        } 
		
	}

	@Override
	public void viewCourseById() {
		 try {
	        	System.out.println("Enter your course ID:");
	            int id1 = sc.nextInt();

	            // Fetch the course object from the database using the provided ID
	            Courses course = session.get(Courses.class, id1);

	            if (course != null) {
	                System.out.println(course.getCid() + " " +
	                        course.getCourseName() + " " +
	                        course.getCourseModules() + " " +
	                        course.getDuration() + " " +
	                        course.getCourseCode() + " " +
	                        course.getMinBatchSize() + " " +
	                        course.getMaxBatchSize() + " " +
	                        course.getPretest());
	            } else {
	                System.out.println("No course found with ID: " + id1);
	            }
	        }catch(Exception e) {
	            System.out.println(e);	
	            }
		
	}

	@Override
	public List<Courses> getAllCourses() {
		 try {
	            Query<Courses> query = session.createQuery("FROM Courses", Courses.class);
	            List<Courses> course1 = query.list();

	            if (course1.isEmpty()) {
	                System.out.println("No Courses found.");
	            } else {
	                for (Courses courses : course1) {
	                	System.out.println(courses.getCid() + " " +
		                        courses.getCourseName() + " " +
		                        courses.getCourseModules() + " " +
		                        courses.getDuration() + " " +
		                        courses.getCourseCode() + " " +
		                        courses.getMinBatchSize() + " " +
		                        courses.getMaxBatchSize() + " " +
		                        courses.getPretest());
	                }
	            }
	            return course1;
	        } catch (Exception e) {
	        	 System.out.println(e);	
	            return null;
	        }

	}

	@Override
	public void viewCourseByCode(String courseCode) {
		 try {
	            TypedQuery<Courses> query = session.createQuery(
	                "Select s from Courses s where s.courseCode =:courseCode", Courses.class);
	            query.setParameter("courseCode", courseCode);
	            Courses courses = query.getSingleResult();

	            if (courses != null) {
	                System.out.println(courses.getCid() + " " +
	                		courses.getCourseName() + " " +
	                		courses.getCourseModules() + " " +
	                		courses.getDuration() + " " +
	                        courses.getCourseCode() + " " +
	                        courses.getMinBatchSize() + " " +
	                        courses.getMaxBatchSize() + " " +
	                        courses.getPretest());
	            } else {
	                System.out.println("No course found with code: " + courseCode);
	            }
	        }catch(Exception e) {
	            System.out.println(e);	
	            }
		
	}

}
