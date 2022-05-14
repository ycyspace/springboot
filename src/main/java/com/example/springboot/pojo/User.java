package com.example.springboot.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private String name;
    private Integer uid;
    private String head_img="";//头像
    private Integer role_id;//用户角色，0普通用户，1管理员
    private Integer age=0;
    private String province="辽宁";
    private String city="大连";
    private String phone_number;//非空
    private Integer gender=0;//性别
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date register_date;//注册时间自动获取
    private String password;//非空
    private List<String> tags=new ArrayList<>();//用户标签
//  private List<>    预留保存用户轨迹
}
