package com.sufow.service;

import java.util.List;
import java.util.Map;


import com.sufow.comm.VernaParam;
import com.sufow.comm.CommResult;

public interface UserService {
	
	public CommResult queryTheUserInfo(VernaParam param);
	
	/***
	 * ��ѯ�û��б�
	 * @return
	 */
	public List<Map<String,Object>> queryUserList(VernaParam param);
}
