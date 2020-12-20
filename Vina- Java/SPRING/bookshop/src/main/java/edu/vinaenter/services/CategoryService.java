package edu.vinaenter.services;

import java.util.List;

import edu.vinaenter.dto.CatDto;
import edu.vinaenter.models.Category;

public interface CategoryService {
	
	List<Category> findAll();
	
	List<CatDto> findAllDto();
	
	List<CatDto> catHot();
	
	int add(Category cat);
	
	int del(int id);
	
	Category getItem(int id);

	int edit(Category cat);
	
	int hadItem(Category cat);
}
