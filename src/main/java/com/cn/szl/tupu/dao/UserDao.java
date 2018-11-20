package com.cn.szl.tupu.dao;

import com.cn.szl.tupu.entity.Result;
import com.cn.szl.tupu.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 用户DAO接口
 */
@Component
public interface UserDao{
    @Insert("insert into user(user_name,password,tel,email,role)"
            + "values (#{userName},#{password},#{telephone},#{email},#{role})")
    public Result add(User user);

    @Select("select * from user where user_name = #{username}")
    public User selectUserByName(String username);
}
