package com.atguigu.gulimall.member.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 会员等级
 *
 * @author kevinnie
 * @email stewartnieh@gmail.com
 * @date 2020-08-20 18:38:19
 */
@Data
@TableName("ums_member_level")
public class MemberLevelEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * $column.comments
     */
    @TableId
    private Long id;
    /**
     * $column.comments
     */
    private String name;
    /**
     * $column.comments
     */
    private Integer growthPoint;
    /**
     * $column.comments
     */
    private Integer defaultStatus;
    /**
     * $column.comments
     */
    private BigDecimal freeFreightPoint;
    /**
     * $column.comments
     */
    private Integer commentGrowthPoint;
    /**
     * $column.comments
     */
    private Integer priviledgeFreeFreight;
    /**
     * $column.comments
     */
    private Integer priviledgeMemberPrice;
    /**
     * $column.comments
     */
    private Integer priviledgeBirthday;
    /**
     * $column.comments
     */
    private String note;

}
