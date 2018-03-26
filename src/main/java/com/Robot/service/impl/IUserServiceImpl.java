package com.Robot.service.impl;

import com.Robot.dao.IUserDao;
import com.Robot.model.User;
import com.Robot.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by Kevin on 2018/3/20.
 */
@Service("userService")
public class IUserServiceImpl implements IUserService {

    @Resource
    private IUserDao dao;
    @Override
    public User selectUser(Long userId) {
        return dao.selectUser(userId);
    }
}
