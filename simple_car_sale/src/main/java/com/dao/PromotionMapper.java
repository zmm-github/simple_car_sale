package com.dao;

import com.pojo.Promotion;

import java.util.List;
import java.util.Map;

/**
 * @author 阿毛
 * @date 2021/6/8 13:17
 */
public interface PromotionMapper {
    //查询所有促销记录数
    Long selectPromotionCount();

    //查询所有促销数据
    List<Promotion> selectPromotion(Map<String,Integer> map);

    //查询指定促销数据
    Promotion selectPromotionById(Integer id);

    //添加促销数据
    void insertPromotion(Promotion promotion);

    //删除指定促销数据
    void deletePromotionById(Integer id);

    //修改指定促销数据
    void updatePromotionById(Promotion promotion);
}
