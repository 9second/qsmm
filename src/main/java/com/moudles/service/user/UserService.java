package com.moudles.service.user;

import com.common.entry.SearchResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by admin on 2016/10/7.
 */
@Service("userService")
public class UserService {
    @Autowired
    private UserMapper userMapper;
    //获取用户列表
    public SearchResult selectUser(User user){
        SearchResult<User> result=new SearchResult();
        result.setTotalRows(userMapper.selectPage(user));
        result.setRows(userMapper.selectUser(user));
        return result;
    }
    //删除用户
    public Integer deleteUser(User user){
        return userMapper.deleteUser(user);
    }
}
