package com.example.springboot.service;

import com.example.springboot.config.Status;
import com.example.springboot.mapper.UserMapper;
import com.example.springboot.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserMapper userMapper;
    public Status login(User user){
        //登录逻辑函数
        Status status;
        try{
            User userExistN = userMapper.findByPhoneNumber(user.getPhone_number());
            if(userExistN!=null){
                String userExistP = userMapper.findPswByPhoneNumber(user.getPhone_number());
                if(userExistP.equals(user.getPassword())){
                    status=new Status(userExistN.getName()+"欢迎登录",0);
                    return status;
                }else {
                    status=new Status("密码错误，请重新输入",1);
                    return status;
                }
            }else {
                status=new Status("用户不存在，请先注册",2);
                return status;
            }
        }catch (Exception e){
            e.printStackTrace();
            status=new Status(e.getMessage(),3);
            return status;
        }
    }
    public Status regist(User user){
        //注册逻辑函数
        Status status;
        try {
            User userExist = userMapper.findByPhoneNumber(user.getPhone_number());
            if (user.getPhone_number().equals("")){
                status=new Status("手机号不能为空",1);
                return status;
            }else if (user.getPassword().equals("")){
                status=new Status("密码不能为空",2);
                return status;
            }else if (userExist!=null){
                status=new Status("账号已经存在",3);
                return status;
            }else{
                status=new Status("注册成功",0);
                userMapper.addUser(user);
                return status;
            }
        }catch (Exception e){
            e.printStackTrace();
            status=new Status(e.getMessage(),4);
            return status;
        }

    }
    public User getProfile(String phone_number){
        return userMapper.findByPhoneNumber(phone_number);
    }
    public List<User> getUserList(){return userMapper.queryUserList();}

}
