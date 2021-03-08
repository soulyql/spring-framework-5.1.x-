package com.chain;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yuanqinglong
 * @since 2020/10/30 15:19
 */
public class ConsumeLimitFilterChain {


    private final List<FilterChain> filterChains = new ArrayList<>();

    private int index = -1;

    public ConsumeLimitFilterChain() {
        filterChains.add(new UserTypeConsumeFilter());
        filterChains.add(new DayConsumeConsumeFilter());
        filterChains.add(new MuslimConsumeFilter());
    }


    public void addFilter(FilterChain filterChain) {
        this.filterChains.add(filterChain);
    }


    public boolean doFilter(ConsumeLimitFilterChain consumeLimitFilterChain, UserInfo userInfo, ConsumeConfigInfo configInfo) {
    	if (index == filterChains.size()-1){
			System.out.println("===目标方法===");
			return true;
		}
        return filterChains.get(++index).doFilter(consumeLimitFilterChain, userInfo, configInfo);
    }

}
