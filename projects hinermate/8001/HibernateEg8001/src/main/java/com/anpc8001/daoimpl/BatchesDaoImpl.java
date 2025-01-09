package com.anpc8001.daoimpl;

import java.util.List;
import java.util.Scanner;
import java.util.Set;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import com.anpc8001.config.HibernateHelper;
import com.anpc8001.dao.BatchesDao;
import com.anpc8001.entity.Batches;
import com.anpc8001.entity.Courses;
import com.anpc8001.entity.Teacher;

import jakarta.persistence.TypedQuery;
import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validation;
import jakarta.validation.Validator;
import jakarta.validation.ValidatorFactory;

public class BatchesDaoImpl implements BatchesDao{
	Session session = HibernateHelper.getSessionFactory().openSession();
	Transaction transaction = session.beginTransaction();
	Scanner sc = new Scanner(System.in);	
	ValidatorFactory vf = Validation.buildDefaultValidatorFactory();
	Validator v = vf.getValidator();

	@SuppressWarnings("deprecation")
	public void createNewBatch() {
	    try {
	        // Get user input
	        System.out.println("Enter your batchCode:");
	        String batchCode = sc.nextLine();

	        System.out.println("Enter your centerCode:");
	        String centerCode = sc.nextLine();

	        System.out.println("Enter your enrolled:");
	        int enrolled = sc.nextInt();
	        sc.nextLine();  // Consume newline

	        System.out.println("Enter your startDate:");
	        String startDate = sc.nextLine();

	        System.out.println("Enter your endDate:");
	        String endDate = sc.nextLine();

	        System.out.println("Enter your courseName:");
	        String courseName = sc.nextLine();

	        System.out.println("Enter your tName:");
	        String tName = sc.nextLine();

	        System.out.println("Enter course ID (cid):");
	        int cid = sc.nextInt();
	        sc.nextLine();  // Consume newline

	        System.out.println("Enter teacher ID (id):");
	        int tid = sc.nextInt();
	        sc.nextLine();  // Consume newline

	        // Fetch the Courses entity based on cid
	        Courses course = session.get(Courses.class, cid);

	        // Fetch the Teacher entity based on tid
	        Teacher teacher = session.get(Teacher.class, tid);

	        // Create and set values for Batches entity
	        Batches b1 = new Batches();
	        b1.setBcode(batchCode);
	        b1.setCenterCode(centerCode);
	        b1.setEnrolled(enrolled);
	        b1.setStartDate(startDate);
	        b1.setEndDate(endDate);
	        b1.setCourseName(courseName);
	        b1.setTName(tName);

	        // Set the course and teacher relationships
	        b1.setCourse(course);
	        b1.setTeacher(teacher);

	        // Validate the Batches object
	        Set<ConstraintViolation<Batches>> violations = v.validate(b1);
	        if (violations.isEmpty()) {
	            // Save and commit if no validation errors
	            session.save(b1);
	            transaction.commit();
	            System.out.println("Batch registered successfully.");
	        } else {
	            // Print validation errors
	            for (ConstraintViolation<Batches> violation : violations) {
	                System.out.println(violation.getMessage());
	            }
	        }
	    } catch (Exception e) {
	        System.out.println(e);
	    }
	}

	public void viewBatchById() {
		try {
			System.out.println("Enter your Batch id:");
			String bcode = sc.next();

			// Fetch the teacher object from the database using the provided ID
			Batches b = session.get(Batches.class, bcode);

			if (b != null) {
				System.out.println(b.getCenterCode() + " " + b.getEnrolled() + " " + b.getStartDate() + " "
						+ b.getEndDate() + " " + b.getTName());

			} else {
				System.out.println("No Batch found with ID: " + bcode);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public List<Batches> getAllBatches() {
		try {
			Query<Batches> query = session.createQuery("FROM Batches", Batches.class);
			List<Batches> batches = query.list();

			if (batches.isEmpty()) {
				System.out.println("No teachers found.");
			} else {
				for (Batches b1 : batches) {
					System.out.println(b1.getCenterCode() + " " + b1.getEnrolled() + " " + b1.getStartDate() + " "
							+ b1.getEndDate() + " " + b1.getTName());
				}
			}
			return batches;
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}

	@SuppressWarnings("deprecation")
	public void updateBatchDetails() {
		System.out.println("Enter BATCH id");
		int bcode = sc.nextInt();

		Batches b1 = session.get(Batches.class, bcode);

		if (b1 != null) {
			System.out.println("What details you want to modify");
			System.out.println("1. endDate");
			System.out.println("2. TrainerName");

			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				System.out.println("Enter update endDate");
				String endDate = sc.next();

				b1.setEndDate(endDate);
				break;

			case 2:
				System.out.println("Enter update Trainer Name");
				String TrainerName = sc.next();

				b1.setTName(TrainerName);
				break;

			default:
				System.out.println("invalid choice ");
				return;
			}
			session.update(b1);
			transaction.commit();
			System.out.println("Batch details updated ");
		} else {
			System.out.println("No such Batches exists ");
		}

	}

	@Override
	public void viewBatchByCenter(String centerCode) {
		try {
            TypedQuery<Batches> query = session.createQuery(
                "Select s from Batches s where s.centerCode =:centerCode", Batches.class);
            query.setParameter("centerCode", centerCode);
            List<Batches> batches = query.getResultList();

            if (batches.isEmpty()) {
                System.out.println("No center found with Name: " + centerCode);
            } else {
                // Print the list of students
                for (Batches batche : batches) {
                    System.out.println(batche.getCenterCode() + " " + batche.getEnrolled() + " " + batche.getStartDate() + " "
							+ batche.getEndDate() + " " + batche.getTName());
				}
            }
			}catch (Exception e) {
					System.out.println(e);
}
}
}