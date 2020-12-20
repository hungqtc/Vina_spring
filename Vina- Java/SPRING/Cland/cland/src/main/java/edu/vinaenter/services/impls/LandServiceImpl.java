package edu.vinaenter.services.impls;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.vinaenter.daos.CategoryDao;
import edu.vinaenter.daos.LandDao;
import edu.vinaenter.dto.LandDto;
import edu.vinaenter.models.Category;
import edu.vinaenter.services.CategoryService;
import edu.vinaenter.services.LandService;

@Service
public class LandServiceImpl implements LandService {
	@Autowired
	private LandDao landDao;

	@Override
	public List<LandDto> findAllPagination(int offset) {
		return landDao.findAllPagination(offset);
	}

	@Override
	public int countPagination() {
		return landDao.countPagination();
	}

	@Override
	public int add(LandDto land) {
		return landDao.addItem(land);
	}

	@Override
	public int del(int id) {
		return landDao.delItem(id);
	}

	@Override
	public int edit(LandDto land) {
		return landDao.editItem(land);
	}

	@Override
	public LandDto findLandById(int id) {
		return landDao.findLandByid(id);
	}

	@Override
	public int delByCid(int cid) {
		return landDao.delItemByCid(cid);
	}

	@Override
	public List<LandDto> findByCid(int cid) {
		return landDao.findByCid(cid);
	}

	@Override
	public List<LandDto> landHot() {
		return landDao.landHot();
	}

	@Override
	public int countLandByCat(int id) {
		return landDao.countLandByCat(id);
	}

	@Override
	public int countViewsCat(int id) {
		if (landDao.countViewsCat(id) == null) {
			return 0;
		}
		return landDao.countViewsCat(id);
	}

	@Override
	public List<LandDto> relatedLand(LandDto land, int number) {
		return landDao.findRelatedLand(land, number);
	}

	@Override
	public List<LandDto> search(String name) {
		return landDao.findLandByName(name);
	}

}
