package com.wy.shop.dao.entity;

import lombok.Data;

/**
 *
 */
@Data
public class User {

    private Integer id;
    private String name;
    private String nickName;
    private String username;
    private String password;
    private Integer gender;
    private Integer birthday;
    private Integer register_time;
    private Integer last_login_time;
    private String last_login_ip;
    private String mobile;
    private String register_ip;
    private String avatar;
    private String weixin_openid;
    private Integer name_mobile;
    private String city;
    private String province;
    private String country;

}
