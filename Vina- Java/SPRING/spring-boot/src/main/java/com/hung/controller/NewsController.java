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
 * org.springframework.web.bind.annotation.ResponseBody; import
 * org.springframework.web.bind.annotation.RestController;
 * 
 * import com.hung.dto.NewsDTO; import com.hung.entity.NewsEntity; import
 * com.hung.service.NewsService;
 * 
 * @RestController public class NewsController {
 * 
 * @Autowired NewsService newsService;
 * 
 * @GetMapping(value = "/news") public List<NewsDTO> getAll() { return
 * newsService.getAll(); }
 * 
 * @GetMapping(value = "/news/{id}") public NewsDTO getOneById(@PathVariable
 * long id) { return newsService.getById(id); }
 * 
 * @DeleteMapping(value = "/news") public void deleteNews(@PathVariable long[]
 * ids) { newsService.delete(ids); }
 * 
 * @PostMapping(value = "/news") public NewsDTO insertNews(@RequestBody NewsDTO
 * news) { return newsService.save(news); }
 * 
 * @PutMapping(value = "/news/{id}") public NewsDTO editNews(@RequestBody
 * NewsDTO news, @PathVariable long id) { news.setId(id); return
 * newsService.save(news); }
 * 
 * }
 */