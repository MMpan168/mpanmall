package com.mpanmall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.mpanmall.common.utils.PageUtils;
import com.mpanmall.coupon.entity.SkuLadderEntity;

import java.util.Map;

/**
 * 商品阶梯价格
 *
 * @author Mengxi Pan
 * @email mengxipan168@gmail.com
 * @date 2023-10-08 09:36:40
 */
public interface SkuLadderService extends IService<SkuLadderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

