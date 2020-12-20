package edu.vinaenter.daos;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import edu.vinaenter.models.Football;

public class FootballDAO {
	public List<Football> getItems() {
		List<Football> listItem = new ArrayList<>();
		listItem.add(new Football(1, "Việt Nam", new Date(1980, 2, 14)));
		listItem.add(new Football(2, "Hàn Quốc", new Date(1990, 12, 4)));
		listItem.add(new Football(3, "Lào", new Date(1995, 6, 7)));
		listItem.add(new Football(4, "Tây Ban Nha", new Date(1881, 7, 9)));
		return listItem;
	}
}
