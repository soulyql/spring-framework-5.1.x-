package com.aopchain;

import com.controller.TestController;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 * @author yuanqinglong
 * @since 2021/2/19 16:41
 */
public class ProxyFactory implements MethodInterceptor {

	List<Advice> advices = new ArrayList<>();

	private Object target;

	public ProxyFactory() {
		advices.add(new ThrowAdvice());
		advices.add(new ReturnAdvice());
		advices.add(new AfterAdvice());
		advices.add(new AroundAdvice());
		advices.add(new BeforeAdvice());
	}


	public TestController getProxy(Object target) {
		this.target = target;
		// 创建代理对象
		Enhancer enhancer = new Enhancer();
		enhancer.setClassLoader(target.getClass().getClassLoader());
		enhancer.setCallback(this);
		enhancer.setSuperclass(target.getClass());
		return (TestController)enhancer.create();
	}


	@Override
	public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
		AdviceChain adviceChain = new AdviceChain(advices, method, objects, target);
		return adviceChain.proceed();
	}
}
