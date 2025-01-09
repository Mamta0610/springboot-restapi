package com.anpc8001.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Column;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Teacher {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Name is mandatory")
    @Size(max = 30, message = "Name should not exceed 30 characters")
    @Column(name = "tname", nullable = false, length = 30)
    private String tname;

    @NotBlank(message = "Surname is mandatory")
    @Size(max = 50, message = "Surname should not exceed 50 characters")
    @Column(name = "tsurname", nullable = false, length = 50)
    private String tsurname;

    @NotBlank(message = "Experience is mandatory")
    @Column(name = "experience", nullable = false)
    private String experience;

    @NotBlank(message = "Technical Skills are mandatory")
    @Size(max = 50, message = "Technical Skills should not exceed 50 characters")
    @Column(name = "technical_skills", nullable = false, length = 50)
    private String technicalSkills;

    @Email(message = "Email should be valid")
    @NotBlank(message = "Email is mandatory")
    @Column(name = "temailid", nullable = false, unique = true)
    private String temailid;

    @NotBlank(message = "Phone number is mandatory")
    @Pattern(regexp = "\\d{10}", message = "Phone number should be 10 digits")
    @Column(name = "tphone", nullable = false, unique = true, length = 10)
    private String tphone;

    @NotBlank(message = "Address is mandatory")
    @Size(max = 255, message = "Address should not exceed 255 characters")
    @Column(name = "taddr", nullable = false, length = 255)
    private String taddr;
}
