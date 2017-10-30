package com.dao;

import java.util.List;



import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.model.contact;

@Repository
public class contactDaoImpl implements contactDao {
	@Autowired
	private SessionFactory sessionFactory;
	public  contactDaoImpl(){
		System.out.println("contactDaoImpl object is created");
	}
	@Transactional
	public void saveContact(contact contactus) {
Session session=sessionFactory.getCurrentSession();
		
		
		
		session.save(contactus);
		
		
		
	}
	
}