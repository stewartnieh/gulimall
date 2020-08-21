package com.atguigu.gulimall.member.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 会员登录记录
 *
 * @author kevinnie
 * @email stewartnieh@gmail.com
 * @date 2020-08-20 18:38:19
 */
@Data
@TableName("ums_member_login_log")
public class MemberLoginLogEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * $column.comments
     */
    @TableId
    private Long id;
    /**
     * $column.comments
     */
    private Long memberId;
    /**
     * $column.comments
     */
    private Date createTime;
    /**
     * $column.comments
     */
    private String ip;
    /**
     * $column.comments
     */
    private String city;
    /**
     * $column.comments
     */
    private Integer loginType;

}
