package com.test;

import com.controller.TranslationController;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author yuanqinglong
 * @since 2020/10/28 17:59
 */
public class TestMain {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext annotationConfigApplicationContext
				= new AnnotationConfigApplicationContext(TestConfig.class);
		//TestController bean = annotationConfigApplicationContext.getBean(TestController.class);
		//ProxyInterface bean1 = annotationConfigApplicationContext.getBean(ProxyInterface.class);
		TranslationController translationController = annotationConfigApplicationContext.getBean(TranslationController.class);
		translationController.test();
		//bean1.index();
		//bean.test();
	}
}
