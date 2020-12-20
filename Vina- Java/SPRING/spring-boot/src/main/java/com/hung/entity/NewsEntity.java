
package com.hung.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter

@Setter

@AllArgsConstructor

@NoArgsConstructor

@Data
@Entity
@Table(name = "news")

public class NewsEntity extends BaseEntity {

	@Column(name = "name")
	private String name;

	@Column(name = "description")
	private String description;

	@Column(name = "detail")
	private String detail;

	@Column(name = "picture")
	private String picture;

	@ManyToOne
	@JoinColumn(name = "cat_id")
	private CategoryEntity category;

}
