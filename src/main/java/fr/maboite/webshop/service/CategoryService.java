package fr.maboite.webshop.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.maboite.webshop.model.Category;
import fr.maboite.webshop.model.Example;

@Service
public class CategoryService {
	
	@Autowired
	private CategoryDao categoryDao;
	
	

	public CategoryService(CategoryDao categoryDao) {
		
		this.categoryDao = categoryDao;
	}

	public void save(Category category) {
		 this.categoryDao.save(category);
	}

	public Optional<Category> findById(Long id) {
		return categoryDao.findById(id);
	}

	public Iterable<Category> findAll() {
		return categoryDao.findAll();
	}

	public void deleteById(Long id) {
		categoryDao.deleteById(id);
	}

	public void delete(Category entity) {
		categoryDao.delete(entity);
	}

	
	
	
	
	
	

}
