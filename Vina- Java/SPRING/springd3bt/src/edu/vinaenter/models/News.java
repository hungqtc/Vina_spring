package edu.vinaenter.models;

import java.sql.Timestamp;

import javax.validation.constraints.NotEmpty;
public class News {
	private int id;
	@NotEmpty(message="Vui long nhap ten vao khong duoc rong")
	private String name;
	@NotEmpty(message="Vui long nhap ten vao khong duoc rong")
	private String description;
	private String picture;
	private String detail;
	private Timestamp created_at;
	private Category cat;
	
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	public Timestamp getCreated_at() {
		return created_at;
	}
	public void setCreated_at(Timestamp created_at) {
		this.created_at = created_at;
	}
	public Category getCat() {
		return cat;
	}
	public void setCat(Category cat) {
		this.cat = cat;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getPicture() {
		return picture;
	}
	public void setPicture(String picture) {
		this.picture = picture;
	}
	
	public News(int id, @NotEmpty(message = "Vui long nhap ten vao khong duoc rong") String name,
			@NotEmpty(message = "Vui long nhap ten vao khong duoc rong") String description, String picture,
			String detail, Timestamp created_at, Category cat) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.picture = picture;
		this.detail = detail;
		this.created_at = created_at;
		this.cat = cat;
	}
	public News() {
		super();
	}
	
}
