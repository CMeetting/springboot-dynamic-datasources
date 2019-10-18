package com.wl.output.goodsout.service;

import com.wl.output.goodsout.model.UserDo;

import java.util.List;

public interface UserService {

    UserDo selectByPrimaryKey(Integer id);

    List<UserDo> selectAll();
}
