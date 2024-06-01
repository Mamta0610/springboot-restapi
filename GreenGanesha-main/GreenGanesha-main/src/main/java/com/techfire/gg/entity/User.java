package com.techfire.gg.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name="user")
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)  // it will auto increment ID
	private int uId;
	
	@Column(length=15,nullable=false)
	private String userName;
	
	@Column(length=25,nullable=false,unique=true)
	@NotBlank(message = "fill the password")
	private String password;
	
	@Column(length = 12, nullable = false, unique = true)
	@NotNull(message = "user number is mandatory")
	private long uPhone;
	
	@Column(length=25,nullable=false,unique=true)
	@NotBlank(message = "user email is mandatory to fill")
	private String email;
	
	@Column(length=400)
	private String addr;
	
	@OneToOne(mappedBy = "user" )
	 @JsonManagedReference
	    private Cart cart;
	
	
	@OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
	 @JsonManagedReference
	    private List<CartItems> cartItems;
		

	
}