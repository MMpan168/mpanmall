//package com.mpanmall.product.controller;
//
//import java.util.Arrays;
//import java.util.Map;
//
//import com.mpanmall.product.vo.SpuSaveVo;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.mpanmall.product.entity.SpuInfoEntity;
//import com.mpanmall.product.service.SpuInfoService;
//import com.mpanmall.common.utils.PageUtils;
//import com.mpanmall.common.utils.R;
//
//
//
///**
// * spu信息
// *
// * @author Mengxi Pan
// * @email mengxipan168@gmail.com
// * @date 2023-10-01 22:50:32
// */
//@RestController
//@RequestMapping("product/spuinfo")
//public class SpuInfoController {
//    @Autowired
//    private SpuInfoService spuInfoService;
//
//    /**
//     * 列表
//     */
//    @RequestMapping("/list")
//    //@RequiresPermissions("product:spuinfo:list")
//    public R list(@RequestParam Map<String, Object> params){
//        PageUtils page = spuInfoService.queryPageByCondition(params);
//
//        return R.ok().put("page", page);
//    }
//
//
//    /**
//     * 信息
//     */
//    @RequestMapping("/info/{id}")
//    //@RequiresPermissions("product:spuinfo:info")
//    public R info(@PathVariable("id") Long id){
//		SpuInfoEntity spuInfo = spuInfoService.getById(id);
//
//        return R.ok().put("spuInfo", spuInfo);
//    }
//
//    /**
//     * 保存
//     */
//    @RequestMapping("/save")
//    //@RequiresPermissions("product:spuinfo:save")
//    public R save(@RequestBody SpuSaveVo vo){
//		//spuInfoService.save(spuInfo);
//
//        spuInfoService.saveSpuInfo(vo);
//
//        return R.ok();
//    }
//
//    /**
//     * 修改
//     */
//    @RequestMapping("/update")
//    //@RequiresPermissions("product:spuinfo:update")
//    public R update(@RequestBody SpuInfoEntity spuInfo){
//		spuInfoService.updateById(spuInfo);
//
//        return R.ok();
//    }
//
//    /**
//     * 删除
//     */
//    @RequestMapping("/delete")
//    //@RequiresPermissions("product:spuinfo:delete")
//    public R delete(@RequestBody Long[] ids){
//		spuInfoService.removeByIds(Arrays.asList(ids));
//
//        return R.ok();
//    }
//
//}
