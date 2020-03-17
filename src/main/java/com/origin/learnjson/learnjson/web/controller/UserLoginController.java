package com.origin.web.controller;

import com.alibaba.fastjson.JSON;
import com.origin.entity.Emp;
import com.origin.entity.LoginInfoDto;
import com.origin.entity.ProposalInfoUtil;
import com.origin.service.UserLoginService;
import com.origin.web.api.UserLoginAPI;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class UserLoginController implements UserLoginAPI {

    @Resource
    private UserLoginService userLoginService;

    public LoginInfoDto selectUserById(Integer id){
        LoginInfoDto loginInfoDto = userLoginService.selectUserById(id);
        return loginInfoDto;
    }

    @GetMapping(value = API_SWAGGERUI+"/deleteUserById/{id}",name = "通过id删除1")
    @ResponseBody
    @ApiOperation(value = "通过id删除")
    public void deleteUserById(@PathVariable Integer id){
       userLoginService.deleteUserById(id);
    }


    @GetMapping(value = API_SWAGGERUI+"/jsonToObject/{jsonString}",name = "json转对象")
    @ResponseBody
    @ApiOperation(value = "JSON转对象")
    public void jsonToObject(@PathVariable String jsonString){
        ProposalInfoUtil o = JSON.parseObject(jsonString,ProposalInfoUtil.class);
        System.out.println(o.getItemList().gettName());
        System.out.println(o.getKindList());
        userLoginService.insertStudent(o.getKindList());
        userLoginService.insertTeacher(o.getItemList());

        List<Emp> a = o.getEmpList();
        System.out.println(a.get(0).geteName()+"---"+a.get(0).geteSex());
        System.out.println(a.get(1).geteName()+"---"+a.get(1).geteSex());
        for (int i = 0; i < a.size(); i++) {
            userLoginService.insertEmp(a.get(i));
        }

    }
}
