package com.mybatis.main;

import org.junit.Test;

import com.mybatis.proxy.CglibProxy;
import com.mybatis.proxy.JavaProxy;
import com.mybatis.service.*;

public class Main6Proxy {
	
	@Test
	public void testJavaProxy() {
		JavaProxy proxy = new JavaProxy();  
        Hello hello = (Hello)proxy.getProxyInstance(new HelloImpl());
        hello.sayHello("tangrong");
        
        System.out.println("hello.getClass().getName() = " + hello.getClass().getName()); // �����Ǵ������
        System.out.println("=== i am a separator === \n");
        
        UserDao userDao = (UserDao) proxy.getProxyInstance(new UserDaoImpl());  
        userDao.login("tangrong", "123456");  
        System.out.println("userDao.getClass().getName() = " + userDao.getClass().getName()); // �����Ǵ������  
    }  
	
	@Test
	public void testCglibProxy() {
		CglibProxy proxy = new CglibProxy();  
        Hello hello = (Hello)proxy.getProxyInstance(new HelloImpl());
        hello.sayHello("tangrong");
        
        System.out.println("hello.getClass().getName() = " + hello.getClass().getName()); // �����Ǵ������
        System.out.println("=== i am a separator === \n");
        
        UserDao userDao = (UserDao) proxy.getProxyInstance(new UserDaoImpl());  
        userDao.login("tangrong", "123456");  
        System.out.println("userDao.getClass().getName() = " + userDao.getClass().getName()); // �����Ǵ������
        System.out.println("userDao.getClass().getSuperclass().getName() = " 
        		+ userDao.getClass().getSuperclass().getName()); // //����̬����ʵ���ĸ��� 
    }  
}
