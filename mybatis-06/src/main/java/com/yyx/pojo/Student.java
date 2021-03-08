package com.yyx.pojo;

import lombok.Data;

@Data

public class Student {
    private int id;
    private String name;
    private String gender;
    private String birthday;
    //学生需要关联一个老师
    private Teacher teacher;
}
