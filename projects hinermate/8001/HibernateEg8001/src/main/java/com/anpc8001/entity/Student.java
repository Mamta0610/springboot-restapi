package com.anpc8001.entity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity //mark student class as entity
@Table(name = "StudentInfo") //indicate table name for student class
public class Student {
	
	@Id //indicate primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY) //auto increment for primary key
	private int sid;
	
	//Column- adding length, null & unique constraints as per required
	@Column(length = 20, nullable = false)
	@NotEmpty(message="Student Name is required")
	@Size(min=3, max=20, message="Name must be 3 to 20 character only ")
	private String sname;
	
	@Column(length = 30)
	@Size(min=4, max=30, message="Surname must be 4 to 30 character only")
	private String surname;
	
	@Column(length = 30, nullable = false, unique = true)
	@NotEmpty(message="Student email is required")
	@Email(message="Email should be valid")
	private String semail;
	
	@Column(length = 40, nullable = false)
	@NotEmpty(message="Student address is required")
	@Size(min=5, max=40, message="address must be 5 to 40 character")
	private String saddr ;
	
	@Column(length = 11, nullable = false, unique = true)
	@NotNull(message="Student phone is required")
	@Pattern(regexp = "[6789]{1}[0-9]{9}", message="Phone number must be 10 digits ")
	private String sphone;
	
	@Column(length = 20, nullable = false)
	@NotEmpty(message="Student qualification is required")
	@Size(min=4, max=20, message="Qualification must be 4 to 20 character")
	private String squal;
	
	@Column(length = 6, nullable = false)
	@NotNull(message="Student passout is required")
	@Min(value=2022, message="Passout year must be after 2022")
	private int spassout;

	// One-to-one relationship with Batches entity
    @OneToOne
    @JoinColumn(name = "bcode", referencedColumnName = "bcode")
    private Batches batch;	
    
 // One-to-one relationship with Course entity
    @OneToOne
    @JoinColumn(name = "cid", referencedColumnName = "cid")
    private Courses courses;	
}