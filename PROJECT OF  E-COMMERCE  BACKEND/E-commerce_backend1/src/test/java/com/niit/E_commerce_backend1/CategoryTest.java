package com.niit.E_commerce_backend1;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.dao.CategoryDao;
import com.model.Category;

public class CategoryTest {

	private static AnnotationConfigApplicationContext context;
	private static Category category;
	private static CategoryDao categoryDAO;
	
	@BeforeClass
	public static void init()
	{
		context = new AnnotationConfigApplicationContext();
		context.scan("com");
		context.refresh();
		
		category = (Category)context.getBean("category");
		categoryDAO = (CategoryDao)context.getBean("categoryDAO");
	}
 @Ignore
	@Test
	public void add_user_success()
	{
		category.setCategoryName("Honey");
		category.setDescription("Hoooney");
		category.setType("Big");
		category.setActive(false);
		category.setId(1001);
		assertEquals(true, categoryDAO.saveCategory(category));
	}
	
	@Test
	public void get_user_by_id()
	{
		//user.setUserId(1);
		Category myCategory= categoryDAO.getCategoryById(1);
		assertNotNull(myCategory);
		assertEquals("niit2", myCategory.getCategoryName());
	}
	
	@Test
	public void update_user_success(){
		category= categoryDAO.getCategoryById(2);
		category.setActive(false);
		category.setType("small");
		assertEquals(true, categoryDAO.updateCategory(category));
		
	}
	
	@Test
	public void delete_user_success(){
		category= categoryDAO.getCategoryById(3);
		assertEquals(true, categoryDAO.deleteCategory(category));
		
	}
	
	@Test
	public void get_all_users_success(){
		List<Category> list = categoryDAO.getAllCategory();
		assertEquals(2, list.size());
		
	}
	
}