package com.sufow.action;


import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.sufow.comm.VernaParam;

@Controller
@RequestMapping(value="/home/")
public class LoginAction extends BaseAction {

	 @RequestMapping("index")
	 public ModelAndView index(HttpServletRequest request) { 
	
		 ModelAndView view = new ModelAndView();
		 view.setViewName("index");
		 
		 return view;
		 
	 } 
	 
	 @RequestMapping("login/{type}")
	 public ModelAndView login(HttpServletRequest request,@PathVariable String type) { 
	
		 String username = request.getParameter("username");
		 String password = request.getParameter("password");
		 
		 System.out.println("��¼");
		 ModelAndView view = new ModelAndView();
		 
		 VernaParam param = new VernaParam();
		 param.addAttr("username", username);
		 param.addAttr("password", password);
		 param.addAttr("type", type);
		 
		 getDecadeService().getUserService().queryTheUserInfo(param);
		 
		 //��ѯ�û�
		 List<Map<String,Object>> userList = getDecadeService().getUserService().queryUserList(param);
		 
		 view.addObject("userList", userList);
		 
		 view.setViewName("homepage");
		 
		 return view;
		 
	 } 
	 
	 @RequestMapping("test")
	 @ResponseBody
	 public ModelAndView test(HttpServletRequest request) { 
		 ModelAndView view = new ModelAndView();
		 view.setViewName("homepage");
		 view.addObject("test","sufow");
		 return view;
		 
	 } 
}
