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
	 * ��ѯ��Ʒ�б�
	 */
	public List<Map<String, Object>> queryShopList(CommParam param) {
		// TODO Auto-generated method stub
		return getGoodsDao().queryGoodsList(param);
	}

	/***
	 * ���
	 */
	public CommResult addGoods(CommParam param) {
		return getGoodsDao().addGoods(param);
	}

	/***
	 * ����
	 */
	public CommResult reduceGoods(CommParam param) {
		return getGoodsDao().reduceGoods(param);
	}

	

}
