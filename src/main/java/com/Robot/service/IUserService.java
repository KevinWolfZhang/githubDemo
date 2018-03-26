package com.Robot.service;

import com.Robot.model.User;

/**
 * Created by Kevin on 2018/3/20.
 */
public interface IUserService {
    User selectUser(Long userId);
}
