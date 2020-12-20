package edu.vinaenter.models;

import java.util.Date;

public class Football {
	private int id;
	private String name;
	private Date dateCreate;
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
	public Date getDateCreate() {
		return dateCreate;
	}
	public void setDateCreate(Date dateCreate) {
		this.dateCreate = dateCreate;
	}
	public Football(int id, String name, Date dateCreate) {
		super();
		this.id = id;
		this.name = name;
		this.dateCreate = dateCreate;
	}
	public Football() {
		super();
	}
	//khong the ke thua constructer
	
}
