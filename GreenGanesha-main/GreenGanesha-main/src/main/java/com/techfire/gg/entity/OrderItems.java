package com.techfire.gg.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class OrderItems {
	 	@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long oiId;

	    @ManyToOne
	    @JoinColumn(name = "pId")
	    private Product product;

	    @ManyToOne
	    @JoinColumn(name = "oId")
	    private Order order;

	    private int quantity;
	    
	    private double total_price;


}
