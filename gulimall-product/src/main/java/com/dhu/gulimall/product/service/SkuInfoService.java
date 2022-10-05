package com.dhu.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.dhu.common.utils.PageUtils;
import com.dhu.gulimall.product.entity.SkuInfoEntity;

import java.util.Map;

/**
 * sku信息
 *
 * @author cosmos
 * @email asimpleman.one@gmail.com
 * @date 2022-10-05 16:54:20
 */
public interface SkuInfoService extends IService<SkuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

