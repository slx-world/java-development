package com.itheima.mp.domain.po;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

/**
* 用户表
*/
@Data
@TableName("user")
public class User {
    /**
    * 用户id
    */
    @TableId
    private Long id;
    /**
    * 用户名
    */
    private String username;
    /**
    * 密码
    */
    private String password;
    /**
    * 注册手机号
    */
    private String phone;
    /**
    * 详细信息
    */
    private String info;
    /**
    * 使用状态（1正常 2冻结）
    */
    private Integer status;
    /**
    * 账户余额
    */
    private Integer balance;
    /**
    * 创建时间
    */
    private Date createTime;
    /**
    * 更新时间
    */
    private Date updateTime;
}
