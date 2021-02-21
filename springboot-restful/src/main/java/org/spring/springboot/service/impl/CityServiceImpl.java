package org.spring.springboot.service.impl;

import org.spring.springboot.dao.CityMapper;
import org.spring.springboot.pojo.City;
import org.spring.springboot.pojo.User;
import org.spring.springboot.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * 城市业务逻辑实现类
 *
 * Created by bysocket on 07/02/2017.
 */
@Service
public class CityServiceImpl implements CityService {

    @Autowired
    private CityMapper cityMapper;

    public List<City> findAllCity(){
        return cityMapper.findAllCity();
    }

    public City findCityById(Long id) {
        return cityMapper.findById(id);
    }

    @Override
    public Long saveCity(City city) {
        return cityMapper.saveCity(city);
    }

    @Override
    public Long updateCity(City city) {
        return cityMapper.updateCity(city);
    }

    @Override
    public Long deleteCity(Long id) {
        return cityMapper.deleteCity(id);
    }

    @Override
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
