package com.Robot.dao;

import com.Robot.model.User;

/**
 * Created by Kevin on 2018/3/20.
 */
public interface IUserDao {
    User selectUser(long id);
}
