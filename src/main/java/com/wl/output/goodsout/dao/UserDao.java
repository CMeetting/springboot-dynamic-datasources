package com.wl.output.goodsout.dao;

import com.wl.output.goodsout.config.TargetDataSource;
import com.wl.output.goodsout.model.UserDo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface UserDao {
    int deleteByPrimaryKey(Integer id);

    int insert(UserDo record);

//    @TargetDataSource("masterDataSource")
    UserDo selectByPrimaryKey(Integer id);

//    @TargetDataSource("slaveDataSource")
    List<UserDo> selectAll();

    int updateByPrimaryKey(UserDo record);
}