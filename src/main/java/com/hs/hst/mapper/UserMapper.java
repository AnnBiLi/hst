package com.hs.hst.mapper;


import com.hs.hst.model.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Auther:WYL
 * @Date:2021/12/7 - 12 - 07
 * @Time:15:48
 * @version:1.0
 */
@Repository
public interface UserMapper {

    String getNameByID(@Param("id")int id);

    int getIDByName(String name);

    User getUserByName(String name);

    User getUserByID(int id);

    List<User> acquireAllUser();

    int insertUser(User user);

    int delUser(int id);

    int updatePwd(int id, String pwd);

    int updatePwdByName(String name, String pwd);

}
