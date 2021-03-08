package com.chain;


import org.springframework.core.io.Resource;

/**
 * 责任链
 * @author yuanqinglong
 * @since 2020/10/30 15:27
 */
public class TestChain {

    public static void main(String[] args) {

        UserInfo userInfo = Builder.of(UserInfo::new).with(UserInfo::setUserId, 1).with(UserInfo::setRoleId, 1)
                                                     .with(UserInfo::setUserAge,18).build();
        // 构造消费限制过滤器链条
        ConsumeLimitFilterChain filterChain = new ConsumeLimitFilterChain();
		System.out.println(filterChain.toString().length());
        boolean checkResult = filterChain.doFilter(filterChain, userInfo, new ConsumeConfigInfo());
        System.out.println("校验结果："+checkResult);
    }

}
