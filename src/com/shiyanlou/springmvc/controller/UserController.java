package com.shiyanlou.springmvc.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.shiyanlou.springmvc.entity.User;

@Controller
public class UserController {

	/**
	 * RequestMapping 用来映射一个请求和请求的方法 value="/register" 表示请求由 register 方法进行处理
	 */
	@RequestMapping("/register")
	public ModelAndView Register(User user) {
		ModelAndView model = new ModelAndView();
		model.addObject("user", user);
//		model.setViewName("redirect:/register1.action");
		model.setViewName("views/success1");
		return model;
	}
	
	
}