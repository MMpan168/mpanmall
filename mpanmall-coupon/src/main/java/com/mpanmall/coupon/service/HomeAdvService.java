package com.mpanmall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.mpanmall.common.utils.PageUtils;
import com.mpanmall.coupon.entity.HomeAdvEntity;

import java.util.Map;

/**
 * 首页轮播广告
 *
 * @author Mengxi Pan
 * @email mengxipan168@gmail.com
 * @date 2023-10-08 09:36:40
 */
public interface HomeAdvService extends IService<HomeAdvEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

