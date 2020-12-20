package edu.vinaenter.daos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import edu.vinaenter.dto.CatDto;
import edu.vinaenter.models.Category;

@Repository
public class CategoryDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public Category getItem(int id) {
		
		String sql = "SELECT id, name FROM categories WHERE id = ?";
		try {
			return jdbcTemplate.queryForObject(sql,new Object[] {id} ,
					new BeanPropertyRowMapper<>(Category.class));
		} catch (EmptyResultDataAccessException e) {
			return null;
		}
		
	}
	
	public int hadCat(String name) {
		String sql = "SELECT COUNT(1) FROM categories WHERE name = ?";
		return jdbcTemplate.queryForObject(sql, new Object[] {name}, Integer.class);
	}
 	
	public List<Category> findAll() {
		String sql = "SELECT id, name FROM categories ORDER BY id DESC";
		return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Category.class));
	}
	
	public List<CatDto> findAllDto() {
		String sql = "SELECT id, name FROM categories ORDER BY id DESC";
		return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(CatDto.class));
	}
	
	public int addItem(Category cat) {
		String sql = "INSERT INTO categories (name) VALUES(?) ";
		return jdbcTemplate.update(sql, new Object[] {cat.getName()} );
	}
	
	public int delItem(int id) {
		String sql = "DELETE FROM categories WHERE id = ?";
		return jdbcTemplate.update(sql, new Object[] {id});
	}

	public int editItem(Category cat) {
		String sql = "UPDATE categories SET name = ? WHERE id = ?";
		return jdbcTemplate.update(sql, new Object[] {cat.getName(), cat.getId()} );
	}
	
	public List<CatDto> catHot() {
		String sql = "SELECT id, name FROM categories ORDER BY countViews DESC LIMIT 3";
		return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(CatDto.class));
	}
	
}
