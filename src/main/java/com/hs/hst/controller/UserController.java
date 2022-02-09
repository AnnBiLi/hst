package com.hs.hst.controller;

import com.hs.hst.model.User;
import com.hs.hst.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Auther:WYL
 * @Date:2021/12/7 - 12 - 07
 * @Time:15:49
 * @version:1.0
 */

@RestController
@RequestMapping("api/pri/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/getName")
    public String getUserNameById(int id){
        return userService.getNameById(id);
    }

    @GetMapping("/userList")
    public List<User> acquireAllUser(){
        List<User> users = userService.acquireAllUser();
        return users;
    }

    @PostMapping("/insertUser")
    public int insertUser(@RequestBody User user){
        int i = userService.addUser(user);
        return i;
    }

    @PostMapping("upPwd1")
    public int updatePwd(String name, String pwd){
        int i = userService.updatePwdByName(name, pwd);
        return i;
    }

    @PostMapping("upPwd2")
    public int updatePwd(int id, String pwd){
        int i = userService.updatePwd(id, pwd);
        return i;
    }

    @PostMapping("delUByid")
    public int delUserByID(int id){
        int i = userService.delUserByID(id);
        return i;
    }

    @PostMapping("delUByname")
    public int delUserByName(String name){
        int i = userService.delUserByName(name);
        return i;
    }



}
