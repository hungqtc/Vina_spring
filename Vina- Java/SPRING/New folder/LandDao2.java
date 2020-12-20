package edu.vinaenter.daos;

import java.util.List;

import javax.print.DocFlavor.STRING;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import edu.vinaenter.constants.CommonConstants;
import edu.vinaenter.dto.LandDto;
import edu.vinaenter.models.Category;
import edu.vinaenter.utils.StringUtil;

@Repository
public class LandDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public List<LandDto> findAllPagination(int offset) {
		String sql = "SELECT l.id, l.name AS landName, "
				+ "description,  "
				+ "date_create AS dateCreate, "
				+ "l.cid, picture, "
				+ "area, address, "
				+ "count_views AS countViews , "
				+ "c.name AS catName "
				+ "FROM lands AS l "
				+ "INNER JOIN categories AS c "
				+ "ON c.id = l.cid ORDER BY l.id DESC "
				+ "LIMIT ?,?";
		return jdbcTemplate.query(sql, new Object[] {offset, CommonConstants.DEFAULT_PAGING_SIZE}, 
				new BeanPropertyRowMapper<>(LandDto.class));
	}
	
	public int countPagination() {
		String sql = "SELECT COUNT(1) AS countLand "
				+ "FROM lands AS l "
				+ "INNER JOIN categories AS c "
				+ "ON c.id = l.cid ";
		return jdbcTemplate.queryForObject(sql, Integer.class);
	}
	
	public int add(LandDto landDto) {
		String sql = "INSERT INTO  lands(name, description, cid, address, picture) VALUES(?,?,?,?,?)";
		return jdbcTemplate.update(sql, new Object[] {landDto.getLandName(), landDto.getDescription(), landDto.getCid(), landDto.getAddress(), landDto.getPicture()});
	}
	
	public LandDto getItem(int id) {
		String sql = "SELECT l.id, l.name AS landName, "
				+ "description,  "
				+ "l.cid, picture, "
				+ "area, address, "
				+ "c.name AS catName "
				+ "FROM lands AS l "
				+ "INNER JOIN categories AS c "
				+ "ON c.id = l.cid  "
				+ "WHERE l.id = ?";
		return (LandDto) jdbcTemplate.queryForObject(sql,new Object[]{id}, new BeanPropertyRowMapper(LandDto.class));
	}
	
	public int edit(LandDto landDto, int id) {
		String sql ="UPDATE lands SET name=?, description=? , picture= ?, cid= ? WHERE id=?";
		return jdbcTemplate.update(sql,new Object[]{landDto.getLandName(), landDto.getDescription(), landDto.getPicture(), landDto.getCid(), id});
	}
	
}
