package org.spring.springboot.controller;


import org.spring.springboot.pojo.User;
import org.spring.springboot.service.CityService;
import org.spring.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/api/user/", method = RequestMethod.GET)
    public List<User> getUserList() {
        return userService.getUserList();
    }

    @RequestMapping(value = "/api/user/{id}", method = RequestMethod.GET)
    public List<User> getUserByid(@PathVariable("id") int id){
        return userService.getUserByid(id);
    }


    @RequestMapping(value = "/api/user/insert/{id}/{name}/{version}", method = RequestMethod.PUT)
    public int insertUser(@PathVariable("id") int id,@PathVariable("name") String name ,@PathVariable("version") long version){
        return userService.insertUser(id,name,version);
    }

    @RequestMapping(value = "/api/user/update/{id}/{name}/{version}", method = RequestMethod.POST)
    public int updateUser(@PathVariable("id") int id,@PathVariable("name") String name ,@PathVariable("version") long version){
        return userService.updateUser(id,name,version);
    }

    @RequestMapping(value = "/api/user/delete/{id}/{version}", method = RequestMethod.DELETE)
    public int deleteUser(@PathVariable("id") int id,@PathVariable("version") long version){
        return userService.deleteUser(id,version);
    }
    @RequestMapping(value = "/api/user/test/", method = RequestMethod.GET)
    public List<User> list(){
        return userService.list();
    }
}


