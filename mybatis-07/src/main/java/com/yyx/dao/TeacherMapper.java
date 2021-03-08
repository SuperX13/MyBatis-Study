package com.yyx.dao;


import org.apache.ibatis.annotations.Param;
import com.yyx.pojo.Teacher;

public interface TeacherMapper {

//    获取指定老师下所有学生信息
    Teacher getTeacher(@Param("tid") int id);
}
