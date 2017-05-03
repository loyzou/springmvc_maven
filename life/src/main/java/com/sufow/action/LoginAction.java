package com.sufow.action;


import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
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
		 
		 System.out.println("µÇÂ¼");
		 ModelAndView view = new ModelAndView();
		 
		 VernaParam param = new VernaParam();
		 param.addAttr("username", username);
		 param.addAttr("password", password);
		 param.addAttr("type", type);
		 
		 getDecadeService().getUserService().queryTheUserInfo(param);
		 
		 view.setViewName("homepage");
		 
		 return view;
		 
	 } 
}
