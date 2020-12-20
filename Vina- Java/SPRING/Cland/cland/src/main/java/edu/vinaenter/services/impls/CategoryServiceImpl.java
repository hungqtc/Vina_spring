package edu.vinaenter.services.impls;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.vinaenter.daos.CategoryDao;
import edu.vinaenter.dto.CatDto;
import edu.vinaenter.models.Category;
import edu.vinaenter.services.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService {
	@Autowired
	private CategoryDao catDao;

	@Override
	public List<Category> findAll() {
		return catDao.findAll();
	}

	@Override
	public int add(Category cat) {
		return catDao.addItem(cat);
	}

	@Override
	public int del(int id) {
		return catDao.delItem(id);
	}

	@Override
	public Category getItem(int id) {
		return catDao.getItem(id);
	}

	@Override
	public int edit(Category cat) {
		return catDao.editItem(cat);
	}

	@Override
	public List<CatDto> findAllDto() {
		return catDao.findAllDto();
	}

	@Override
	public List<CatDto> catHot() {
		return catDao.catHot();
	}

	

	

}
