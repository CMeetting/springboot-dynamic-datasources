package com.wl.output.goodsout.service.impl;

import com.wl.output.goodsout.config.TargetDataSource;
import com.wl.output.goodsout.dao.UserDao;
import com.wl.output.goodsout.model.UserDo;
import com.wl.output.goodsout.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;


    @TargetDataSource("masterDataSource")
    @Transactional(rollbackFor = Exception.class)
    @Override
    public UserDo selectByPrimaryKey(Integer id) {
        return userDao.selectByPrimaryKey(id);
    }

    @TargetDataSource("slaveDataSource")
    @Transactional(rollbackFor = Exception.class)
    @Override
    public List<UserDo> selectAll() {
        return userDao.selectAll();
    }
}
