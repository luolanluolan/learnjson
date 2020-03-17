package com.origin.service;

import com.origin.entity.Emp;
import com.origin.entity.LoginInfoDto;
import com.origin.entity.Student;
import com.origin.entity.Teacher;

public interface UserLoginService {
    public LoginInfoDto selectUserById(Integer id);
    public void deleteUserById(Integer id);


    public void insertStudent(Student student);

    public void insertTeacher(Teacher teacher);

    public void insertEmp(Emp emp);

}
