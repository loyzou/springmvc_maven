package com.sufow.dao;

import java.util.List;
import java.util.Map;

import com.sufow.comm.VernaParam;
import com.sufow.comm.VernaResult;

public interface UserDao {

	/**
	 * ��ѯ�û��б�
	 * @return
	 */
	public List<Map<String,Object>> queryUserList();
	
	/***
	 * ��ѯ�û���Ϣ
	 * @param param
	 * @return
	 */
	public VernaResult queryTheUserInfo(VernaParam param);
}
