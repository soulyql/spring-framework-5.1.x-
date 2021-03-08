package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author yuanqinglong
 * @since 2021/2/18 9:15
 */
@RequestMapping("/test")
@Controller
public class TestController{


	@RequestMapping("/test")
	public Object test(){
		System.out.println("执行目标方法...");
		return "zzzzzzz";
	}


}
