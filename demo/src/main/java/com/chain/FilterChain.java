package com.chain;

/**
 * @author yuanqinglong
 * @since 2020/10/30 15:18
 */
public interface FilterChain {

	boolean doFilter(ConsumeLimitFilterChain consumeLimitFilterChain, UserInfo userInfo, ConsumeConfigInfo configInfo);

}
