package com.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author yuanqinglong
 * @since 2021/2/8 9:35
 */
@Component
public class MyBean {

	@Autowired
	private MyInject myInject;
}
