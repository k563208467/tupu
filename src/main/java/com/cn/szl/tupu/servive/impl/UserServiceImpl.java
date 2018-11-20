package com.cn.szl.tupu.servive.impl;

import com.cn.szl.tupu.dao.UserDao;
import com.cn.szl.tupu.entity.Result;
import com.cn.szl.tupu.entity.User;
import com.cn.szl.tupu.servive.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements IUserService{

    @Autowired
    private UserDao userDao;

    @Override
    public Result add(User user){
        return userDao.add(user);
    };

    @Override
    public Result delete(int userId){
        return null;
    };

    @Override
    public Result update(int userId){
        return null;
    };

    @Override
    public User getById(int userId){
        return null;
    };

    @Override
    public User getByName(String userName){
        return userDao.selectUserByName(userName);
    };

}
