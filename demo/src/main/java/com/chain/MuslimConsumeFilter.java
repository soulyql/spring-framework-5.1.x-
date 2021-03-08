package com.chain;

/**
 * @author yuanqinglong
 * @since 2020/10/30 16:01
 */
public class MuslimConsumeFilter implements FilterChain {


    @Override
    public boolean doFilter(ConsumeLimitFilterChain consumeLimitFilterChain, UserInfo userInfo, ConsumeConfigInfo configInfo) {
        if (userInfo.getUserAge() < 18) {
            return false;
        }
        System.out.println("MuslimConsumeFilter判断通过，向下传递。。。");
        return consumeLimitFilterChain.doFilter(consumeLimitFilterChain, userInfo, configInfo);
    }
}
