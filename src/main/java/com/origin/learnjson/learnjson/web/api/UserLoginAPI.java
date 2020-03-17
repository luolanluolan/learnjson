package com.origin.web.api;

import com.origin.entity.LoginInfoDto;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Api(tags = "登录模块")
public interface UserLoginAPI {
    public final String API_SWAGGERUI ="/swaggerUi";

    @GetMapping(value = API_SWAGGERUI+"/selectUserById/{id}",name = "通过id查询")
    @ResponseBody
    @ApiOperation(value = "通过id查询")
    public LoginInfoDto selectUserById(@PathVariable Integer id) ;
}
