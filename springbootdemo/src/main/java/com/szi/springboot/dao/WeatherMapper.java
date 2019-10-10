package com.szi.springboot.dao;

import com.szi.springboot.entity.Weather;

public interface WeatherMapper {
    int deleteByPrimaryKey(Integer weatherId);

    int insert(Weather record);

    int insertSelective(Weather record);

    Weather selectByPrimaryKey(Integer weatherId);

    int updateByPrimaryKeySelective(Weather record);

    int updateByPrimaryKey(Weather record);
}