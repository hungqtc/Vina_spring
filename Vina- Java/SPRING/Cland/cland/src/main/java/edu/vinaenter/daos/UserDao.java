package edu.vinaenter.daos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import edu.vinaenter.models.User;

@Repository
public class UserDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public User getItem(int id) {
		User user = new User();

		String sql = "SELECT id, username, fullname, password FROM users WHERE id = ?";
		try {
			return jdbcTemplate.queryForObject(sql, new Object[] { id }, new BeanPropertyRowMapper<>(User.class));
		} catch (EmptyResultDataAccessException e) {
			return null;
		}

	}
	
	public int hadUser(String username) {
		String sql = "SELECT COUNT(1) FROM users WHERE username =";
		return jdbcTemplate.queryForObject(sql, new Object[] { username }, Integer.class);
	}

	public List<User> findAll() {
		String sql = "SELECT id, username, fullname FROM users ORDER BY id DESC";
		return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(User.class));
	}

	public int addItem(User user) {
		String sql = "INSERT INTO users (username, fullname, password) VALUES(?, ?, ?) ";
		return jdbcTemplate.update(sql, new Object[] { user.getUsername(), user.getFullname(), user.getPassword() });
	}

	public int delItem(int id) {
		String sql = "DELETE FROM users WHERE id = ?";
		return jdbcTemplate.update(sql, new Object[] { id });
	}

	public int editItem(User user) {
		String sql = "UPDATE users SET fullname = ?, password = ? WHERE id = ?";
		return jdbcTemplate.update(sql, new Object[] { user.getFullname(), user.getPassword(), user.getId() });
	}

}
