package com.anpc8001.dao;

import java.util.List;

import com.anpc8001.entity.Student;

//create Dao- interface- define CRUD method
public interface StudentDao {
	
	//register students details
	public void registerStudent();
	
	//fetch all student details
	public List<Student> viewStudentDetail();
	
	//fetch student detail with student id
	public void viewStudentDetailById();
	
	//edit student detail
	public void editStudentDetail();
	
	// fetch student detail with student name by jpql
	public void viewStudentByName(String sname);
	
	//add batch code post student register using FK
	public void addBatchCode();
	
}
