package com.sufow.dao;

import java.util.List;
import java.util.Map;

import com.sufow.comm.VernaParam;
import com.sufow.comm.VernaResult;

public interface UserDao {

	/**
	 * 查询用户列表
	 * @return
	 */
	public List<Map<String,Object>> queryUserList();
	
	/***
	 * 查询用户信息
	 * @param param
	 * @return
	 */
	public VernaResult queryTheUserInfo(VernaParam param);
}
