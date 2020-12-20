package edu.vinaenter.controller.anews;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.servlet.ServletContext;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import edu.vinaenter.dao.CategoryDao;
import edu.vinaenter.dao.NewsDao;
import edu.vinaenter.defines.FileDefine;
import edu.vinaenter.defines.MessageDefine;
import edu.vinaenter.models.Category;
import edu.vinaenter.models.News;
import edu.vinaenter.utils.FileUtil;

@Controller
@RequestMapping("anews")
public class AnewsController {
	@Autowired //DI
	private ServletContext servletContext;
	
	@Autowired 
	private CategoryDao categoryDao;
	
	@Autowired 
	private NewsDao newsDao;
	
	@ModelAttribute
	public void commonObjects(ModelMap model) {
		List<Category> listCat = categoryDao.findAll();
		model.addAttribute("listCat", listCat);
	}
	
	@GetMapping
	public String index(ModelMap model) {
		List<News> listNews = newsDao.findAllJoinCategory();
		model.addAttribute("listNews", listNews);
		return "anews.anews.index";
		
	}
	
	@GetMapping("add")
	public String add() {
		return "anews.anews.add";
	}
	
	@PostMapping("add")
	public String add(@Valid @ModelAttribute("news") News news,
			BindingResult rs,
			@RequestParam("file") MultipartFile mtf, 
			RedirectAttributes ra) {
		//ten tin khong co cac ki tu dac biet. vd: <> ;
		//hibernate framework => validation
		if(rs.hasErrors()) {
			return "anews.anews.add";
		}
		System.out.println(news.getName());
		
		//upload file
		String file = mtf.getOriginalFilename(); //get file Name
		//thu muc chua file
		
		String dirPath = servletContext.getRealPath("") + FileDefine.DIR_UPLOAD;
		File saveDir = new File(dirPath);
		if (!saveDir.exists()) {
			saveDir.mkdirs();
		}
		//duong dan file
		String filePath = dirPath + File.separator + FileUtil.rename(file); 
		//doi tuong file 
		//=> upload to server
		try {
			mtf.transferTo(new File(filePath));
			System.out.println(filePath);
			ra.addFlashAttribute("msg", MessageDefine.MSG_SUCCESS);
		} catch (IllegalStateException | IOException e) {
			ra.addFlashAttribute("msg", MessageDefine.MSG_ERR);
		}
		return "anews.anews.add";
	}
	
	
	@GetMapping(value = { "detail/{name}-{id}.html"})
	public String detail(@PathVariable Integer id, ModelMap model) {
		News objNews = newsDao.getItemById(id);
		model.addAttribute("objNews", objNews);
		return "anews.anews.detail";
	}
	
	@GetMapping(value = {"cat", "cat/{name}-{id}.html"})
	public String cat(@PathVariable Integer id, ModelMap model) {
		Category objCat = categoryDao.findById(id);
		List<News> listNews = newsDao.findAllJoinCategoryById(id);
		if (id != null) {
			model.addAttribute("objCat", objCat);
			model.addAttribute("listNews", listNews);
		}
		return "anews.anews.cat";
	}
	
}
