package fr.plage.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.plage.dao.HotelDao;
import fr.plage.entity.Hotel;

@Service
public class HotelService {

	@Autowired
	private HotelDao hotDao;
	
	public Hotel create(Hotel hot) {
		return this.hotDao.save(hot);
	}
	
	public String getById(Integer id) {
		return this.hotDao.getById(id);
	}
	
	public String delById(Integer id) {
		return this.hotDao.delById(id);
	}
}
