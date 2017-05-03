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
	 * ��ѯ�û��б�
	 */
	public List<Map<String, Object>> queryUserList(VernaParam param) {
		return getUserDao().queryUserList();
	}

	/***
	 * ��¼��ѯ
	 */
	public VernaResult queryTheUserInfo(VernaParam param) {
		return getUserDao().queryTheUserInfo(param);
	}

}
