package com.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
 
@Entity
public class Cart implements Serializable {
       /**
       *
        */
       private static final long serialVersionUID = 1L;
 
       @Id
       @GeneratedValue(strategy=GenerationType.AUTO)
       private long id;
      
       @Column(name="user_id")
       private String userID;
       
       private int price;
       
       @Column(name="product_name")
       private String productName;
       
       private char status;

      
       public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) {
		this.userID = userID;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public char getStatus() {
		return status;
	}

	public void setStatus(char status) {
		this.status = status;
	}

	}
      