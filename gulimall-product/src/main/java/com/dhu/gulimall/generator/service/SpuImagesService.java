package com.dhu.gulimall.generator.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.dhu.common.utils.PageUtils;
import com.dhu.gulimall.generator.entity.SpuImagesEntity;

import java.util.Map;

/**
 * spu图片
 *
 * @author cosmos
 * @email asimpleman.one@gmail.com
 * @date 2022-10-05 15:50:13
 */
public interface SpuImagesService extends IService<SpuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

