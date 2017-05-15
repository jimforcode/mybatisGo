package com.jim.dao;
import java.util.List;

import com.jim.model.User;

 
public interface UserDao {

    public void insert(User user);
    
    public User findUserById (int userId);
    
    public List<User> findAllUsers();
    
}