package com.anpc8001.dao;

import java.util.List;
import com.anpc8001.entity.Courses;

public interface CourseDao {	
	 void addNewCourse(); //add new course
	 void viewCourseById(); //fetch details using id
	 List<Courses> getAllCourses(); //fetch all course details
	 void viewCourseByCode(String courseCode); //fetch details using code
}
