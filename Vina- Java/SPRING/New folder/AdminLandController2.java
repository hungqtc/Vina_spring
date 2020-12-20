package edu.vinaenter.controllers.admins;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.servlet.ServletContext;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import edu.vinaenter.constants.CommonConstants;
import edu.vinaenter.constants.MessageConstants;
import edu.vinaenter.constants.UrlConstants;
import edu.vinaenter.dto.LandDto;
import edu.vinaenter.models.Category;
import edu.vinaenter.services.CategoryService;
import edu.vinaenter.services.LandService;
import edu.vinaenter.utils.FileUtil;

@Controller
@RequestMapping(UrlConstants.URL_ADMIN)
public class AdminLandController {

	@Autowired // tiem doi tuong vao => de su dung
	private ServletContext servletContext;

	@Autowired
	private LandService landService;

	@Autowired
	private CategoryService categoryService;

	@Autowired
	private MessageSource messageSource;

	@GetMapping({ UrlConstants.URL_ADMIN_LAND_INDEX, UrlConstants.URL_ADMIN_LAND_INDEX_PAGINATION })
	public String index(ModelMap model, @PathVariable(required = false) Integer page) {
		if (page == null) {
			page = 1;
		}
		int offset = (page - 1) * CommonConstants.DEFAULT_PAGING_SIZE;
		int countPagination = landService.coutPagination();
		int totalPage = (int) Math.ceil((float) countPagination / CommonConstants.DEFAULT_PAGING_SIZE);

		List<LandDto> listLand = landService.findAllPagination(offset);
		model.addAttribute("totalPage", totalPage);
		model.addAttribute("listLand", listLand);
		model.addAttribute("page", page);

		return "cland.admin.cland.index";
	}

	@GetMapping(UrlConstants.URL_ADMIN_LAND_ADD)
	public String add(ModelMap model) {
		List<Category> listCat = categoryService.findAll();
		model.addAttribute("listCat", listCat);
		return "cland.admin.cland.add";
	}

	@PostMapping(UrlConstants.URL_ADMIN_LAND_ADD)
	public String add(@Valid @ModelAttribute("land") LandDto land, BindingResult rs, RedirectAttributes ra,
			@RequestParam("file") MultipartFile mtf) {
		if (rs.hasErrors()) {
			return "cland.admin.land.add";
		}
		// upload file
	
		String fileName = mtf.getOriginalFilename();
		
		// tao thu muc chua file
		String dirPath = servletContext.getRealPath("") + CommonConstants.DIR_UPLOAD;
		File saveDir = new File(dirPath);
		if (!saveDir.exists()) {
			saveDir.mkdirs();
		}
		String newfilename=FileUtil.rename(fileName);
		// tao duong dan file
		String filePath = dirPath + File.separator + newfilename;
		// tao doi tuong file => upload file len server
		try {
			mtf.transferTo(new File(filePath));
			System.out.println("file path: " + filePath);
			ra.addFlashAttribute("msg", MessageConstants.MSG_SUCCESS);
		} catch (IllegalStateException | IOException e) {
			ra.addFlashAttribute("msg", MessageConstants.MSG_ERR);
		}
		land.setPicture(newfilename);
		int addLand = landService.add(land);

		if (addLand > 0) {
			ra.addFlashAttribute("msg", messageSource.getMessage("admin.land.add.success", null, null));
			return "redirect:" + UrlConstants.URL_ADMIN + UrlConstants.URL_ADMIN_LAND_INDEX;
		}
		ra.addFlashAttribute("msg", messageSource.getMessage("admin.land.add.fail", null, null));
		return "redirect:" + UrlConstants.URL_ADMIN + UrlConstants.URL_ADMIN_LAND_ADD;
	}

	@GetMapping(UrlConstants.URL_ADMIN_LAND_EDIT+"/{id}")
	public String edit(@PathVariable Integer id,ModelMap model) {
		List<Category> listCat = categoryService.findAll();
		model.addAttribute("listCat", listCat);
		LandDto objLand = landService.getItem(id);
		model.addAttribute("objLand", objLand);
		return "cland.admin.cland.edit";
	}
	
	@PostMapping(UrlConstants.URL_ADMIN_LAND_EDIT + "/{id}")
	public String edit(@PathVariable Integer id, @ModelAttribute("land") LandDto landDto, BindingResult rs,
			RedirectAttributes ra,@RequestParam("file") MultipartFile mtf) {
		if ("".equals(landDto.getLandName().trim()) || "".equals(landDto.getDescription().trim())) {
			ra.addFlashAttribute("msg", messageSource.getMessage("admin.cat.edit.msg", null, null));
			return "redirect:/" + UrlConstants.URL_ADMIN + UrlConstants.URL_ADMIN_CAT_EDIT+"/"+id;
		}
		String fileName = mtf.getOriginalFilename();
		
		// tao thu muc chua file
		String dirPath = servletContext.getRealPath("") + CommonConstants.DIR_UPLOAD;
		File saveDir = new File(dirPath);
		if (!saveDir.exists()) {
			saveDir.mkdirs();
		}
		
		String newFileName = FileUtil.rename(fileName);
		String picture = "";
		// upload file
		if ("".equals(fileName)) {
			// không thành công lấy lại tên file cũ
			picture = landDto.getPicture();
		} else {
			// thành công sửa tên file
			picture = FileUtil.rename(newFileName);
		}
		
		landDto.setPicture(picture);
		
		int editLand = landService.edit(landDto,id);

		if (editLand > 0) {
			if (!"".equals(newFileName)) {
				// tao duong dan file
				String filePath = dirPath + File.separator + picture;
				String fileNameOld = landDto.getPicture();
				if (!"".equals(fileNameOld)) {
					// xóa file cũ
					String oldFilepathName = dirPath + File.separator + fileNameOld;
					File oldFile = new File(oldFilepathName);
					if (oldFile.exists()) {
						oldFile.delete();
					}
				}
				try {
					mtf.transferTo(new File(filePath));
					System.out.println("file path: " + filePath);
					ra.addFlashAttribute("msg", MessageConstants.MSG_SUCCESS);
				} catch (IllegalStateException | IOException e) {
					ra.addFlashAttribute("msg", MessageConstants.MSG_ERR);
				}
			}
			ra.addFlashAttribute("msg", messageSource.getMessage("admin.cat.edit.success", null, null));
			return "redirect:" + UrlConstants.URL_ADMIN + UrlConstants.URL_ADMIN_LAND_INDEX;
		}
		ra.addFlashAttribute("msg", messageSource.getMessage("admin.cat.edit.fail", null, null));
		return "redirect:/" + UrlConstants.URL_ADMIN + UrlConstants.URL_ADMIN_LAND_EDIT;
	}
}
