package fr.maboite.webshop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.maboite.webshop.model.Category;
import fr.maboite.webshop.model.Example;

@Service
public class MonPremierService {
	
	@Autowired
	private MonPremierDao monPremierDao;

	public MonPremierService(MonPremierDao monPremierDao) {
		
		this.monPremierDao = monPremierDao;
	}

	public MonPremierDao getMonPremierDao() {
		return monPremierDao;
	}

	public void save(Example example) {
		this.monPremierDao.save(example);
	}
	
	public Example getExampleById(Long Id) {
		return this.monPremierDao.findById(Id).orElse(null);
	}
	
	public void delete(Long id) {
		this.monPremierDao.deleteById(id);
	}
	
	public List<Example> findByNom(String nom) {
		return this.monPremierDao.findByNom(nom);
	}
	
	public List<Example> findByNomIgnoringCase(String nom) {
		return this.monPremierDao.findByNomIgnoreCase(nom);
	}
	
	public List<Example> findByPartNomIgnoringCase(String nom) {
		return this.monPremierDao.findByNomContainingIgnoreCase(nom);
	}
	
	public List<Example> findBy2Attribut(String nom,Float taille) {
		return this.monPremierDao.findByNomAndTaille(nom, taille);
	}
	
	public List<Example> findByTwoAttributQuery(String nom,Float taille) {
		return this.monPremierDao.findByTwoAttributs(nom, taille);
	}
	
	public List<Example> findByNomQuery(String nom) {
		return this.monPremierDao.findByNomQuery(nom);
	}
	
	public List<Example> findAllOrderAsc() {
		return this.monPremierDao.findAllorderByNom();
	}
	
	public List<Example> findByCategoryId(Long category_id) {
		return this.monPremierDao.findByCategoryIdId(category_id);
	}
	
	public List<Example> findByCategoryNom(String nom) {
		return this.monPremierDao.findByCategoryIdNom(nom);
	}
	
	
	

}
