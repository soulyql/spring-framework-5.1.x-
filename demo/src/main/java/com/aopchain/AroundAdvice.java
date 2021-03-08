package com.aopchain;

import com.aop.Aop;

import java.lang.reflect.Method;

/**
 * @author yuanqinglong
 * @since 2021/2/19 15:30
 */
public class AroundAdvice implements Advice{


	@Override
	public Object execute(AdviceChain adviceChain) throws Throwable {
		//System.out.println("===环绕通知1===");
		//Object proceed = adviceChain.proceed();
		//System.out.println("===环绕通知2===");
		Method around = Aop.class.getMethod("around",AdviceChain.class);
		return around.invoke(new Aop(),adviceChain);
	}
}
