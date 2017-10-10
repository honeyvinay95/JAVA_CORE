package com.niit.E_commerce_backend1;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.dao.SupplierDao;
import com.model.Supplier;

public class SupplierTest {

	private static AnnotationConfigApplicationContext context;
	private static Supplier supplier;
	private static SupplierDao supplierDAO;
	
	@BeforeClass
	public static void init()
	{
		context = new AnnotationConfigApplicationContext();
		context.scan("com");
		context.refresh();
		
		supplier = (Supplier)context.getBean("supplier");
		supplierDAO = (SupplierDao)context.getBean("supplierDAO");
	}
   @Ignore
	@Test
	public void add_user_success()
	{
	    supplier.setId(001);
		supplier.setName("Honey");
		supplier.setAddress("Delhi");
		supplier.setActive(false);
		assertEquals(true, supplierDAO.saveSupplier(supplier));
	}

	@Test
	public void get_user_by_id()
	{
		//user.setUserId(1);
		Supplier mySupplier= supplierDAO.getSupplierById(1);
		assertNotNull(mySupplier);
		assertEquals("niit3", mySupplier.getSupplierName());
	}
	
	@Test
	public void update_user_success(){
		supplier= supplierDAO.getSupplierById(2);
		supplier.setActive(false);
		supplier.setId(002);
		assertEquals(true, supplierDAO.updateSupplier(supplier));
		
	}
	
	@Test
	public void delete_user_success(){
		supplier= supplierDAO.getSupplierById(3);
		assertEquals(true, supplierDAO.deleteSupplier(supplier));
		
	}
	
	@Test
	public void get_all_users_success(){
		List<Supplier> list = supplierDAO.getAllSupplier();
		assertEquals(2, list.size());
		
	}
	
}