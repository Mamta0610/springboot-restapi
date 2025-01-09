package com.anpc8001.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Assessment {

    @Id
    @Min(value = 1, message = "Assessment ID must be greater than 0")
    private int aid;

    @NotBlank(message = "Assessment date cannot be blank")
    private String assessmentDate;

    @Min(value = 0, message = "Score cannot be negative")
    @Max(value = 100, message = "Score cannot exceed 100")
    private int score;

    @NotBlank(message = "Status cannot be blank")
    private String status;

    private String reassessmentDate;

    @Min(value = 0, message = "Total count cannot be negative")
    private int totalCount;

    @Min(value = 0, message = "Students appeared count cannot be negative")
    private int studentsAppeared;

    // Foreign key relationship with Batch
    @ManyToOne
    @JoinColumn(name = "batch_id", referencedColumnName = "bcode")
    @NotNull(message = "Batch cannot be null")
    private Batches batch;

    // Foreign key relationship with Student
    @ManyToOne
    @JoinColumn(name = "student_id", referencedColumnName = "sid")
    @NotNull(message = "Student cannot be null")
    private Student student;
}
