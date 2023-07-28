package fr.plage.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.plage.dao.HotelDao;
import fr.plage.entity.Hotel;

@Service
public class HotelService {

	@Autowired
	private HotelDao hotDao;
	
	public Hotel create(Hotel hotervation) {
		return this.hotDao.save(hotervation);
	}
	
	public void getById(Integer id) {
		System.out.println(this.hotDao.getById(id));
	}
	
	public void delById(Integer id) {
		System.out.println(this.hotDao.delById(id));
	}
}
