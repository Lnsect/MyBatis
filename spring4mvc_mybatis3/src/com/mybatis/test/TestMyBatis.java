package com.mybatis.test;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.mybatis.model.Student;
import com.mybatis.service.StudentService;

@RunWith(SpringJUnit4ClassRunner.class) //��ʾ�̳���SpringJUnit4ClassRunner��  
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})  
  
public class TestMyBatis {  

	@Resource  
    private StudentService studentService;  
  
    @Test  
    public void test1() {  
        Student stu =  studentService.getStudentById(1); 
        System.out.println(" the name is " + stu.getName());  
    }  
}  
