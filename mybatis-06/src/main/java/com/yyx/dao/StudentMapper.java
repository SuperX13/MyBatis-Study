package com.yyx.dao;

import com.yyx.pojo.Student;
import com.yyx.pojo.Teacher;

import java.util.List;

public interface StudentMapper {
    public List<Student> getStudent();
    public List<Student> getStudent2();
    public List<Teacher> getTeacher();
}
