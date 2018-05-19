package com.mapper;

import com.vo.User;

	public interface UserMapper {
	    int findAge(int uid);
		User findByUid(int uid);
	}
