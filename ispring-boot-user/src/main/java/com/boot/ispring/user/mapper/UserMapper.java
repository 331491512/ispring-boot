package com.boot.ispring.user.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.boot.ispring.model.user.entity.UserInfo;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<UserInfo> {
}
