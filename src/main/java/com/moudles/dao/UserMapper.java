package com.moudles.dao;

import com.common.persistence.annotation.MyBatisDao;
import com.moudles.model.User;

@MyBatisDao
public interface UserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}