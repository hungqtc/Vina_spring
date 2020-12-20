/*
 * package com.hung.service.impls;
 * 
 * import java.util.List;
 * 
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.stereotype.Service;
 * 
 * import com.hung.converter.CategoryConverter; import com.hung.dto.CategoryDTO;
 * import com.hung.entity.CategoryEntity; import
 * com.hung.repository.CategoryRepository; import
 * com.hung.service.CategoryService;
 * 
 * @Service public class CategoryServiceImpl implements CategoryService {
 * 
 * @Autowired private CategoryRepository categoryRepository;
 * 
 * @Autowired private CategoryConverter categoryConverter;
 * 
 * @Override public List<CategoryDTO> getAll() {
 * 
 * List<CategoryEntity> listEntity = categoryRepository.findAll(); return
 * categoryConverter.toDTO(listEntity); }
 * 
 * @Override public CategoryDTO getById(Long id) { CategoryEntity entity =
 * categoryRepository.findOne(id); return categoryConverter.toDTO(entity); }
 * 
 * @Override public CategoryDTO save(CategoryDTO CategoryDTO) { CategoryEntity
 * CategoryEntity = new CategoryEntity();
 * 
 * if (CategoryDTO.getId() != null) { CategoryEntity oldCategoryEntity =
 * categoryRepository.findOne(CategoryDTO.getId()); CategoryEntity =
 * categoryConverter.toEntity(CategoryDTO, oldCategoryEntity); } else {
 * CategoryEntity = categoryConverter.toEntity(CategoryDTO); } CategoryEntity =
 * categoryRepository.save(CategoryEntity); return
 * categoryConverter.toDTO(CategoryEntity); }
 * 
 * @Override public void delete(Long CategoryId) {
 * categoryRepository.delete(CategoryId); }
 * 
 * }
 */