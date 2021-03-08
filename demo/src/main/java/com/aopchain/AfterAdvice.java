package com.aopchain;

import com.aop.Aop;

import java.lang.reflect.Method;

/**
 * @author yuanqinglong
 * @since 2021/2/19 15:30
 */
public class AfterAdvice implements Advice {


	@Override
	public Object execute(AdviceChain adviceChain) throws Throwable {

		try {
			return adviceChain.proceed();
		} finally {
			Method before = Aop.class.getMethod("after");
			before.invoke(new Aop());
			//System.out.println("===后置通知===");
		}
	}
}
