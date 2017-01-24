package com.mybatis.objectFactory;

import java.util.List;
import java.util.Properties;
import java.util.logging.Logger;

import org.apache.ibatis.reflection.factory.DefaultObjectFactory;

public class MyObjectFactory extends DefaultObjectFactory{

	private static final long serialVersionUID = -630157777533596671L;
	Logger log = Logger.getLogger(MyObjectFactory.class.getSimpleName());
	
	@Override
	public <T> T create(Class<T> type) {
		log.info("ʹ�ö��ƶ��󹤳��� create ���� ������������.");
		return super.create(type);
	}
	@Override
	public <T> T create(Class<T> type, List<Class<?>> constructorArgTypes, List<Object> constructorArgs) {
		log.info("ʹ�ö��ƶ��󹤳��� create ���� ������������.");
		return super.create(type, constructorArgTypes, constructorArgs);
	}
	@Override
	public void setProperties(Properties properties) {
		log.info("ʹ�ö�������: " + properties);
		super.setProperties(properties);
	}
}
