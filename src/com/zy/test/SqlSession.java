package com.zy.test;

import java.lang.reflect.Proxy;

public class SqlSession {
	@SuppressWarnings("unchecked")
	public <T> T  getMapper(Class<T> type){
		System.out.println("ͨ���ӿڵ�Class�Ӵ�����Mapȡ����Ӧ�Ĵ�����");
		System.out.println("ͨ��������ʵ����һ��������");
		System.out.println("���������������һ������ʵ�����س�ȥ");
		return (T) Proxy.newProxyInstance(type.getClassLoader(), new Class[]{type}, new MapperProxy());
	}
}
