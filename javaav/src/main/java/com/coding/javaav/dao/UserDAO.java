package com.coding.javaav.dao;

import com.coding.javaav.models.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserDAO {

    public List<User> listAll(){
        List<User> list = new ArrayList<>();
        User user = new User();
        user.setEmail("test@gmail.com");
        list.add(user);
        list.add(user);
        list.add(user);
        return list;
    }
}
