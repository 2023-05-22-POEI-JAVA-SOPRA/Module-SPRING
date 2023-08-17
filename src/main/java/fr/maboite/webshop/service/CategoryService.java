package fr.maboite.webshop.service;

import org.springframework.beans.factory.annotation.Autowired;

import fr.maboite.webshop.jdbcdao.CategoryDao;

public class CategoryService {
	
	@Autowired
	private CategoryDao categoryDao;

}
