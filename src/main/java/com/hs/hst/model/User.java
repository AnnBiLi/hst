package com.hs.hst.model;

import lombok.Data;

/**
 * @Auther:WYL
 * @Date:2022/2/9 - 02 - 09
 * @Time:10:52
 * @version:1.0
 */
@Data
public class User {

    private int id;

    private String name;

    private String pwd;

    private String email;
}
