package com.zy.test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class MapperProxy implements InvocationHandler{

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("ͨ���ӿ���method��ȡ��Ӧ�������ļ��е���Ϣ:");
		System.out.println("�ӿ�����.������==namespace.id");
		System.out.println("ͨ�������ļ��е���Ϣ��ȡSQL��������");
		System.out.println("����SQL������͵���sqlSession��Ӧ����ɾ�Ĳ鷽��");
		System.out.println("��SQL��������ǲ�ѯʱ:");
		System.out.println("���ݷ���ֵ��������List,Map,Object");
		System.out.println("�ֱ����selectList,selectMap,selectOne����");
		
		//���ز�ѯ���Ľ��
		List<Object> list = new ArrayList<>();
		list.add("1");
		list.add("2");
		list.add("3");
		
		return list;
	}

	
}
