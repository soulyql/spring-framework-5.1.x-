package com.chain;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * @author yuanqinglong
 * @since 2020/10/30 15:25
 */
public class DayConsumeConsumeFilter implements FilterChain {


	protected final Log logger = LogFactory.getLog(getClass());

	@Override
	public boolean doFilter(ConsumeLimitFilterChain consumeLimitFilterChain, UserInfo userInfo, ConsumeConfigInfo configInfo) {
		if (userInfo.getRoleId() == null) {
			return false;
		}
		System.out.println("DayConsumeConsumeFilter判断通过，向下传递。。。");
		return consumeLimitFilterChain.doFilter(consumeLimitFilterChain, userInfo, configInfo);
	}
}
