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
		TranslationController translationController = annotationConfigApplicationContext.getBean(TranslationController.class);
		translationController.test();
	}
}
