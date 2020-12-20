/*
 * package com.hung.service.impls;
 * 
 * import java.util.List;
 * 
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.stereotype.Service;
 * 
 * import com.hung.converter.NewsConverter; import com.hung.dto.NewsDTO; import
 * com.hung.entity.CategoryEntity; import com.hung.entity.NewsEntity; import
 * com.hung.repository.CategoryRepository; import
 * com.hung.repository.NewsRepository; import com.hung.service.CategoryService;
 * import com.hung.service.NewsService;
 * 
 * @Service public class NewsServiceImpl implements NewsService {
 * 
 * @Autowired private NewsRepository newsRepository;
 * 
 * @Autowired private NewsConverter newsConverter;
 * 
 * @Autowired private CategoryService categoryService;
 * 
 * @Autowired private CategoryRepository categoryRepository;
 * 
 * @Override public List<NewsDTO> getAll() {
 * 
 * List<NewsEntity> listEntity = newsRepository.findAll(); return
 * newsConverter.toDTO(listEntity); }
 * 
 * @Override public NewsDTO getById(long id) { NewsEntity entity =
 * newsRepository.findOne(id); return newsConverter.toDTO(entity); }
 * 
 * @Override public NewsDTO save(NewsDTO newsDTO) { NewsEntity newsEntity = new
 * NewsEntity();
 * 
 * if (newsDTO.getId() != null) { NewsEntity oldNewsEntity =
 * newsRepository.findOne(newsDTO.getId()); newsEntity =
 * newsConverter.toEntity(newsDTO, oldNewsEntity); } else { newsEntity =
 * newsConverter.toEntity(newsDTO); } CategoryEntity categoryEntity =
 * categoryRepository.findOneByName(newsDTO.getCatName());
 * newsEntity.setCategory(categoryEntity); newsEntity =
 * newsRepository.save(newsEntity); return newsConverter.toDTO(newsEntity); }
 * 
 * @Override public void delete(long[] ids) { for (long item : ids) {
 * newsRepository.delete(item); } }
 * 
 * }
 */