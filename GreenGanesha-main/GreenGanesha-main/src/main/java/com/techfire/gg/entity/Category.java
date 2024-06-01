package com.techfire.gg.entity;




//import java.util.List;
//
//import com.fasterxml.jackson.annotation.JsonBackReference;
//import com.fasterxml.jackson.annotation.JsonManagedReference;

//import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
//import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Category {

	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private int id;
	 
	 @Column(length=15,nullable=false)
	 private String name;
	 
//	 @OneToMany(mappedBy = "category", cascade = CascadeType.ALL)
//	 @JsonManagedReference
//	    private List<Product> products;

}
