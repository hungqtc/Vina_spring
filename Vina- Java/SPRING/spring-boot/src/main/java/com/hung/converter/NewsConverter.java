/*
 * package com.hung.converter;
 * 
 * import java.util.ArrayList; import java.util.List;
 * 
 * import org.springframework.stereotype.Component;
 * 
 * import com.hung.dto.NewsDTO; import com.hung.entity.NewsEntity;
 * 
 * @Component public class NewsConverter { public NewsEntity toEntity(NewsDTO
 * dto) { NewsEntity entity = new NewsEntity(); entity.setName(dto.getName());
 * entity.setDescription(dto.getDescription());
 * entity.setDetail(dto.getDetail()); entity.setPicture(dto.getPicture());
 * return entity; }
 * 
 * public static NewsDTO toDTO(NewsEntity entity) { NewsDTO dto = new NewsDTO();
 * if (entity.getId() != null) { dto.setId(entity.getId()); }
 * dto.setCatName(entity.getCategory().getName());
 * dto.setName(entity.getName()); dto.setDescription(entity.getDescription());
 * dto.setDetail(entity.getDetail()); dto.setPicture(entity.getPicture());
 * dto.setCreatedDate(entity.getCreatedDate());
 * dto.setCreatedBy(entity.getCreatedBy());
 * dto.setModifiedDate(entity.getModifiedDate());
 * dto.setModifiedBy(entity.getModifiedBy()); return dto; }
 * 
 * public NewsEntity toEntity(NewsDTO dto, NewsEntity entity) {
 * entity.setName(dto.getName()); entity.setDescription(dto.getDescription());
 * entity.setDetail(dto.getDetail()); entity.setPicture(dto.getPicture());
 * return entity; }
 * 
 * public List<NewsDTO> toDTO(List<NewsEntity> listEntity) { List<NewsDTO>
 * listDTO = new ArrayList<NewsDTO>(); for (NewsEntity entity : listEntity) {
 * listDTO.add(toDTO(entity)); } return listDTO;
 * 
 * }
 * 
 * }
 */