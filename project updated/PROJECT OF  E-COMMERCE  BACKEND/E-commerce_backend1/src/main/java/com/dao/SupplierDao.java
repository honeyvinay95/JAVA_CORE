package com.dao;
import java.util.List;


import org.springframework.stereotype.Repository;

import com.model.Supplier;



@Repository
public interface SupplierDao {

public boolean save(Supplier supplier);
public boolean update(Supplier supplier);
 public boolean delete(int id);
//public boolean delete(Supplier supplier);
public Supplier get(int id);
public Supplier getSupplierByName(String name);
public List<Supplier> List();
public Object saveSupplier(Supplier supplier);
public Supplier getSupplierById(int i);
public Object updateSupplier(Supplier supplier);
public Object deleteSupplier(Supplier supplier);
public List<Supplier> getAllSupplier();	


}

