package com.hs.hst.service.impl;


import com.hs.hst.mapper.UserMapper;
import com.hs.hst.model.User;
import com.hs.hst.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Auther:WYL
 * @Date:2021/12/7 - 12 - 07
 * @Time:15:50
 * @version:1.0
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public String getNameById(int id) {
        return userMapper.getNameByID(id);
    }

    @Override
    public List<User> acquireAllUser() {
       return userMapper.acquireAllUser();
    }

    @Override
    public int addUser(User user) {
        User u = userMapper.getUserByID(user.getId());
        if (u == null){
            return userMapper.insertUser(user);
        }
        return 0;
    }

    @Override
    public int delUserByName(String name) {
        User u = userMapper.getUserByName(name);
        if (u != null && u.getName().equals(name)){
            int i = userMapper.delUser(u.getId());
            return i;
        }
        return 0;
    }

    @Override
    public int delUserByID(int id) {
        User user = userMapper.getUserByID(id);
        if (user!=null && user.getId() == id){
            return userMapper.delUser(id);
        }
        return 0;
    }

    @Override
    public int updatePwd(int id, String pwd) {
        User user = userMapper.getUserByID(id);
        if (user!=null && user.getId() == id){
            return userMapper.updatePwd(id, pwd);
        }
        return 0;
    }

    @Override
    public int updatePwdByName(String name, String pwd) {
        User user = userMapper.getUserByName(name);
        if (user!= null && user.getName().equals(name)){
            return userMapper.updatePwdByName(name,pwd);
        }
        return 0;
    }
}
