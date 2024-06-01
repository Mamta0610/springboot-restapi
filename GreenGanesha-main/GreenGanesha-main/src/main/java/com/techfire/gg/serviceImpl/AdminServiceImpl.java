package com.techfire.gg.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techfire.gg.entity.Product;
import com.techfire.gg.entity.User;
import com.techfire.gg.exception.ProductIdNotFoundException;
import com.techfire.gg.repository.ProductRepository;
import com.techfire.gg.repository.UserRepository;
import com.techfire.gg.service.AdminService;


@Service
public class AdminServiceImpl implements AdminService {

	@Autowired
	ProductRepository  productRepo;
	
	@Autowired 
	UserRepository userRepo;
	
	
	@Override
	public Product updateProduct(Product product,int pId) {
		Product productDetailsUpdated = productRepo.findById(pId).orElseThrow(()-> new ProductIdNotFoundException("Product Not Found"));
		productDetailsUpdated.setCategory(product.getCategory());
		productDetailsUpdated.setDescription(product.getDescription());
		productDetailsUpdated.setName(product.getName());
		productDetailsUpdated.setPrice(product.getPrice());
		productDetailsUpdated.setStock(product.getStock());
		productRepo.save(productDetailsUpdated);
		return productDetailsUpdated;
	}
	
	//get all Users List 
	@Override
	public List<User> getAllUser() {
		return userRepo.findAll();
	}
	
}
