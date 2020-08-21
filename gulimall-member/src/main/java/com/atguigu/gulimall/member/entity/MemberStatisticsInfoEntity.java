package com.atguigu.gulimall.member.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 会员统计信息
 *
 * @author kevinnie
 * @email stewartnieh@gmail.com
 * @date 2020-08-20 18:38:19
 */
@Data
@TableName("ums_member_statistics_info")
public class MemberStatisticsInfoEntity implements Serializable {
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
    private BigDecimal consumeAmount;
    /**
     * $column.comments
     */
    private BigDecimal couponAmount;
    /**
     * $column.comments
     */
    private Integer orderCount;
    /**
     * $column.comments
     */
    private Integer couponCount;
    /**
     * $column.comments
     */
    private Integer commentCount;
    /**
     * $column.comments
     */
    private Integer returnOrderCount;
    /**
     * $column.comments
     */
    private Integer loginCount;
    /**
     * $column.comments
     */
    private Integer attendCount;
    /**
     * $column.comments
     */
    private Integer fansCount;
    /**
     * $column.comments
     */
    private Integer collectProductCount;
    /**
     * $column.comments
     */
    private Integer collectSubjectCount;
    /**
     * $column.comments
     */
    private Integer collectCommentCount;
    /**
     * $column.comments
     */
    private Integer inviteFriendCount;

}
