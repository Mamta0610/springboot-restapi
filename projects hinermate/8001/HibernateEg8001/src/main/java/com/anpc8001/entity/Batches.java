package com.anpc8001.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Batches {
	
    @Id
    @NotBlank(message = "Batch code cannot be blank")
    @Size(min = 4, max = 5, message = "Batch code must be between 1 and 10 characters")
    private String bcode;
	
    @NotBlank(message = "Center code cannot be blank")
    @Size(min = 5, max = 20, message = "Center code must be between 5 and 20 characters")
    private String centerCode;
	
    @Min(value = 10, message = "Enrolled students cannot be negative")
    @Max(value = 70, message = "Enrolled students cannot exceed 70")
    private int enrolled;
	
    @NotBlank(message = "Start date cannot be blank")
    private String startDate;
	
    @NotBlank(message = "End date cannot be blank")
    private String endDate;
	
    @NotBlank(message = "Course name cannot be blank")
    @Size(min = 1, max = 100, message = "Course name must be between 1 and 100 characters")
    private String courseName;
	
    @NotBlank(message = "Teacher name cannot be blank")
    @Size(min = 1, max = 100, message = "Teacher name must be between 1 and 100 characters")
    private String tName;

    // One-to-one relationship with Course entity
    @OneToOne
    @JoinColumn(name = "cid", referencedColumnName = "cid")
    @NotNull(message = "Course cannot be null")
    private Courses course;
    
    // One-to-one relationship with Teacher entity
    @OneToOne
    @JoinColumn(name = "id", referencedColumnName = "id")
    @NotNull(message = "Teacher cannot be null")
    private Teacher teacher;

    
}
