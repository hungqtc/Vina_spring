package edu.vinaenter.services.impls;

import java.util.List;

import javax.servlet.http.Part;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.vinaenter.daos.LandDao;
import edu.vinaenter.dto.LandDto;
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
	public int coutPagination() {
		return landDao.countPagination();
	}


	@Override
	public int add(LandDto landDto) {
		return landDao.add(landDto);
	}

	@Override
	public LandDto getItem(int id) {
		return landDao.getItem(id);
	}

	@Override
	public int edit(LandDto landDto, int id) {
		return landDao.edit(landDto, id);
	}

	
}
