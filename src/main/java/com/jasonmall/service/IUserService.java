package com.jasonmall.service;

import com.jasonmall.common.ServerResponse;
import com.jasonmall.pojo.User;

/**
 * Created by jguo1 on 2018/7/21.
 */

public interface IUserService {

    ServerResponse<User> login(String username, String password);
}
