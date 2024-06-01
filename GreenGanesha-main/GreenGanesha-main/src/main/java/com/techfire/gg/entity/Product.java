package com.techfire.gg.entity;

//import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.Column;
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


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int pId;
    
    @Column(length=15,nullable=false)
    private String name;
   
    @Column(length=1000)
    private String description;
   
    @Column(name = "price", nullable = false)
    private double price;
    
    @Column(name = "strikePrice", nullable = false)
    private double sprice;
    
    @Column(nullable = false)
    private String imgUrl;
    
    @Column(name = "stock", nullable = false)
    private int stock;
    
//    @ManyToOne
//    @JoinColumn(name = "category_id")
//    @JsonBackReference
//    private Category category;
    
    @ManyToOne
    @JoinColumn(name = "category_id")
    @JsonManagedReference
    private Category category;
    
    

}
