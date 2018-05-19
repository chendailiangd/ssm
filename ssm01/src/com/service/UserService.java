package com.service;

import com.vo.User;

	public interface UserService {
	    int findAge(int uid);
//		User findByUid(int uid);

		User findByUid(int uid);
	}
