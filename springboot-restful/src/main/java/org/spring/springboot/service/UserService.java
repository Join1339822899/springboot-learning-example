package org.spring.springboot.service;

import org.spring.springboot.pojo.User;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


public interface UserService {

    /**
     *   查看所有用户信息
     *   @return
     */
    List<User> getUserList();

    /**
     * 查看满足条件的用户信息
     *
     * @param id
     * @return
     */
    List<User> getUserByid(int id);

    /**
     * 插入新的数据
     *
     * @param id , name , version
     * @return
     */
    int insertUser(int id , String name , long version);

    /**
     * 更新满足条件的数据
     *
     * @param id , name , version
     * @return
     */
    int updateUser(int id , String name , long version);

    /**
     * 删除满足条件的数据
     *
     * @param id,version
     * @return
     */
    int deleteUser(int id , long version);


    List<User> list();

}
