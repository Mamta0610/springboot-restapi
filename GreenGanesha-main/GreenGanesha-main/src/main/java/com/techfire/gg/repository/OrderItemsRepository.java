package com.techfire.gg.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.techfire.gg.entity.OrderItems;

public interface OrderItemsRepository extends JpaRepository<OrderItems, Long> {

}
