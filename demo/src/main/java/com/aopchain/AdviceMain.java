package com.aopchain;

import com.controller.TestController;
import com.test.ProxyInterface;

/**
 * @author yuanqinglong
 * @since 2021/2/19 15:41
 */
public class AdviceMain {


	public static void main(String[] args) {
		TestController proxy = new ProxyFactory().getProxy(new TestController());
		proxy.test();

	}
}
