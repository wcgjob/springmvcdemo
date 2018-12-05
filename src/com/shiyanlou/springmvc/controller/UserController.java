package com.shiyanlou.springmvc.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.shiyanlou.springmvc.entity.User;

@Controller
public class UserController {

	/**
	 * RequestMapping ����ӳ��һ�����������ķ��� value="/register" ��ʾ������ register �������д���
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