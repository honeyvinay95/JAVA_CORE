package com.dao;

import java.util.List;

import com.model.User;

public interface UserDao {
	boolean saveUser(User user);

	List<User> getAllUsers();

	Object updateUser(User user);

	User getUserById(int i);

	Object deleteUser(User user);

}
