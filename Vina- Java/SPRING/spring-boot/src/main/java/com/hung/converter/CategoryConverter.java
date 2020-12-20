/*
 * package com.hung.converter;
 * 
 * import java.util.ArrayList; import java.util.List;
 * 
 * import org.springframework.stereotype.Component;
 * 
 * import com.hung.dto.CategoryDTO; import com.hung.entity.CategoryEntity;
 * 
 * @Component public class CategoryConverter { public CategoryEntity
 * toEntity(CategoryDTO dto) { CategoryEntity entity = new CategoryEntity();
 * entity.setName(dto.getName()); return entity; }
 * 
 * public static CategoryDTO toDTO(CategoryEntity entity) { CategoryDTO dto =
 * new CategoryDTO(); if (entity.getId() != null) { dto.setId(entity.getId()); }
 * dto.setName(entity.getName()); dto.setCreatedDate(entity.getCreatedDate());
 * dto.setCreatedBy(entity.getCreatedBy());
 * dto.setModifiedDate(entity.getModifiedDate());
 * dto.setModifiedBy(entity.getModifiedBy()); return dto; }
 * 
 * public CategoryEntity toEntity(CategoryDTO dto, CategoryEntity entity) {
 * entity.setName(dto.getName()); return entity; }
 * 
 * public List<CategoryDTO> toDTO(List<CategoryEntity> listEntity) {
 * List<CategoryDTO> listDTO = new ArrayList<CategoryDTO>(); for (CategoryEntity
 * entity : listEntity) { listDTO.add(toDTO(entity)); } return listDTO;
 * 
 * }
 * 
 * }
 */