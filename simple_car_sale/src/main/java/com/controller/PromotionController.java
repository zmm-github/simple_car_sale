package com.controller;

import com.pojo.Promotion;
import com.service.PromotionServiceImpl;
import com.utils.Pagination;
import com.utils.Util;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author 阿毛
 * @date 2021/6/8 10:54
 */
@Controller
public class PromotionController {
    @Resource
    private PromotionServiceImpl promotionService;

    //创建ModelAndView对象
    ModelAndView mav = new ModelAndView();

    //查询所有促销数据
    @RequestMapping("selectPromotion.do")
    public ModelAndView selectPromotion(String cp) {
        //调用setPagination方法设置pagination
        Pagination pagination = Util.setPagination(cp,promotionService.selectPromotionCount());
        //创建Map,传递参数
        Map<String, Integer> map = new HashMap<>();
        map.put("startRow", (pagination.getCurrPage() - 1) * pagination.getPageRow());
        map.put("pageRow", pagination.getPageRow());
        //调用service，处理业务逻辑,返回处理结果
        List<Promotion> list = promotionService.selectPromotion(map);
        mav.addObject("list", list);
        mav.addObject("pagination",pagination);
        mav.setViewName("information/promotion");
        return mav;
    }

    //查询指定促销数据
    @RequestMapping("selectPromotionById.do")
    public ModelAndView selectPromotionById(Integer id) {
        ModelAndView mav = new ModelAndView();
        //调用service，处理业务逻辑,返回处理结果
        Promotion promotion = promotionService.selectPromotionById(id);
        mav.addObject("promotion", promotion);
        mav.setViewName("information/updatePromotion");
        return mav;
    }

    //添加指定促销数据
    @RequestMapping("insertPromotion.do")
    public String insertPromotion(Promotion promotion) {
        //调用service，处理业务逻辑,返回处理结果
        promotionService.insertPromotion(promotion);
        return "redirect:selectPromotion.do";
    }

    //删除指定促销数据
    @RequestMapping("deletePromotionById.do")
    public String deletePromotionById(Integer id) {
        //调用service，处理业务逻辑,返回处理结果
        promotionService.deletePromotionById(id);
        return "redirect:selectPromotion.do";
    }

    //修改指定促销数据
    @RequestMapping("updatePromotionById.do")
    public String updatePromotionById(Promotion promotion) {
        //调用service，处理业务逻辑,返回处理结果
        promotionService.updatePromotionById(promotion);
        return "redirect:selectPromotion.do";
    }
}
