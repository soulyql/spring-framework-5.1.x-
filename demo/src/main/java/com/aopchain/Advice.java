package com.aopchain;

/**
 * @author yuanqinglong
 * @since 2021/2/19 15:31
 */
public interface Advice {

	/**
	 *  x
	 * @return x
	 */
	Object execute(AdviceChain adviceChain) throws Throwable;
}
