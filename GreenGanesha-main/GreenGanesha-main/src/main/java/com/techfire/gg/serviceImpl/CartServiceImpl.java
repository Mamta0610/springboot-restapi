package com.techfire.gg.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techfire.gg.entity.CartItems;
import com.techfire.gg.entity.User;
import com.techfire.gg.exception.CartItemNotFoundException;
import com.techfire.gg.exception.UnauthorizedAccessException;
import com.techfire.gg.exception.UserIdNotFoundException;
import com.techfire.gg.repository.CartItemsRepository;
import com.techfire.gg.repository.UserRepository;
import com.techfire.gg.service.CartService;

@Service
public class CartServiceImpl implements CartService {
	
	@Autowired
	CartItemsRepository cartItemsRepo;
	@Autowired
	UserRepository userRepo;
	
	@Override
	public List<Object[]> getUserCartItems(int uId) {
		int cartId=cartItemsRepo.findCartIdsByUserId(uId);
		return cartItemsRepo.findByCartId(cartId);
	}


	@Override
	//remove product from cart
	public void removeProductFromCart(int uId, int pId) {
		User user = userRepo.findById(uId).orElseThrow(() -> new UserIdNotFoundException("User not found with id: " + uId));
		
		//getting cartitemID on the basis of productID and User Id
		Long cartItemId=cartItemsRepo.findCartItemsIdByProductIdAndUserId(uId,pId);
		// Retrieve the cart item
		CartItems cartItem = cartItemsRepo.findById(cartItemId).orElseThrow(() -> new CartItemNotFoundException("CartItem Not Found"));
		// Make sure the cart item belongs to the user
		if (!cartItem.getUser().equals(user)) {
			  throw new UnauthorizedAccessException("Unauthorized user access to cart item");
			}
		cartItemsRepo.deleteById(cartItemId);
	}

}
