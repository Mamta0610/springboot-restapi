package com.techfire.gg.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.techfire.gg.entity.CartItems;

public interface CartItemsRepository extends JpaRepository<CartItems, Long>{
	
	//finds the cartitems by userId and productId
	@Query("SELECT ci FROM CartItems ci WHERE ci.user.uId = :uId AND ci.product.pId = :pId")
	Optional<CartItems> findByUserIdAndProductId(@Param("uId") int uId, @Param("pId") int pId);
	

	 // Custom query to find a cartitems by userId
//    @Query("SELECT ci FROM CartItems ci WHERE ci.cart.id = :id")
//    	List<CartItems> findByCartId(int id);
		
	
		// getting items in the cart on the basis of cart id
	    @Query("SELECT ci.quantity,p  FROM CartItems ci JOIN ci.product p WHERE ci.cart.id = :id")
	    List<Object[]> findByCartId(@Param("id")long id);    
	    
	    
	    //finding cart id in the basis of userId
		@Query("SELECT DISTINCT ci.cart.id FROM CartItems ci WHERE ci.user.uId = :uId")
		public int findCartIdsByUserId(@Param("uId") int uId);

       
		
	    ////find cartitemsId on the basis of productId and userId
	    @Query("SELECT ci.id FROM CartItems ci WHERE ci.user.uId = :userId AND ci.product.pId = :productId")
	    Long findCartItemsIdByProductIdAndUserId(@Param("userId") int userId, @Param("productId") int productId);
	    
	    
	    
}
	


