package com.cn.szl.tupu.servive.impl;

import com.cn.szl.tupu.dao.UserDao;
import com.cn.szl.tupu.entity.Result;
import com.cn.szl.tupu.entity.User;
import com.cn.szl.tupu.service.util.RedisUtil;
import com.cn.szl.tupu.servive.IUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

@Service
@CacheConfig(cacheNames = "User")
public class UserServiceImpl implements IUserService{

    private static Logger log = LoggerFactory.getLogger(UserServiceImpl.class);
    @Autowired
    private UserDao userDao;

//    @Autowired
//    private RedisUtil redisUtil;

    
    @Override
    @Cacheable
    public Result add(User user){
//        redisUtil.set(user)
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

//    @Cacheable(key = "caches[0].name + #name")
    @Override
    public User getByName(String userName){
        return userDao.selectUserByName(userName);
    };

}
