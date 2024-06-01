package com.techfire.gg.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.techfire.gg.entity.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
	//getting product details
	@Query("SELECT p.name,oi.quantity,p.price,o.orderTimestamp " +
		       "FROM Order o " +
		       "JOIN User u ON o.user.uId = u.uId " +
		       "JOIN OrderItems oi ON o.oId = oi.order.oId " +
		       "JOIN Product p ON oi.product.pId = p.pId " +
		       "WHERE u.uId = :uId")
		List<Object[]> findproductDetailsByUserId(@Param("uId") int uId);		

	//getting order details
	@Query("SELECT u.userName, u.email, u.uPhone, u.addr " +
		       "FROM User u " +
		       "WHERE u.uId = :uId")
		List<Object[]> findUserDetailsById(@Param("uId") int uId);	
		
		
	// fetching order History
		 @Query(value="SELECT p.name AS product_name,o.o_id, o.order_timestamp, o.total_bill, oi.total_price, oi.quantity " +
		           "FROM order_items oi " +
		           "JOIN user_order o ON oi.o_id = o.o_id " +
		           "JOIN product p ON oi.p_id = p.p_id " +
		           "WHERE o.u_id = :uId",nativeQuery=true)
		    List<Object[]> findOrderDetailsByUserId(@Param("uId") int uId);

		
}
