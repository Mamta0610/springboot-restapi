package com.anpc8001.dao;
import java.util.List;

import com.anpc8001.entity.Teacher;

public interface TeacherDao {
	
    void registerTeacher(); //register new teacher
    void viewTeacherDetails(); //fetch details using id
    void updateTeacherDetails(); //edit address & technical skills
    List<Teacher> getAllTeachers(); //fetch all details
}
