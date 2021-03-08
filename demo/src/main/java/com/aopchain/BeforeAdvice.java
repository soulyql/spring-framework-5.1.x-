package com.aopchain;

import com.aop.Aop;

import java.lang.reflect.Method;

/**
 * @author yuanqinglong
 * @since 2021/2/19 15:30
 */
public class BeforeAdvice implements Advice{


	@Override
	public Object execute(AdviceChain adviceChain) throws Throwable {
		Method before = Aop.class.getMethod("before");
		before.invoke(new Aop());
		return adviceChain.proceed();
	}
}
