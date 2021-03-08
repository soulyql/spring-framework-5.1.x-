package com.aopchain;

import com.aop.Aop;

/**
 * @author yuanqinglong
 * @since 2021/2/19 15:30
 */
public class ReturnAdvice implements Advice {


	@Override
	public Object execute(AdviceChain adviceChain) throws Throwable {

		Object proceed = adviceChain.proceed();
		Aop.class.getMethod("afterReturning").invoke(new Aop());
		return proceed;
	}
}
