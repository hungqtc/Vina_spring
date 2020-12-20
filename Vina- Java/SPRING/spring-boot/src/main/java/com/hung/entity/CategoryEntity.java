
package com.hung.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
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
@Table(name = "categories")
public class CategoryEntity extends BaseEntity {

	@Column(name = "name")
	private String name;

	@OneToMany(mappedBy = "category")
	private List<NewsEntity> news = new ArrayList<NewsEntity>();

}
