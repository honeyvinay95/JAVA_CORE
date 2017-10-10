package com.niit.E_commerce_backend1;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.dao.UserDao;
import com.model.User;

public class UserTest {

	private static AnnotationConfigApplicationContext context;
	private static User user;
	private static UserDao userDAO;
	
	@BeforeClass
	public static void init()
	{
		context = new AnnotationConfigApplicationContext();
		context.scan("com");
		context.refresh();
		
		user = (User)context.getBean("user");
		userDAO = (UserDao)context.getBean("userDao");
	}
 @Ignore
	@Test
	public void add_user_success()
	{
		user.setUsername("Honey");
		user.setPassword("Honey@123");
		user.setEmail("Honey@gmail.com");
		user.setActive(false);
		user.setMobile(99110939);
		assertNotNull(userDAO.saveUser(user));
	}
    
	@Test
	public void get_user_by_id()
	{
		//user.setUserId(1);
		User myUser= userDAO.getUserById(1);
		assertNotNull(myUser);
		assertEquals("niit1", myUser.getUsername());
	}
	@Test
	public void update_user_success(){
		User user= userDAO.getUserById(2);
		user.setActive(false);
		user.setMobile(99110936588L);
		assertEquals(true, userDAO.updateUser(user));
		
	}
	@Ignore
	@Test
	public void delete_user_success(){
		user= userDAO.getUserById(3);
		assertEquals(true, userDAO.deleteUser(user));
		
	}
	
	@Test
	public void get_all_users_success(){
		List<User> list = userDAO.getAllUsers();
		assertEquals(2, list.size());
		
	}
	
}