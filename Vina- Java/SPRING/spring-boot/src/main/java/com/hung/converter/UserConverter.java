
package com.hung.converter;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import com.hung.dto.UserDTO;
import com.hung.entity.RoleEntity;
import com.hung.entity.UserEntity;

@Component
public class UserConverter {

	@Autowired
	PasswordEncoder passwordEncoder;

	public UserEntity toEntity(UserDTO dto) {
		UserEntity entity = new UserEntity();
		entity.setPassword(passwordEncoder.encode(dto.getPassword()));
		entity.setName(dto.getName());
		return entity;
	}

	public static UserDTO toDTO(UserEntity entity) {
		UserDTO dto = new UserDTO();
		ArrayList<String> listString = new ArrayList<String>();
		if (entity.getId() != null) {
			dto.setId(entity.getId());
		}
		dto.setName(entity.getName());

		List<RoleEntity> listRole = entity.getRoles();
		for (RoleEntity roleEntity : listRole) {
			listString.add(roleEntity.getName());
		}
		dto.setRoles(listString);
		dto.setCreatedDate(entity.getCreatedDate());
		dto.setCreatedBy(entity.getCreatedBy());
		dto.setModifiedDate(entity.getModifiedDate());
		dto.setModifiedBy(entity.getModifiedBy());
		return dto;
	}

	public UserEntity toEntity(UserDTO dto, UserEntity entity) {
		entity.setName(dto.getName());
		entity.setPassword(passwordEncoder.encode(dto.getPassword()));
		return entity;
	}

	public List<UserDTO> toDTO(List<UserEntity> listEntity) {
		List<UserDTO> listDTO = new ArrayList<UserDTO>();
		for (UserEntity entity : listEntity) {
			listDTO.add(toDTO(entity));
		}
		return listDTO;

	}

}
