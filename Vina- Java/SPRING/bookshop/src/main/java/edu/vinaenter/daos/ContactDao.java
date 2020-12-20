package edu.vinaenter.daos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import edu.vinaenter.models.Contact;
import edu.vinaenter.models.Contact;

@Repository
public class ContactDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public List<Contact> findAll() {
		String sql = "SELECT id, name, email, subject, content FROM contacts ORDER BY id DESC";
		return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Contact.class));
	}

	public int addItem(Contact contact) {
		String sql = "INSERT INTO contacts (name, email, content) VALUES(?, ?, ?) ";
		return jdbcTemplate.update(sql, new Object[] { contact.getName(), contact.getEmail(), contact.getContent() });
	}

	public int delItem(int id) {
		String sql = "DELETE FROM contacts WHERE id = ?";
		return jdbcTemplate.update(sql, new Object[] { id });
	}

}
