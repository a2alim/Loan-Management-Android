package com.exam.service;


import java.util.List;

import com.exam.model.UserInfo;


public interface UserInfoService extends CommonService<UserInfo> {
    public UserInfo save(UserInfo userInfo);
    public List<UserInfo> getAll(); 
    public List<UserInfo> getByUsername(String user);
}
