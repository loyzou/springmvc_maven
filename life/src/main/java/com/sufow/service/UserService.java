package com.sufow.service;

import java.util.List;
import java.util.Map;


import com.sufow.comm.VernaParam;
import com.sufow.comm.VernaResult;

public interface UserService {
	
	public VernaResult queryTheUserInfo(VernaParam param);
	
	/***
	 * ��ѯ�û��б�
	 * @return
	 */
	public List<Map<String,Object>> queryUserList(VernaParam param);
}
