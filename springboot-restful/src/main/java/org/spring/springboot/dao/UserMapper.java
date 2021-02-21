package org.spring.springboot.dao;


import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.spring.springboot.pojo.User;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
@Mapper
public interface UserMapper {
    List<User> getUserList(); //方法名对应UserMapper

    List<User> getUserByid(int id);

    int insertUser(@Param("id") int id, @Param("name") String name , @Param("version") long version);

    int updateUser(@Param("id") int id, @Param("name") String name ,@Param("version") long version);

    int deleteUser(@Param("id") int id ,@Param("version") long version);
}
