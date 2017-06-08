package com.sufow.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.sufow.comm.CommParam;
import com.sufow.comm.CommResult;
import com.sufow.dao.impl.DecadeDao;
import com.sufow.service.GoodsService;

@Service
public class GoodsServiceImpl extends DecadeDao implements GoodsService  {
	
	/***
	 * 查询商品列表
	 */
	public List<Map<String, Object>> queryShopList(CommParam param) {
		// TODO Auto-generated method stub
		return getGoodsDao().queryGoodsList(param);
	}

	/***
	 * 入库
	 */
	public CommResult addGoods(CommParam param) {
		return getGoodsDao().addGoods(param);
	}

	/***
	 * 出库
	 */
	public CommResult reduceGoods(CommParam param) {
		return getGoodsDao().reduceGoods(param);
	}

	

}
