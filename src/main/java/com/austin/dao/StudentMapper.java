package com.austin.dao;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.austin.entity.Student;

/**
 * @author Austin
 * @since 2019/8/29 20:26   Thu
 */
@Mapper
public interface StudentMapper {

    @Insert("insert into tbl_student(name, class_name, age) values (#{name}, #{className}, #{age})")
    void insert(@Param("name") String name, @Param("className") String className, @Param("age") int age);

    @Select("select * from tbl_student")
    List<Student> findAllStudent();
}
