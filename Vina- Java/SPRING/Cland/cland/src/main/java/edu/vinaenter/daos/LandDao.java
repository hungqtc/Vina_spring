package edu.vinaenter.daos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import edu.vinaenter.constants.CommonConstants;
import edu.vinaenter.dto.LandDto;
import edu.vinaenter.models.Category;

@Repository
public class LandDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public List<LandDto> findAllPagination(int offset) {
		String sql = "SELECT l.id, l.name AS landName, description, area, picture, date_create AS dateCreate,"
				+ " l.cid, address, count_views AS countViews, c.name AS catName "
				+ " FROM lands AS l"
				+ " INNER JOIN categories AS c"
				+ " ON c.id = l.cid"
				+ " ORDER BY l.id DESC"
				+ " LIMIT ?, ?";
				
		return jdbcTemplate.query(sql, new Object[] {offset, CommonConstants.DEFAULT_PAGING_SIZE},
				new BeanPropertyRowMapper<>(LandDto.class));
	}
	
	public List<LandDto> findByCid(int cid) {
		String sql = "SELECT id, name AS landName, picture FROM lands WHERE cid = ?";
				
		return jdbcTemplate.query(sql, new Object[] {cid},
				new BeanPropertyRowMapper<>(LandDto.class));
	}
	
	
	public LandDto findLandByid(int id) {
		String sql = "SELECT l.id, l.name AS landName,"
				+ " description,date_create AS dateCreate,"
				+ " l.cid,picture,address,area,"
				+ " count_views AS countViews,"
				+ "	c.name AS catName"
				+ " FROM lands AS l "
				+ " INNER JOIN categories AS c "
				+ " ON l.cid = c.id "
				+ " WHERE l.id= ?";
		
		return jdbcTemplate.queryForObject(sql, new Object[] {id},new BeanPropertyRowMapper<>(LandDto.class));
	}
	
	public List<LandDto> findRelatedLand(LandDto land, int number) {
		String sql = "SELECT id, name AS landName,"
				+ " description,date_create AS dateCreate,"
				+ " cid,picture,address,area,"
				+ " count_views AS countViews"
				+ " FROM lands"
				+ " WHERE cid= ? && id != ?"
				+ " ORDER BY id DESC LIMIT ?";
		
		return jdbcTemplate.query(sql, new Object[] {land.getCid(), land.getId(), number},new BeanPropertyRowMapper<>(LandDto.class));
	}
	
	public int countPagination() {
		String sql = "SELECT COUNT(1) AS countLand"
				+ " FROM lands AS l"
				+ " INNER JOIN categories AS c"
				+ " ON c.id = l.cid";
		
		return jdbcTemplate.queryForObject(sql, Integer.class);
	}
	
	public int countLandByCat(int id) {
		String sql = "SELECT COUNT(1) AS countLand"
				+ " FROM lands AS l"
				+ " INNER JOIN categories AS c"
				+ " ON c.id = l.cid"
				+ " WHERE l.cid = ?";
		return jdbcTemplate.queryForObject(sql, Integer.class, new Object[] {id});
	}
	
	public Integer countViewsCat(int id) {
		String sql = "SELECT SUM(count_views) AS countViews"
				+ " FROM lands"
				+ " WHERE cid = ?";
		return jdbcTemplate.queryForObject(sql, Integer.class, new Object[] {id});
	}		
			
			
	public int addItem(LandDto land) {
		String sql = "INSERT INTO lands"
				+ " (name, description, address, area, cid, picture)"
				+ " VALUES(?, ?, ?, ?, ?, ?) ";
		return jdbcTemplate.update(sql, new Object[] {land.getLandName(), land.getDescription(), land.getAddress(), land.getArea(), land.getCid(), land.getPicture()} );
	}
	
	public int delItem(int id) {
		String sql = "DELETE FROM lands WHERE id = ?";
		return jdbcTemplate.update(sql, new Object[] {id});
	}
	
	public int delItemByCid(int cid) {
		String sql = "DELETE FROM lands WHERE cid = ?";
		return jdbcTemplate.update(sql, new Object[] {cid});
	}
	
	public int editItem(LandDto land) {
		String sql="UPDATE lands SET name = ?, cid= ?, picture= ?,area= ?,address= ?,description= ? WHERE id= ?";
		return jdbcTemplate.update(sql,new Object[] {land.getLandName(),land.getCid(),land.getPicture(),
				land.getArea(),land.getAddress(),land.getDescription(),land.getId()});
	}
	
	public List<LandDto> landHot() {
		String sql = "SELECT id, name AS landName"
				+ " FROM lands ORDER BY count_views DESC LIMIT 4";
		
		return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(LandDto.class));
	}
	
	public List<LandDto> findLandByName(String name) {
		String sql = "SELECT l.id, l.name AS landName, description, area, picture, date_create AS dateCreate,"
				+ " l.cid, address, count_views AS countViews, c.name AS catName "
				+ " FROM lands AS l"
				+ " INNER JOIN categories AS c"
				+ " ON c.id = l.cid"
				+ " WHERE 1"
				+ " AND l.name LIKE ?"
				+ " OR l.description LIKE ?"
				+ " OR l.area LIKE ?"
				+ " OR l.address LIKE ?"
				+ " OR c.name LIKE ?";
				
		return jdbcTemplate.query(sql, new Object[] {"%" + name +"%", "%" + name +"%", "%" + name +"%", "%" + name +"%","%" + name +"%" },
				new BeanPropertyRowMapper<>(LandDto.class));
	}
	
}
