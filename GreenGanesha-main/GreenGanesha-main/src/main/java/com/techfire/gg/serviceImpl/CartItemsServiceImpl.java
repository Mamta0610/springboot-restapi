package com.techfire.gg.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.techfire.gg.entity.CartItems;
import com.techfire.gg.entity.User;
import com.techfire.gg.exception.CartItemNotFoundException;
import com.techfire.gg.exception.UnauthorizedAccessException;
import com.techfire.gg.exception.UserIdNotFoundException;
import com.techfire.gg.repository.CartItemsRepository;
import com.techfire.gg.repository.UserRepository;
import com.techfire.gg.service.CartItemsService;

@Service
public class CartItemsServiceImpl implements CartItemsService  {

	@Autowired
	CartItemsRepository cartItemsRepo;
	
	@Autowired
	UserRepository	 userRepo;
	
	@Override
	public void updateCartItemQuantity(int userId,int productId, int quantity) {
		// Retrieve the cart item
		User user = userRepo.findById(userId).orElseThrow(() -> new UserIdNotFoundException("User not found with id: " + userId));
		
		//getting cartitemID on the basis of productID and User Id
		Long cartItemId=cartItemsRepo.findCartItemsIdByProductIdAndUserId(userId,productId);
		// Retrieve the cart item for user Authentication
		 CartItems cartItem = cartItemsRepo.findById(cartItemId).orElseThrow(() -> new CartItemNotFoundException("CartItem Not Found"));
		// Make sure the cart item belongs to the user
	        if (!cartItem.getUser().equals(user)) {
	            throw new UnauthorizedAccessException("Unauthorized user access to cart item");
	        }
	        // Update the quantity
	        cartItem.setQuantity(quantity);
	        // Save the updated cart item
	        cartItemsRepo.save(cartItem);	
	}

}
