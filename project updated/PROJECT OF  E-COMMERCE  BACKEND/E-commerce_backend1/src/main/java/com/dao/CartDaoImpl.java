/*package com.dao;

import java.util.*;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dao.*;
import com.model.*;


@Repository
public class CartDaoImpl 

{
@Autowired
SessionFactory sessionFac;

public CartDaoImpl(SessionFactory sessionFac)
{
	this.sessionFac = sessionFac;
}

public void insert (Cart cart)
{
	Session session = sessionFac.openSession();
	
	session.beginTransaction();
	session.persist(cart);
	session.persist(cart);
	session.getTransaction().commit();	
}

public List<Cart> findCartById(String userID)

{
	Session session = sessionFac.openSession();
	List <Cart> cr=null;
	try {
		session.beginTransaction();
		cr=(List<Cart>)session
				.createQuery("from Cart where userMailID= :email")
				.setString("email", userID).list();
		session.getTransaction().commit();
		}
	catch(HibernateException e)
	{
		session.getTransaction().rollback();
		}
	return cr;
}
public Cart gettCartByID (int cartID , String UserEmail)
{
	Session session=sessionFac.openSession();
	Cart cr=null;
	try
	{
		session.beginTransaction();
	//	cr= (Cart)session
	//			.createQuery("from Cart where userMailID= :email and cartProductID= )
		//		.setString ("")		
//	}
//}
//}
*/