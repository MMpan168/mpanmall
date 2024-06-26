package com.mpanmall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.mpanmall.common.utils.PageUtils;
import com.mpanmall.product.entity.CategoryEntity;

import java.util.List;
import java.util.Map;

/**
 * 商品三级分类
 *
 * @author Mengxi Pan
 * @email mengxipan168@gmail.com
 * @date 2023-10-01 21:08:48
 */
public interface CategoryService extends IService<CategoryEntity> {

    PageUtils queryPage(Map<String, Object> params);

    List<CategoryEntity> listWithTree();

    void removeMenuByIds(List<Long> asList);


    /**
     * 找到catelogId的完整路径；
     * [父/子/孙]
     * @param catelogId
     * @return
     */
    Long[] findCatelogPath(Long catelogId);

    void updateCascade(CategoryEntity category);

}

