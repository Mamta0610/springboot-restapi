package com.techfire.gg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.techfire.gg.service.OrderService;
@CrossOrigin(origins="http://localhost:4200")
@RestController
public class OrderController {
	@Autowired
    OrderService os;

    @PostMapping("/placeOrder")
    public String placeOrder(@RequestParam int uId) {
        try {
        	os.placeOrder(uId);
            return "Order placed successfully";
        } catch (Exception e) {
            return "Failed to place order: " + e.getMessage();
        }
    }
    
    
    @GetMapping("/getOrderDetails")
    public List<Object[]> getOrderDetails(@RequestParam int uId){
    	return os.getOrderDetails(uId);
    }
    
    @GetMapping("/orderHistory")
    public List<Object[]> getOrderHistory(@RequestParam int uId){
    	return os.findOrderDetailsByUserId(uId);
    }
    

}
