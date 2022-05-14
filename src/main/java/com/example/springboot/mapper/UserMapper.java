package com.example.springboot.mapper;

import com.example.springboot.config.Status;
import com.example.springboot.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;


@Mapper//表示本类是mybatis的类
@Repository//该注解的作用不只是将类识别为Bean，同时它还能将所标注的类中抛出的数据访问异常封装为 Spring 的数据访问异常类型。
public interface UserMapper {
    List<User> queryUserList();


    int addUser(User user);

    Status updateUser(User user);

    User findByPhoneNumber(String phone_number);

    Status deleteUser(String phone_number);

    String findPswByPhoneNumber(String phone_number);

}
