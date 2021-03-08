package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author yuanqinglong
 * @since 2021/2/18 9:15
 */
@Controller
public class TranslationController {


	@Transactional(rollbackFor = Exception.class)
	@RequestMapping("/test")
	public Object test() {
		System.out.println("事务目标方法...");
		return "zzzzzzz";
	}


}
