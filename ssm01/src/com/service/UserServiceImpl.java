package com.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mapper.UserMapper;
import com.vo.User;

@Service
@Transactional
public class UserServiceImpl implements UserService{
	@Resource
    public UserMapper userMapper;
	public int findAge(int uid) {
		int age =userMapper.findAge(uid);
        return age;
	}
	
	public User findByUid(int uid) {
		User user =userMapper.findByUid(uid);
		return user;
	}

}

