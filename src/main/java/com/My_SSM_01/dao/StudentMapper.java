package com.My_SSM_01.dao;

import com.My_SSM_01.entity.Student;

import java.util.List;

public interface StudentMapper {

    /**
     * 添加学生
     * @param s
     * @return
     */
    Integer insert(Student s);

    /**
     * 查询所有
     * @return
     */
    List<Student> findAll();

    /**
     * 根据学生id查询数据
     * @param studentIds
     * @return
     */
    List<Student> findByStudentIds(List<Integer> studentIds);

}
