package edu.vinaenter.services;

import java.util.List;

import javax.servlet.http.Part;

import edu.vinaenter.dto.LandDto;
import edu.vinaenter.models.Category;

public interface LandService {
	
	
	List<LandDto> findAllPagination(int offset);
	
	int coutPagination();

	int add(LandDto landDto);
	
	LandDto getItem(int id);

	int edit(LandDto dto, int id);
	
	// abstract class: Muốn bbawts bộc các class kế thừa phải override 
	//các method cũng như óc những method chung.
	
	//interface: 100% kế thừa interface  => overide tất cả các method 
	// được định nghĩa trong interface đó
}

