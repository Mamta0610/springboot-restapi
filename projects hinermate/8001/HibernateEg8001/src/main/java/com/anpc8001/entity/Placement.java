package com.anpc8001.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Placement {

    @Id
    @Min(value = 1, message = "Placement ID must be greater than 0")
    private int pid;

    @NotBlank(message = "Tech stack cannot be blank")
    private String techStack;

    @NotBlank(message = "Job role cannot be blank")
    private String jobRole;

    @NotBlank(message = "Nominated profile cannot be blank")
    private String nominatedProfile;

    private String Opportunity1;

    private String Opportunity2;

    private String Opportunity3;

    @NotBlank(message = "Placement status cannot be blank")
    private String placementStatus;

    private boolean offerLetter;

    @NotBlank(message = "Company name cannot be blank")
    private String companyName;

    @NotBlank(message = "Profile cannot be blank")
    private String profile;

    @Min(value = 0, message = "Salary cannot be negative")
    private double salary;

    @NotBlank(message = "Joining date cannot be blank")
    private String joiningDate;

    // Foreign key relationship with Student
    @ManyToOne
    @JoinColumn(name = "student_id", referencedColumnName = "sid")
    @NotNull(message = "Student cannot be null")
    private Student student;

    // Foreign key relationship with Batch
    @ManyToOne
    @JoinColumn(name = "batch_id", referencedColumnName = "bcode")
    @NotNull(message = "Batch cannot be null")
    private Batches batch;
}
