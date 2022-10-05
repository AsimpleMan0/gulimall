package com.dhu.gulimall.generator.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.dhu.common.utils.PageUtils;
import com.dhu.gulimall.generator.entity.SpuCommentEntity;

import java.util.Map;

/**
 * 商品评价
 *
 * @author cosmos
 * @email asimpleman.one@gmail.com
 * @date 2022-10-05 15:50:13
 */
public interface SpuCommentService extends IService<SpuCommentEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

