package edu.vinaenter.services;

import java.util.List;

import edu.vinaenter.dto.LandDto;

public interface LandService {
	
	List<LandDto> findAllPagination(int offset);
	
	List<LandDto> findByCid(int cid);
	
	List<LandDto> landHot();
	
	List<LandDto> search(String name);
	
	List<LandDto> relatedLand(LandDto land, int number);
	
	int countPagination();
	
	int countViewsCat(int id);
	
	int countLandByCat(int id);
	
	int add(LandDto land);
	
	int del(int id);
	
	int delByCid(int cid);
	
	int edit(LandDto land);
	
	LandDto findLandById(int id);

}
