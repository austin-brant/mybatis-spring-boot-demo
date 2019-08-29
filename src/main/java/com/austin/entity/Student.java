package com.austin.entity;

import lombok.Data;

/**
 * @author Austin
 * @since 2019/8/29 20:21   Thu
 */
@Data
public class Student {

    private int id;
    private String name;
    private String className;
    private int age;
    private Data createTime;
}
