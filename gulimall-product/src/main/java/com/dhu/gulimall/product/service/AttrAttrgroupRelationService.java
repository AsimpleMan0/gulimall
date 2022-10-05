package com.dhu.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.dhu.common.utils.PageUtils;
import com.dhu.gulimall.product.entity.AttrAttrgroupRelationEntity;

import java.util.Map;

/**
 * 属性&属性分组关联
 *
 * @author cosmos
 * @email asimpleman.one@gmail.com
 * @date 2022-10-05 16:54:20
 */
public interface AttrAttrgroupRelationService extends IService<AttrAttrgroupRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

