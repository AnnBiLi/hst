package com.hs.hst.service;



import com.hs.hst.model.User;

import java.util.List;

/**
 * @Auther:WYL
 * @Date:2021/12/7 - 12 - 07
 * @Time:15:50
 * @version:1.0
 */


public interface UserService {

    String getNameById(int id);

    List<User> acquireAllUser();

    int addUser(User user);

    int delUserByName(String name);

    int delUserByID(int id);

    int updatePwd(int id, String pwd);

    int updatePwdByName(String name, String pwd);


}
