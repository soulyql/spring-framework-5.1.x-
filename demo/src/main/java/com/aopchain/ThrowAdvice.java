package com.aopchain;

/**
 * @author yuanqinglong
 * @since 2021/2/19 15:30
 */
public class ThrowAdvice implements Advice {


	@Override
	public Object execute(AdviceChain adviceChain) throws Throwable {
		try {
			return adviceChain.proceed();
		} catch (Exception e) {
			System.out.println("===异常通知===");
			e.printStackTrace();
			//throw e;
		}
		return null;

	}
}
