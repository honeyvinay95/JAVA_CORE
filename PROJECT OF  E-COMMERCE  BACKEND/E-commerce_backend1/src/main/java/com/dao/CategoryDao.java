package com.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.model.Category;

@Repository
public interface CategoryDao {
	public boolean save(Category category);
	public boolean update(Category category);
	public boolean delete(int id);
	public Category get(String id);
	public Category getCategoryByName(String name);
public List<Category> list();
public Object saveCategory(Category category);
public Category getCategoryById(int i);
public Object updateCategory(Category category);
public Object deleteCategory(Category category);
public List<Category> getAllCategory();
}
