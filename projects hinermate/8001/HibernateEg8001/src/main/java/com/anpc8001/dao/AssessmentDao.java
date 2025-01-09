package com.anpc8001.dao;

import java.util.List;
import com.anpc8001.entity.Assessment;

public interface AssessmentDao {
	
	void addAssessmentDetail(); 
	void viewAssessmentDetailById(); 
	List<Assessment> getAllAssessmentDetails(); 
	void updateAssessmentDetails(); //update reassessment date
}
