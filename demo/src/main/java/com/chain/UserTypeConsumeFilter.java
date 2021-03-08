package com.chain;

/**
 * @author yuanqinglong
 * @since 2020/10/30 15:24
 */
public class UserTypeConsumeFilter implements FilterChain{


	@Override
	public boolean doFilter(ConsumeLimitFilterChain consumeLimitFilterChain, UserInfo userInfo, ConsumeConfigInfo configInfo) {
		if (userInfo.getUserId() == null) {
			return false;
		}
		System.out.println("UserTypeConsumeFilter判断通过，向下传递。。。");
		return consumeLimitFilterChain.doFilter(consumeLimitFilterChain, userInfo, configInfo);
	}
}
