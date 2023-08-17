package fr.maboite.webshop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.maboite.webshop.jdbcdao.CategoryDao;
import fr.maboite.webshop.model.Example;
import fr.maboite.webshop.spring.MonPremierRepositorySpringDataDao;

@Service
public class ExampleService {

	@Autowired
	private MonPremierRepositorySpringDataDao monPremierRepositorySpringDataDao;
	
	

	public Iterable<Example> getAll() {
		return this.monPremierRepositorySpringDataDao.findAll();
	}

	public Example getById(long id) {
		// TODO Auto-generated method stub
		return this.monPremierRepositorySpringDataDao.findById(id).get();

	}

	public Example save(Example nouvelExample) {
		// TODO Auto-generated method stub
		return monPremierRepositorySpringDataDao.save(nouvelExample);

	}

	public void deleteById(long id) {
		// TODO Auto-generated method stub
		this.monPremierRepositorySpringDataDao.deleteById(id);

	}

	public List<Example> getByNom(String Nom) {
		// TODO Auto-generated method stub
		return this.monPremierRepositorySpringDataDao.findByNom(Nom);

	}

	public List<Example> findByNomAndTaille(String Nom ,float Taille) { 
	  return this.monPremierRepositorySpringDataDao.findByNomAndTaille(Nom, Taille);
	  
	  }
	public List<Example> findByNomAndTailleAllIgnoreCase(String Nom ,float Taille) { 
		  return this.monPremierRepositorySpringDataDao.findByNomAndTailleAllIgnoreCase(Nom, Taille);
		  
		  }

	public List<Example> findByCategory(String categoryName) {
		// TODO Auto-generated method stub
		return this.monPremierRepositorySpringDataDao.findByCategoryNom(categoryName);
	}
	

	

}
