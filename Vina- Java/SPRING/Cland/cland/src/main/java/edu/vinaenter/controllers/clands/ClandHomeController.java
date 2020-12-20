
package edu.vinaenter.controllers.clands;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import edu.vinaenter.constants.CommonConstants;
import edu.vinaenter.constants.UrlConstants;
import edu.vinaenter.dto.CatDto;
import edu.vinaenter.dto.LandDto;
import edu.vinaenter.models.Category;
import edu.vinaenter.models.Contact;
import edu.vinaenter.models.User;
import edu.vinaenter.services.CategoryService;
import edu.vinaenter.services.ContactService;
import edu.vinaenter.services.LandService;

@Controller
public class ClandHomeController {

	@Autowired
	LandService landService;

	@Autowired
	JavaMailSender mailSender;

	@Autowired
	CategoryService categoryService;

	@Autowired
	ContactService contactService;

	@Autowired
	private MessageSource messageSource;

	@ModelAttribute
	public void commonObjects(ModelMap model) {
		List<CatDto> listCat = categoryService.findAllDto();
		for (CatDto category : listCat) {
			category.setCountLand(landService.countLandByCat(category.getId()));
			category.setCountViews(landService.countViewsCat(category.getId()));
		}
		model.addAttribute("listCat", listCat);

		List<LandDto> listLandHot = landService.landHot();
		model.addAttribute("listLandHot", listLandHot);
	}

	@GetMapping({ UrlConstants.URL_CLAND_HOME, UrlConstants.URL_CLAND_HOME_PAGINATION })
	public String home(Model model, @PathVariable(name = "page", required = false) Integer page) {

		if (page == null) {
			page = 1;
		}
		int offset = (page - 1) * CommonConstants.DEFAULT_PAGING_SIZE;
		int countPagination = landService.countPagination();

		int totalPage = (int) Math.ceil((float) countPagination / CommonConstants.DEFAULT_PAGING_SIZE);
		List<LandDto> listCland = landService.findAllPagination(offset);

	
		model.addAttribute("listCland", listCland);
		model.addAttribute("page", page);
		model.addAttribute("totalPage", totalPage);

		return "cland.cland.index";
	}

	@GetMapping(value = { UrlConstants.URL_CLAND_SEARCH })
	public String search( ModelMap model, @RequestParam("name") String lname) {

		List<LandDto> listCland = landService.search(lname);
		model.addAttribute("listCland", listCland);

		return "cland.cland.index";
	}

	@GetMapping(value = { UrlConstants.URL_CLAND_CAT })
	public String cat(@PathVariable Integer id, ModelMap model) {
		Category cat = categoryService.getItem(id);
		List<LandDto> listLand = landService.findByCid(id);
		if (id != null) {
			model.addAttribute("cat", cat);
			model.addAttribute("listLand", listLand);
		}
		return "cland.cland.cat";
	}

	@GetMapping(value = { UrlConstants.URL_CLAND_DETAIL })
	public String detail(@PathVariable Integer id, ModelMap model) {

		LandDto land = landService.findLandById(id);
		List<LandDto> relatedLand = landService.relatedLand(land, 3);

		model.addAttribute("relatedLand", relatedLand);
		model.addAttribute("land", land);
		return "cland.cland.detail";
	}

	@GetMapping(UrlConstants.URL_CLAND_CONTACT)
	public String contact() {
		return "cland.cland.contact";
	}

	@PostMapping(UrlConstants.URL_CLAND_CONTACT)
	public String addcontact(@ModelAttribute("contact") Contact contact, RedirectAttributes ra) {

		// create e-mail obj
		SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
		simpleMailMessage.setTo(contact.getEmail());
		simpleMailMessage.setText(contact.getContent());
		simpleMailMessage.setSubject(contact.getSubject());
		// send e-mail
		mailSender.send(simpleMailMessage);
		System.out.println("ok");
		return "cland.cland.index";

		/*
		 * int addcontact = contactService.add(contact); if (addcontact > 0) {
		 * 
		 * ra.addFlashAttribute("msg", messageSource.getMessage("contact.add.success",
		 * null, null)); return "redirect:/contact"; }
		 * 
		 * ra.addFlashAttribute("msg", messageSource.getMessage("contact.add.fail",
		 * null, null)); return "redirect:/home";
		 */

	}

}
