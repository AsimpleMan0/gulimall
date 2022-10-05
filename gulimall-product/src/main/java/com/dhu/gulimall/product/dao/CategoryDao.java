package com.dhu.gulimall.product.dao;

import com.dhu.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author cosmos
 * @email asimpleman.one@gmail.com
 * @date 2022-10-05 15:50:13
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
