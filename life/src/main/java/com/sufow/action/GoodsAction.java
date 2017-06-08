package com.sufow.action;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sufow.comm.CommParam;
import com.sufow.comm.CommResult;

/***
 * ��Ʒ���
 * @author sty
 *
 */
@Controller()
@RequestMapping("/account/goods/")
public class GoodsAction extends BaseAction {

	/***
	 * ��Ʒ�б�
	 * @param request
	 * @return
	 */
	@RequestMapping("getGoodsList")
	@ResponseBody
	public CommResult getGoodsList(HttpServletRequest request){
		CommResult result = new CommResult();
		CommParam param = new CommParam();

		List<Map<String, Object>> goodsList = this.getDecadeService().getGoodsService().queryShopList(param);
		result.addAttr("goodsList", goodsList);
		return result;
	}


	/***
	 * ��Ʒ���
	 * @param request
	 * @return
	 */
	public CommResult addGoods(HttpServletRequest request){
		CommResult result = new CommResult();
		CommParam param = new CommParam();

		String goodsBigName = request.getParameter("goodsBigName");//��Ʒ����
		String goodsName = request.getParameter("goodsName");//��Ʒ����
		String nums = request.getParameter("goodsName");//��Ʒ����
		String unit = request.getParameter("goodsName");//��Ʒ��λ
		String inPerson = request.getParameter("goodsName");//�����

		param.addAttr("goodsBigName", goodsBigName);
		param.addAttr("goodsName", goodsName);
		param.addAttr("nums", nums);
		param.addAttr("unit", unit);
		param.addAttr("inPerson", inPerson);
		
		this.getDecadeService().getGoodsService().addGoods(param);
		
		
		
		return result;
	}


	/***
	 * ��Ʒ����
	 * @param request
	 * @return
	 */
	public CommResult removeGoods(HttpServletRequest request){
		CommResult result = new CommResult();
		CommParam param = new CommParam();

		String goodsId = request.getParameter("goodsId");//��Ʒid
		String nums = request.getParameter("goodsName");//��Ʒ����
		String outPerson = request.getParameter("goodsName");//������

		param.addAttr("goodsId", goodsId);
		param.addAttr("nums", nums);
		param.addAttr("outPerson", outPerson);

		this.getDecadeService().getGoodsService().reduceGoods(param);

		return result;
	}
}
