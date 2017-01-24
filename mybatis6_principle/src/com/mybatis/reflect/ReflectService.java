package com.mybatis.reflect;

import java.lang.reflect.Method;

// �������
public class ReflectService {
	 private String name;
	 
	 public void sayHello(String name) {
		 System.err.println("hello, " + name);
	 }
	 public static void main(String[] args) {
		try {
			// ͨ�������ȡ����
			System.out.println(ReflectService.class.getName());
			Class<?> service = Class.forName(ReflectService.class.getName());
			System.out.println(service);
			Method[] methods = service.getDeclaredMethods();
			for(Method m: methods)
				System.out.println(m);
			System.out.println("=== i am separator ===");
			
			Method sayHello = service.getMethod("sayHello", String.class);
			sayHello.invoke(service.newInstance(), "tangrong"); // right one.
			// sayHello.invoke(service, "tangrong"); // not this one.
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
} 