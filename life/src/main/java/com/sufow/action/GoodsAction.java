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
 * 商品相关
 * @author sty
 *
 */
@Controller()
@RequestMapping("/account/goods/")
public class GoodsAction extends BaseAction {

	/***
	 * 商品列表
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
	 * 商品入库
	 * @param request
	 * @return
	 */
	public CommResult addGoods(HttpServletRequest request){
		CommResult result = new CommResult();
		CommParam param = new CommParam();

		String goodsBigName = request.getParameter("goodsBigName");//商品大类
		String goodsName = request.getParameter("goodsName");//商品名称
		String nums = request.getParameter("goodsName");//商品数量
		String unit = request.getParameter("goodsName");//商品单位
		String inPerson = request.getParameter("goodsName");//入库人

		param.addAttr("goodsBigName", goodsBigName);
		param.addAttr("goodsName", goodsName);
		param.addAttr("nums", nums);
		param.addAttr("unit", unit);
		param.addAttr("inPerson", inPerson);
		
		this.getDecadeService().getGoodsService().addGoods(param);
		
		
		
		return result;
	}


	/***
	 * 商品出库
	 * @param request
	 * @return
	 */
	public CommResult removeGoods(HttpServletRequest request){
		CommResult result = new CommResult();
		CommParam param = new CommParam();

		String goodsId = request.getParameter("goodsId");//商品id
		String nums = request.getParameter("goodsName");//商品数量
		String outPerson = request.getParameter("goodsName");//出库人

		param.addAttr("goodsId", goodsId);
		param.addAttr("nums", nums);
		param.addAttr("outPerson", outPerson);

		this.getDecadeService().getGoodsService().reduceGoods(param);

		return result;
	}
}
