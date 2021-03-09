package com.yyx.dao;


import com.yyx.pojo.Teacher;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TeacherMapper {

//获取指定老师的
    Teacher getTeacher(@Param("tid") int id);
}
