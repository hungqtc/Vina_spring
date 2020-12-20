package edu.vinaenter.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Repository;

import edu.vinaenter.models.Category;
import edu.vinaenter.models.News;

@Repository
public class NewsDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public List<News> findAllJoinCategory() {
		final String sql = "SELECT n.id AS newsId, n.name AS newsName, n.description,"
				+ " n.picture, n.detail, n.created_at, n.cat_id, c.name AS catName" + " FROM news AS n"
				+ " INNER JOIN categories AS c" + " ON c.id = n.cat_id";
		return jdbcTemplate.query(sql, new ResultSetExtractor<List<News>>() {

			@Override
			public List<News> extractData(ResultSet rs) throws SQLException, DataAccessException {
				List<News> listNews = new ArrayList<>();
				while (rs.next()) {
					News news = new News(rs.getInt("newsId"), rs.getString("newsName"), rs.getString("description"),
							rs.getString("picture"), rs.getString("detail"), rs.getTimestamp("created_at"),
							new Category(rs.getInt("cat_id"), rs.getString("catName")));
					listNews.add(news);

				}
				return listNews;
			}
		});
	}

	public List<News> findAllJoinCategoryById(int id) {
		final String sql = "SELECT n.id AS newsId, n.name AS newsName, n.description,"
				+ " n.picture, n.detail, n.created_at, n.cat_id, c.name AS catName" + " FROM news AS n"
				+ " INNER JOIN categories AS c" + " ON c.id = n.cat_id" + " WHERE n.cat_id = ?";

		return jdbcTemplate.query(sql, new Object[] { id }, new ResultSetExtractor<List<News>>()

		{

			@Override
			public List<News> extractData(ResultSet rs) throws SQLException, DataAccessException {
				List<News> listNews = new ArrayList<>();
				while (rs.next()) {
					News news = new News(rs.getInt("newsId"), rs.getString("newsName"), rs.getString("description"),
							rs.getString("picture"), rs.getString("detail"), rs.getTimestamp("created_at"),
							new Category(rs.getInt("cat_id"), rs.getString("catName")));
					listNews.add(news);

				}
				return listNews;
			}
		});
	}

	public News getItemById(int id) {

		try {
			final String sql = "SELECT id, name, detail FROM news WHERE id = ?";
			return jdbcTemplate.queryForObject(sql, new Object[] { id }, new BeanPropertyRowMapper<>(News.class));
		} catch (EmptyResultDataAccessException e) {
			return null;
		}
	}
}
