package com.dhu.gulimall.generator.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.dhu.common.utils.PageUtils;
import com.dhu.gulimall.generator.entity.CategoryEntity;

import java.util.Map;

/**
 * 商品三级分类
 *
 * @author cosmos
 * @email asimpleman.one@gmail.com
 * @date 2022-10-05 15:50:13
 */
public interface CategoryService extends IService<CategoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

