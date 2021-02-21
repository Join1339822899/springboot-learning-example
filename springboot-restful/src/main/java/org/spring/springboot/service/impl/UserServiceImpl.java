package org.spring.springboot.service.impl;

import org.spring.springboot.dao.UserMapper;
import org.spring.springboot.pojo.User;
import org.spring.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> getUserList() {
        return userMapper.getUserList();
    }

    @Override
    public List<User> getUserByid(int id) {
        return userMapper.getUserByid(id);
    }

    @Override
    public int insertUser(int id, String name, long version) {
        return userMapper.insertUser(id,name,version);
    }

    @Override
    public int updateUser(int id, String name, long version) {
        return userMapper.updateUser(id,name,version);
    }

    @Override
    public int deleteUser(int id, long version) {
        return userMapper.deleteUser(id,version);
    }


    public ArrayList<User> list(){
        ArrayList<User> userlist = new ArrayList<User>();
        User user = new User();
        user.setId(1);
        user.setName("LIYANJI");
        user.setVersion(0);
        userlist.add(user);
        return userlist;
    }
}
