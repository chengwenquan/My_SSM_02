package com.My_SSM_01.dao;

import com.My_SSM_01.entity.Student;
import com.My_SSM_01.entity.User;
import com.My_SSM_01.service.StudentService;
import com.My_SSM_01.service.UserService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-mybatis.xml"})
public class TestDao {

    @Resource
    public UserService userService;

    @Resource
    public StudentService studentService;

    @Test
    public void test1(){
        User u = new User();
        u.setUserId(15);
        u.setAge(25);
        u.setName("github");
        Assert.assertEquals(userService.insert(u), true);

    }

    @Test
    public void test2(){
        Student student = new Student();
        student.setStudentId(21);
        student.setAge(21);
        student.setName("hehe");
        Assert.assertEquals(studentService.insert(student), true);
    }

    @Test
    public void test3(){
        userService.findAll().stream().forEach(System.out::println);
    }

    @Test
    public void test4(){

    }



}
