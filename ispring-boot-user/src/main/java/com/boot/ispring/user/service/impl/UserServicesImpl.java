package com.boot.ispring.user.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.boot.ispring.model.user.entity.UserInfo;
import com.boot.ispring.user.mapper.UserMapper;
import com.boot.ispring.user.service.UserServices;

import org.springframework.stereotype.Service;

@Service
public class UserServicesImpl extends ServiceImpl<UserMapper, UserInfo> implements UserServices {
}
