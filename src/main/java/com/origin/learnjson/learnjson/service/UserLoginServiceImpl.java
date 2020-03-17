package com.origin.service;

import com.origin.dao.UserLoginDao;
import com.origin.entity.Emp;
import com.origin.entity.LoginInfoDto;
import com.origin.entity.Student;
import com.origin.entity.Teacher;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserLoginServiceImpl implements UserLoginService{

    @Resource
    private UserLoginDao userLoginDao;

    @Override
    public LoginInfoDto selectUserById(Integer id){
        LoginInfoDto loginInfoDto = userLoginDao.selectUserById(id);
        return loginInfoDto;
    }

    @Override
    public void deleteUserById(Integer id){
        userLoginDao.deleteUserById(id);
    }

    @Override
    public void insertStudent(Student student) {
        userLoginDao.insertStudent(student);
    }

    @Override
    public void insertTeacher(Teacher teacher) {
        userLoginDao.insertTeacher(teacher);
    }

    @Override
    public void insertEmp(Emp emp) {
        userLoginDao.insertEmp(emp);
    }

}
