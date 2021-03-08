package com.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author yuanqinglong
 * @since 2021/2/8 9:36
 */
@Component
public class MyInject  {

	@Autowired
	private MyBean myBean;


}
