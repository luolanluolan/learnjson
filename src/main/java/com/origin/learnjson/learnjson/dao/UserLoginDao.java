package com.origin.dao;

import com.origin.entity.Emp;
import com.origin.entity.LoginInfoDto;
import com.origin.entity.Student;
import com.origin.entity.Teacher;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserLoginDao {
    public LoginInfoDto selectUserById(Integer id);
    public void deleteUserById(Integer id);


    void insertStudent(@Param("s") Student student);

    void insertTeacher(@Param("t") Teacher teacher);

    void insertEmp(@Param("e") Emp emp);
}
