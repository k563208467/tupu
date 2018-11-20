package com.cn.szl.tupu.servive;

import com.cn.szl.tupu.entity.Result;
import com.cn.szl.tupu.entity.User;

public interface IUserService {
    Result add(User user);

    Result delete(int userId);

    Result update(int userId);

    User getById(int userId);

    User getByName(String userName);

}
