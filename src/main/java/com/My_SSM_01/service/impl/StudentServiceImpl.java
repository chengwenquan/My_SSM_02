package com.My_SSM_01.service.impl;

import com.My_SSM_01.dao.StudentMapper;
import com.My_SSM_01.entity.Student;
import com.My_SSM_01.service.StudentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class StudentServiceImpl implements StudentService {

    @Resource
    public StudentMapper studentMapper;

    public boolean insert(Student student) {
        return studentMapper.insert(student) > 0 ? true : false;
    }
}
