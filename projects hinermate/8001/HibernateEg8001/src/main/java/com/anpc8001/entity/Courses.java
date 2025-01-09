package com.anpc8001.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Courses {
	
    @Id
    @Min(value = 1, message = "Course ID must be greater than 0")
    private int cid;
	
    @NotBlank(message = "Course name cannot be blank")
    @Size(min = 1, max = 100, message = "Course name must be between 1 and 100 characters")
    private String courseName;
	
    @NotBlank(message = "Course code cannot be blank")
    @Size(min = 1, max = 10, message = "Course code must be between 1 and 10 characters")
    private String courseCode;
	
    @Min(value = 1, message = "Duration must be at least 1 hour")
    private int duration;
	
    @Min(value = 1, message = "Minimum batch size must be at least 1")
    private int minBatchSize;
	
    @Min(value = 1, message = "Maximum batch size must be at least 1")
    @Max(value = 1000, message = "Maximum batch size cannot exceed 1000")
    private int maxBatchSize;
	
    private boolean prerequisites;
	
    private boolean placementSupport;
	
    @NotBlank(message = "Pretest details cannot be blank")
    private String pretest;
	
    @NotBlank(message = "Course modules cannot be blank")
    private String courseModules;

}
