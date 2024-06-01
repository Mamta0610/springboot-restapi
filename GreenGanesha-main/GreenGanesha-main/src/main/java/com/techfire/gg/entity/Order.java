package com.techfire.gg.entity;

import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

@Table(name = "user_order")
public class Order {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int oId;
	
	@Column(name = "order_timestamp")
    private LocalDateTime orderTimestamp;
	
    @ManyToOne
    @JoinColumn(name = "uId")
    private User user;

    @OneToMany(mappedBy = "order", cascade = CascadeType.ALL)
    private List<OrderItems> orderItems;
    
    @Column(length=15,nullable=false)
    private double total_bill;
    
}