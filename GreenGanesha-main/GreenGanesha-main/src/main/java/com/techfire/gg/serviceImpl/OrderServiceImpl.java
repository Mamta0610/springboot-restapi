package com.techfire.gg.serviceImpl;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techfire.gg.entity.Cart;
import com.techfire.gg.entity.CartItems;
import com.techfire.gg.entity.Order;
import com.techfire.gg.entity.OrderItems;
import com.techfire.gg.repository.CartRepository;
import com.techfire.gg.repository.OrderItemsRepository;
import com.techfire.gg.repository.OrderRepository;
import com.techfire.gg.service.OrderService;
@Service
public class OrderServiceImpl implements OrderService{

	@Autowired
    OrderRepository orderRepo;

	@Autowired
    CartRepository cartRepo;

   @Autowired
   OrderItemsRepository orderItemRepo;
  
	
   // method to place order
	@Override
	public void placeOrder(int uId) {
			
	        // Retrieve user's cart and cart items
	        Cart cart = cartRepo.findByUserId(uId);
	        List<CartItems> cartItems = cart.getCartItems();

	        // Create a new order
	        Order order = new Order();
	        order.setUser(cart.getUser());
	        order.setOrderItems(new ArrayList<>());

	        // Move cart items to order items
	        for (CartItems cartItem : cartItems) {
	            OrderItems orderItem = new OrderItems();
	            orderItem.setProduct(cartItem.getProduct());
	            orderItem.setQuantity(cartItem.getQuantity());
	            orderItem.setTotal_price(cartItem.getTotalPrice());
	            orderItem.setOrder(order);
	            order.getOrderItems().add(orderItem);
	        }
	        
	     // Set the order timestamp to the current date and time
	        order.setOrderTimestamp(LocalDateTime.now());

	        
	       // set oder total bill to order table
	        double tot_bill=cartRepo.getTotalPriceForOrder(uId);
	        order.setTotal_bill(tot_bill);
	        

	        // Save the order and update cart
	        orderRepo.save(order);
	        cartItems.clear();  // Remove items from cart
	        cartRepo.save(cart);
	    }
	
	//find order details
	@Override
	public List<Object[]> getOrderDetails(int uId) {
		    List<Object[]> productDetails = orderRepo.findproductDetailsByUserId(uId);
		    List<Object[]> userDetails = orderRepo.findUserDetailsById(uId);

		    // Combine the two ArrayLists into one
		    List<Object[]> combinedDetails = new ArrayList<>(userDetails);
		    combinedDetails.addAll(productDetails);

		    return combinedDetails;
		}

	@Override
	public List<Object[]> findOrderDetailsByUserId(int uId) {
		return orderRepo.findOrderDetailsByUserId(uId);
	}
	
	

	}

	


