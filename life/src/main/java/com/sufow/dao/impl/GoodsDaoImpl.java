package com.sufow.dao.impl;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sufow.comm.CommParam;
import com.sufow.comm.CommResult;
import com.sufow.dao.GoodsDao;

@Service
public class GoodsDaoImpl implements GoodsDao {

	@Autowired
	public SqlSessionFactory sqlSessionFactory;


	/***
	 * 查询商品列表
	 */
	public List<Map<String, Object>> queryGoodsList(CommParam param) {
		List<Map<String, Object>> dataList = sqlSessionFactory.openSession().selectList("MYLIFE.query");

		return dataList;
	}

	/***
	 * 入库
	 */
	public CommResult addGoods(CommParam param) {
		CommResult result = new CommResult();

		int  size = sqlSessionFactory.openSession().update("");
		result.addAttr("updateSize", size);
		return result;
	}

	/***
	 * 出库
	 */
	public CommResult reduceGoods(CommParam param) {
		CommResult result = new CommResult();

		int  size = sqlSessionFactory.openSession().update("");
		result.addAttr("updateSize", size);
		return result;
	}


}
