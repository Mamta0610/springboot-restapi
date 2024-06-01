package com.techfire.gg.serviceImpl;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techfire.gg.entity.Cart;
import com.techfire.gg.entity.CartItems;
import com.techfire.gg.entity.Product;
import com.techfire.gg.entity.User;
import com.techfire.gg.exception.ProductIdNotFoundException;
import com.techfire.gg.exception.UserIdNotFoundException;
import com.techfire.gg.repository.CartItemsRepository;
import com.techfire.gg.repository.CartRepository;
import com.techfire.gg.repository.ProductRepository;
import com.techfire.gg.repository.UserRepository;
import com.techfire.gg.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService{
	
	@Autowired
	ProductRepository productRepo;
	
	@Autowired
	CartItemsRepository cartItemsRepo;
	
	@Autowired
    UserRepository userRepo;
	
	@Autowired
	CartRepository cartRepo;
	
	//lists all the products from database
	public List<Product> getAllProducts(){
		return productRepo.findAll();
	}
	
	//list product by ID
	 public Product getProductById(int pId) {
	        return productRepo.findById(pId).orElseThrow(()-> new ProductIdNotFoundException("Please enter valid Product id"));
	    }
	 
	 //list products as per category
	 public List<Product> getProductsByCategoryId(int categoryId) {
	        return productRepo.findByCategoryId(categoryId);
	    }
	 
	// add to product cart
	@Override
	public void addToCart(int uId, int pId) {
		User user = userRepo.findById(uId).orElseThrow(() -> new UserIdNotFoundException("User not found with id: " + uId));
		Product product = productRepo.findById(pId).orElseThrow(() -> new ProductIdNotFoundException("Product not found with id: " + pId));
		 
		// Check if the user has a cart, create one if not
	        Cart cart = user.getCart();
	        
	        if (cart == null) {
	            cart = new Cart();
	            cart.setUser(user);
	            cart = cartRepo.save(cart);
	            // Update the user's cart to reflect the newly created cart
	            user.setCart(cart);
	        }
	 
	        // Check if the product is already in the cart, update quantity or add a new entry
	        Optional<CartItems> existingCartItem = cartItemsRepo.findByUserIdAndProductId(uId, pId);
	        if (existingCartItem.isPresent()) {
	            // Product is already in the cart, update quantity
	            CartItems cartItem = existingCartItem.get();
	            cartItem.setQuantity(cartItem.getQuantity() + 1);
	            
	            // Calculate and set the updated total price
	            double totalPrice = cartItem.getProduct().getPrice() * cartItem.getQuantity();
	            cartItem.setTotalPrice(totalPrice);
	            
	            
	            // Save the updated quantity
	            cartItemsRepo.save(cartItem);
	        } else {
	            // Product is not in the cart, add a new entry
	            CartItems newCartItem = new CartItems();
	            newCartItem.setUser(user);
	            newCartItem.setProduct(product);
	            newCartItem.setQuantity(1);
	            
	            // Calculate and set the initial total price
	            double totalPrice = newCartItem.getProduct().getPrice() * newCartItem.getQuantity();
	            newCartItem.setTotalPrice(totalPrice);
	            
	            newCartItem.setCart(cart);
	            
	            // Save the new cart item
	            cartItemsRepo.save(newCartItem);
	        }
	        
	        
	       
	    }
	
	//find product on the basis of price range
	@Override
	public List<Product> findProductsInPriceRange(double minPrice, double maxPrice) {
		return productRepo.findByPriceBetween(minPrice, maxPrice);
	}
	
}
	
	
	

	
	 	
	


	 	
		
	
	 

	
		


	
	


