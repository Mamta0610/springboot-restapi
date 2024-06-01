package com.techfire.gg.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.techfire.gg.entity.Cart;


public interface CartRepository extends JpaRepository<Cart, Long> {
	
	//find cart by userId
	 @Query("SELECT c FROM Cart c WHERE c.user.uId = :uId")
	    Cart findByUserId(@Param("uId") int uId);

	//find the total bill for paricular user and store in order table
//	    @Query("SELECT SUM(ci.totalPrice) FROM Cart c JOIN c.cartItems ci WHERE c.uid = :uId")
//	    Double getTotalPriceForOrder(@Param("uId") int uId);
	    
	    @Query("SELECT SUM(ci.totalPrice) FROM Cart c JOIN c.cartItems ci WHERE c.user.id = :uId")
	    Double getTotalPriceForOrder(@Param("uId") int uId);
}
