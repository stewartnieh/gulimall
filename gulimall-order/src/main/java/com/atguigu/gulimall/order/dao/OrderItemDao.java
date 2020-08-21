package com.atguigu.gulimall.order.dao;

import com.atguigu.gulimall.order.entity.OrderItemEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单项信息
 * 
 * @author kevinnie
 * @email stewartnieh@gmail.com
 * @date 2020-08-20 18:46:56
 */
@Mapper
public interface OrderItemDao extends BaseMapper<OrderItemEntity> {
	
}
