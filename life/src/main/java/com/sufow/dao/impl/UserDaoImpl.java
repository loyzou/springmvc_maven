package com.sufow.dao.impl;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sufow.comm.VernaParam;
import com.sufow.comm.CommResult;
import com.sufow.dao.UserDao;

@Service
public class UserDaoImpl implements UserDao {
	
	@Autowired
	public SqlSessionFactory sqlSessionFactory;
	

	/***
	 * 查询用户列表
	 */
	public List<Map<String, Object>> queryUserList() {
		List<Map<String, Object>> dataList = sqlSessionFactory.openSession().selectList("MYLIFE.query");
		
		return dataList;
	}

	/**
	 *查询用户信息
	 */
	public CommResult queryTheUserInfo(VernaParam param) {
		// TODO Auto-generated method stub
		return null;
	}

}
