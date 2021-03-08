package com.aopchain;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;

/**
 * @author yuanqinglong
 * @since 2021/2/19 15:32
 */
public class AdviceChain {


	List<Advice> advices;

	Method method;

	Object[] args;

	Object target;

	int index = -1;

	public AdviceChain(List<Advice> advices, Method method, Object[] args, Object target) {
		this.method = method;
		this.args = args;
		this.target = target;
		this.advices = advices;
	}


	public Object proceed() throws Throwable {
		if (index == advices.size() - 1) {
			// 调用目标方法
			return method.invoke(target, args);
		}
		return advices.get(++index).execute(this);

	}


}
