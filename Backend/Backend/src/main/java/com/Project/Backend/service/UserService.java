package com.Project.Backend.service;

import com.Project.Backend.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    /**
     * create
     * read
     * delete
     * update*/
    public User createUser(User user);

    //read User
    public List<User> getUsers();
    public User getUserById(long id);

    public void deleteUser(long id);

    public User updateUser(User user, long id);

}
