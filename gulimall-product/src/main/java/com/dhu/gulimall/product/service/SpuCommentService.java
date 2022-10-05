package com.dhu.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.dhu.common.utils.PageUtils;
import com.dhu.gulimall.product.entity.SpuCommentEntity;

import java.util.Map;

/**
 * 商品评价
 *
 * @author cosmos
 * @email asimpleman.one@gmail.com
 * @date 2022-10-05 16:54:20
 */
public interface SpuCommentService extends IService<SpuCommentEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

