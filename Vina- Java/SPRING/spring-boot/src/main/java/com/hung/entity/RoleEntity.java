
package com.hung.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "roles")
public class RoleEntity extends BaseEntity{
	
	private String name;

	@ManyToMany(mappedBy = "roles", fetch = FetchType.EAGER)
	private List<UserEntity> user;

}
