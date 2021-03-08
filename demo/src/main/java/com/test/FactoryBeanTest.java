package com.test;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

/**
 * @author yuanqinglong
 * @since 2021/2/18 16:15
 */
@Component
public class FactoryBeanTest implements FactoryBean<InstanceFactoryBean> {


	@Override
	public InstanceFactoryBean getObject() throws Exception {
		return new InstanceFactoryBean();
	}

	@Override
	public Class<?> getObjectType() {
		return InstanceFactoryBean.class;
	}

	@Override
	public boolean isSingleton() {
		return true;
	}
}
