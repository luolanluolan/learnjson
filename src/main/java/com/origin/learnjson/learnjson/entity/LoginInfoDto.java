package com.origin.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class LoginInfoDto implements Serializable {


    private Integer id;
    private String userName;
    private String sex;
    private Integer age;

}
