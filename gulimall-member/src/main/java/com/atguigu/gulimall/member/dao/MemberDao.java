package com.atguigu.gulimall.member.dao;

import com.atguigu.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 *
 * @author kevinnie
 * @email stewartnieh@gmail.com
 * @date 2020-08-20 18:38:19
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {

}
