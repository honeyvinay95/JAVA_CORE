package com.dao;

import java.util.List;


import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.model.Supplier;
import com.model.Product;

@Repository(value = "supplierDao")
public class SupplierDaoImpl implements SupplierDao {
	
	@Autowired
	private SessionFactory sessionFactory;
	public SupplierDaoImpl(SessionFactory sessionFactory){
		this.sessionFactory = sessionFactory;
}
	@Transactional
	public boolean save(com.model.Supplier supplier) {
		try {
			sessionFactory.getCurrentSession().save(supplier);
			return true;
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		return false;
		}
	}
	@Transactional
	public boolean update(com.model.Supplier supplier) {
		try {
			sessionFactory.getCurrentSession().update(supplier);
			return true;
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}
	@Transactional
	public boolean delete(com.model.Supplier supplier){
		try {
			sessionFactory.getCurrentSession().delete(supplier);
			return true;
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}
	
	@Transactional
    public List<com.model.Supplier> List() {
		String hql ="from Supplier";
    	Query query = sessionFactory.getCurrentSession().createQuery(hql);
    	return query.list();
	}

	@Transactional
	public boolean delete(int id) {
		try {
			  Session session =sessionFactory.getCurrentSession();
		         Supplier p = (Supplier) session.get(Supplier.class, new Integer(id));

		    	  session.delete(p);
			return true;
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}
	@Transactional
	public com.model.Supplier get(int id) {
		String hql ="from Supplier where id ="+"'"+id+"'";
    	Query query =sessionFactory.getCurrentSession().createQuery(hql);
    	List<Supplier>list =query.list();
    	if(list == null){
    		return null;
    	}
    	else{
    		return list.get(0);
    	}
	}
	@Transactional
	public com.model.Supplier getSupplierByName(String name) {
		return  (Supplier)sessionFactory.getCurrentSession().createQuery("from Supplier where name ='"+name+"'").uniqueResult();
	}
	public Object saveSupplier(Supplier supplier) {
		// TODO Auto-generated method stub
		return null;
	}
	public Supplier getSupplierById(int i) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public Object updateSupplier(Supplier supplier) {
		// TODO Auto-generated method stub
		return null;
	}
	public Object deleteSupplier(Supplier supplier) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public java.util.List<Supplier> getAllSupplier() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	
	
	
	
	
	

	}