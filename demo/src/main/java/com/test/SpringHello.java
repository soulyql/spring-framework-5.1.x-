package com.test;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

/**
 * @author yuanqinglong
 * @since 2020/10/28 17:58
 */
@Component
public class SpringHello implements BeanFactoryPostProcessor, BeanPostProcessor {


	public void st(){
		System.out.println("asddsdddddddddddddd");
		System.out.println("哈哈哈大V发现的");
	}

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		BeanDefinition springHello = beanFactory.getBeanDefinition("springHello");
		System.out.println(springHello.getBeanClassName());
	}

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {

		return null;
	}
}
