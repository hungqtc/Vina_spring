package controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import bean.SinhVien;
@Controller
public class SinhVienController {
	@RequestMapping(value = "index", method = RequestMethod.GET)
	public String index(ModelMap modelMap){
		ArrayList<SinhVien> listSV = new ArrayList<SinhVien>();
		listSV.add(new SinhVien(1,"Đoàn Phương Linh"));
		listSV.add(new SinhVien(2, "Lưu Bị"));
		listSV.add(new SinhVien(3, "Tào Tháo"));
		listSV.add(new SinhVien(4, "Phú IT"));
		modelMap.addAttribute("listSV",listSV);
		return "index";
	}
}
