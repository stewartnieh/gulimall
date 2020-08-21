package com.atguigu.gulimall.product.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;


/**
 * 品牌
 * 
 * @author kevinnie
 * @email stewartnieh@gmail.com
 * @date 2020-08-20 16:44:37
 */
@Data
@TableName("pms_brand")
public class BrandEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * $column.comments
	 */
	@TableId
	private Long brandId;
	/**
	 * $column.comments
	 */
	private String name;
	/**
	 * $column.comments
	 */
	private String logo;
	/**
	 * $column.comments
	 */
	private String descript;
	/**
	 * $column.comments
	 */
	private Integer showStatus;
	/**
	 * $column.comments
	 */
	private String firstLetter;
	/**
	 * $column.comments
	 */
	private Integer sort;

}
