package com.example.springboot.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
@Data
@AllArgsConstructor
public class UserBo {
    private Integer role_id;
    private String password;
    private String name;
    private String phone_number;//非空
}
