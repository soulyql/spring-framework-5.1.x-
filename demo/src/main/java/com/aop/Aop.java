package com.aop;

import com.aopchain.AdviceChain;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * @author yuanqinglong
 * @since 2021/2/18 9:12
 */
@Aspect
@Component
public class Aop {

	@Pointcut("execution(public * com.controller.TestController.*(..))")
	public void pointCut(){}


	@Before(value = "pointCut()")
	public void before() {
		System.out.println("===前置通知===");
	}

	@Around(value = "pointCut()")
	public void around(ProceedingJoinPoint pjp) throws Throwable{
		System.out.println("===环绕通知--前===");
		pjp.proceed();
		System.out.println("===环绕通知--后===");
	}

	public void around(AdviceChain pjp) throws Throwable{
		System.out.println("===环绕通知--前===");
		pjp.proceed();
		System.out.println("===环绕通知--后===");
	}

	@AfterReturning(value = "pointCut()")
	public void afterReturning() {
		System.out.println("===返回通知===");
	}

	@AfterThrowing(value = "pointCut()")
	public void afterThrowing(JoinPoint joinPoint) {
		System.out.println("[Aspect1] afterThrowing advise");
	}

	@After(value = "pointCut()")
	public void after() {
		System.out.println("===后置通知===");
	}
}
