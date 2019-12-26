package com.exam.dao;

import java.util.List;

import com.exam.model.UserInfo;

public interface UserInfoDao extends CommonDao<UserInfo>{
	UserInfo loadUserByUsername(String username);
	public UserInfo getUserByEmail(String email, String password);
	public List<UserInfo> getByUsername(String user);
}
