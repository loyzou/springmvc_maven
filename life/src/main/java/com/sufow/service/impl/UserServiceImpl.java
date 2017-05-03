package com.sufow.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.sufow.comm.VernaParam;
import com.sufow.comm.VernaResult;
import com.sufow.dao.impl.DecadeDao;
import com.sufow.service.UserService;

@Service
public class UserServiceImpl extends DecadeDao implements UserService  {
	

	/***
	 * 查询用户列表
	 */
	public List<Map<String, Object>> queryUserList(VernaParam param) {
		return getUserDao().queryUserList();
	}

	/***
	 * 登录查询
	 */
	public VernaResult queryTheUserInfo(VernaParam param) {
		return getUserDao().queryTheUserInfo(param);
	}

}
