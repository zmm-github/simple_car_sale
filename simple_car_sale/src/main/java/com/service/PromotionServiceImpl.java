package com.service;

import com.dao.PromotionMapper;
import com.pojo.Promotion;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * @author 阿毛
 * @date 2021/6/8 13:20
 */
@Service
public class PromotionServiceImpl implements PromotionService {
    @Resource
    private PromotionMapper promotionMapper;

    @Override
    public Long selectPromotionCount() {
        return promotionMapper.selectPromotionCount();
    }

    @Override //查询所有促销数据
    public List<Promotion> selectPromotion(Map<String,Integer> map) {
        return promotionMapper.selectPromotion(map);
    }

    @Override //查询指定促销数据
    public Promotion selectPromotionById(Integer id) {
        return promotionMapper.selectPromotionById(id);
    }

    @Override //添加促销数据
    public void insertPromotion(Promotion promotion) {
        promotionMapper.insertPromotion(promotion);
    }

    @Override //删除指定促销数据
    public void deletePromotionById(Integer id) {
        promotionMapper.deletePromotionById(id);
    }

    @Override //修改指定促销数据
    public void updatePromotionById(Promotion promotion) {
        promotionMapper.updatePromotionById(promotion);
    }
}
