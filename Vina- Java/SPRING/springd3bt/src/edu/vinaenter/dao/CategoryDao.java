package edu.vinaenter.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import edu.vinaenter.models.Category;

@Repository //tao 1 doi tuong CatDao
public class CategoryDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public List<Category> findAll() {
		final String sql = "SELECT id, name FROM categories ";
		return jdbcTemplate.query(sql,
		new BeanPropertyRowMapper<>(Category.class));
	}
	public Category findById(int id) {
		final String sql = "SELECT id, name FROM categories WHERE id = ?";
		
		try {
			return jdbcTemplate.queryForObject(sql, new Object[] {id},
					new BeanPropertyRowMapper<>(Category.class));
		} catch (EmptyResultDataAccessException e) {
			return null;
		}
		
	}
	//COUNT(1): hieu suat nhanh hon *
	public int countAll() {
		final String sql = "SELECT COUNT(1) totalRow FROM categories";
		try {
			return jdbcTemplate.queryForObject(sql, Integer.class);
		} catch (EmptyResultDataAccessException e) {
			return 0;
		}
		
	}
	
	
}
