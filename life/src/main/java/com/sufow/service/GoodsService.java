package com.sufow.service;

import java.util.List;
import java.util.Map;

import com.sufow.comm.CommParam;
import com.sufow.comm.CommResult;

public interface GoodsService {
	
	/***
	 * ��ѯ��Ʒ�б�
	 * @return
	 */
	public List<Map<String,Object>> queryShopList(CommParam param);
	
	/***
	 * ���
	 * @param param
	 * @return
	 */
	public CommResult addGoods(CommParam param);
	
	
	/***
	 * ����
	 * @param param
	 * @return
	 */
	public CommResult reduceGoods(CommParam param);
	
}
