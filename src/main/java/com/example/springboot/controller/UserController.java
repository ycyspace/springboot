package com.example.springboot.controller;

import com.example.springboot.config.Status;
import com.example.springboot.pojo.User;
import com.example.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController//@RestController(Spring4+)相当于@Controller + @ResponseBody，返回json或者xml格式数据
public class UserController {
    @Autowired
    UserService userService;
    @GetMapping("/userList")
    public List<User> queryUserList(){
        return userService.getUserList();
    }
    @PostMapping("/login")
    public Status login(@RequestBody User user){
        return userService.login(user);
    }
    @RequestMapping("/profile")
    public User queryUserById(@RequestParam String phone_number){return userService.getProfile(phone_number);}
    @PostMapping("/regist")
    public Status regist(@RequestBody User user){
        return userService.regist(user);
    }
}
