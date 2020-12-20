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
import edu.vinaenter.models.Category;
import edu.vinaenter.models.User;
import edu.vinaenter.services.CategoryService;
import edu.vinaenter.services.UserService;

@Controller
@RequestMapping(UrlConstants.URL_ADMIN)
public class AdminUserController {

	@Autowired
	private UserService userService;

	@Autowired
	private MessageSource messageSource;

	@GetMapping(UrlConstants.URL_ADMIN_USER_INDEX)
	public String index(Model model) {
		List<User> listUser = userService.findAll();
		model.addAttribute("listUser", listUser);
		return "cland.admin.user.index";

	}

	@GetMapping(UrlConstants.URL_ADMIN_USER_ADD)
	public String add() {
		return "cland.admin.user.add";
	}

	@PostMapping(UrlConstants.URL_ADMIN_USER_ADD)
	public String add(@Valid @ModelAttribute("user") User user, BindingResult rs, RedirectAttributes ra) {

		if (rs.hasErrors()) {
			return "cland.admin.user.add";
		}
		if (userService.hadUser(user) > 0) {
			ra.addFlashAttribute("msg", messageSource.getMessage("admin.error.had.user", null, null));
			return "redirect:/admin/user/add";
		}
		int addUser = userService.add(user);
		if (addUser > 0) {
			ra.addFlashAttribute("msg", messageSource.getMessage("admin.user.add.success", null, null));
			return "redirect:/admin/user/index";
		}
		ra.addFlashAttribute("msg", messageSource.getMessage("admin.user.add.fail", null, null));
		return "redirect:/admin/user/add";
	}

	@GetMapping(UrlConstants.URL_ADMIN_USER_DEL)
	public String del(@PathVariable int id, RedirectAttributes ra) {
		int delUser = userService.del(id);
		if (delUser > 0) {
			ra.addFlashAttribute("msg", messageSource.getMessage("admin.user.del.success", null, null));
			return "redirect:/admin/user/index";
		}
		ra.addFlashAttribute("msg", messageSource.getMessage("admin.user.del.fail", null, null));
		return "redirect:/admin/user/index";
	}

	@GetMapping(UrlConstants.URL_ADMIN_USER_EDIT)
	public String edit(@PathVariable int id, Model model) {
		User oldUser = userService.getItem(id);
		model.addAttribute("oldUser", oldUser);
		return "cland.admin.user.edit";
	}

	@PostMapping(UrlConstants.URL_ADMIN_USER_EDIT)
	public String edit( @ModelAttribute("user") User user, BindingResult rs, RedirectAttributes ra, Model model) {
		if (rs.hasErrors()) {
			User oldUser = userService.getItem(user.getId());
			model.addAttribute("oldUser", oldUser);
			return "cland.admin.user.edit";
		}

		int editUser = userService.edit(user);
		if (editUser > 0) {
			ra.addFlashAttribute("msg", messageSource.getMessage("admin.user.edit.success", null, null));
			return "redirect:/admin/user/index";
		}
		ra.addFlashAttribute("msg", messageSource.getMessage("admin.user.edit.fail", null, null));
		return "redirect:/admin/user/edit";
	}

}
