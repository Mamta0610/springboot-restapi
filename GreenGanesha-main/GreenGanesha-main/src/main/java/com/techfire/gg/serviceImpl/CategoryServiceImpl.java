package com.techfire.gg.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techfire.gg.entity.Category;
import com.techfire.gg.repository.CategoryRepository;
import com.techfire.gg.service.CategoryService;

@Service
public class CategoryServiceImpl implements  CategoryService{

	@Autowired
	CategoryRepository catRepo;
	
	@Override
	public List<Category> getAllCategory() {
		return catRepo.findAll();
	}

}
