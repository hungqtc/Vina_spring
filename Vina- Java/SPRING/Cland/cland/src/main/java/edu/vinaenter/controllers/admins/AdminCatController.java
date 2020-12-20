package edu.vinaenter.controllers.admins;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import edu.vinaenter.constants.UrlConstants;
import edu.vinaenter.dto.LandDto;
import edu.vinaenter.models.Category;
import edu.vinaenter.services.CategoryService;
import edu.vinaenter.services.LandService;
import edu.vinaenter.utils.FileUtil;

@Controller
@RequestMapping(UrlConstants.URL_ADMIN)
public class AdminCatController {

	@Autowired
	private CategoryService categoryService;

	@Autowired
	private LandService landService;
	
	@Autowired
	private MessageSource messageSource;

	@GetMapping(UrlConstants.URL_ADMIN_CAT_INDEX)
	public String index(Model model) {
		List<Category> listCat = categoryService.findAll();
		model.addAttribute("listCat", listCat);
		return "cland.admin.cat.index";

	}

	@GetMapping(UrlConstants.URL_ADMIN_CAT_ADD)
	public String add() {
		return "cland.admin.cat.add";
	}

	@PostMapping(UrlConstants.URL_ADMIN_CAT_ADD)
	public String add(@Valid @ModelAttribute("cat") Category cat, BindingResult rs, RedirectAttributes ra) {
		if (rs.hasErrors()) {
			return "cland.admin.cat.add";
		}

		int addCat = categoryService.add(cat);
		if (addCat > 0) {
			ra.addFlashAttribute("msg", messageSource.getMessage("admin.cat.add.success", null, null));
			return "redirect:/admin/cat/index";
		}
		ra.addFlashAttribute("msg", messageSource.getMessage("admin.cat.add.fail", null, null));
		return "redirect:/" + UrlConstants.URL_ADMIN_CAT_ADD;
	}

	@GetMapping(UrlConstants.URL_ADMIN_CAT_DEL)
	public String del(@PathVariable int id, RedirectAttributes ra) {
		int delCat = categoryService.del(id);
		List<LandDto> listLand = landService.findByCid(id);
		for (LandDto landDto : listLand) {
			String fileName = landDto.getPicture();
			FileUtil.delFile(fileName);
		}
		/*
		 * if (delCat > 0) { landService.delByCid(id); ra.addFlashAttribute("msg",
		 * messageSource.getMessage("admin.cat.del.success", null, null)); return
		 * "redirect:/admin/cat/index"; }
		 */
		ra.addFlashAttribute("msg", messageSource.getMessage("admin.cat.del.fail", null, null));
		return "redirect:/admin/cat/index";
	}
	
	@GetMapping(UrlConstants.URL_ADMIN_CAT_EDIT)
	public String edit(@PathVariable int id, Model model) {
		Category oldCat = categoryService.getItem(id);
		model.addAttribute("oldCat", oldCat);
		return "cland.admin.cat.edit";
	}
	
	@PostMapping(UrlConstants.URL_ADMIN_CAT_EDIT)
	public String edit(@ModelAttribute("cat") Category cat, RedirectAttributes ra) {
		int editCat = categoryService.edit(cat);
		if (editCat > 0) {
			ra.addFlashAttribute("msg", messageSource.getMessage("admin.cat.edit.success", null, null));
			return "redirect:/admin/cat/index";
		}
		ra.addFlashAttribute("msg", messageSource.getMessage("admin.cat.edit.fail", null, null));
		return "redirect:/admin/cat/edit";
	}
}
