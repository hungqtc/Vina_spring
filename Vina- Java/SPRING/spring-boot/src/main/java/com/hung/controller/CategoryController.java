/*
 * package com.hung.controller;
 * 
 * import java.util.List;
 * 
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.web.bind.annotation.DeleteMapping; import
 * org.springframework.web.bind.annotation.GetMapping; import
 * org.springframework.web.bind.annotation.PathVariable; import
 * org.springframework.web.bind.annotation.PostMapping; import
 * org.springframework.web.bind.annotation.PutMapping; import
 * org.springframework.web.bind.annotation.RequestBody; import
 * org.springframework.web.bind.annotation.RestController;
 * 
 * import com.hung.dto.CategoryDTO; import com.hung.service.CategoryService;
 * 
 * @RestController public class CategoryController {
 * 
 * @Autowired CategoryService categoryService;
 * 
 * @GetMapping(value = "/cat") public List<CategoryDTO> getAll() { return
 * categoryService.getAll(); }
 * 
 * @GetMapping(value = "/cat/{id}") public CategoryDTO getOneById(@PathVariable
 * long id) { return categoryService.getById(id); }
 * 
 * @DeleteMapping(value = "/cat/{id}") public void deleteCategory(@PathVariable
 * long id) { categoryService.delete(id); }
 * 
 * @PostMapping(value = "/cat") public CategoryDTO insertCategory(@RequestBody
 * CategoryDTO Category) { return categoryService.save(Category); }
 * 
 * @PutMapping(value = "/cat/{id}") public CategoryDTO editCategory(@RequestBody
 * CategoryDTO Category, @PathVariable long id) { Category.setId(id); return
 * categoryService.save(Category); }
 * 
 * }
 */