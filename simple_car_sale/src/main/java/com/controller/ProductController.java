package com.controller;

import com.pojo.Accessory;
import com.pojo.CarModels;
import com.pojo.CarSeries;
import com.service.ProductServiceImpl;
import com.utils.Pagination;
import com.utils.Util;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author 阿毛
 * @date 2021/6/1 18:58
 */
@Controller
public class ProductController {
    @Resource
    private ProductServiceImpl productService;
    //创建ModelAndView对象
    ModelAndView mav = new ModelAndView();

    //查询所有车系数据
    @RequestMapping("selectCarSeries.do")
    public ModelAndView selectCarSeries(String cp) {
        //调用setPagination方法设置pagination
        Pagination pagination = Util.setPagination(cp, productService.selectCarSeriesCount());
        //创建Map,传递参数
        Map<String, Integer> map = new HashMap<>();
        map.put("startRow", (pagination.getCurrPage() - 1) * pagination.getPageRow());
        map.put("pageRow", pagination.getPageRow());
        //调用service，处理业务逻辑,返回处理结果
        List<CarSeries> list = productService.selectCarSeries(map);
        mav.addObject("list", list);
        mav.addObject("pagination", pagination);
        mav.setViewName("product/car_series");
        return mav;
    }

    //查询指定车系数据
    @RequestMapping("selectCarSeriesById.do")
    public ModelAndView selectCarSeriesById(Integer id) {
        //调用service，处理业务逻辑,返回处理结果
        CarSeries carSeries = productService.selectCarSeriesById(id);
        mav.addObject("carSeries", carSeries);
        mav.setViewName("product/updateCarSeries");
        return mav;
    }

    //模糊查询车系数据
    @RequestMapping("selectCarSeriesByLike.do")
    public ModelAndView selectCarSeriesByLike(HttpServletRequest request, String cp) {
        String searchName = request.getParameter("searchName");
        System.out.println(searchName);
        //调用setPagination方法设置pagination
        Pagination pagination = Util.setPagination(cp, productService.selectCarSeriesCount());
        //创建Map,传递参数
        Map<String, Object> map = new HashMap<>();
        map.put("startRow", (pagination.getCurrPage() - 1) * pagination.getPageRow());
        map.put("pageRow", pagination.getPageRow());
        map.put("searchName", "%" + searchName + "%");
        //调用service，处理业务逻辑,返回处理结果
        List<CarSeries> list = productService.selectCarSeriesByLike(map);
        mav.addObject("pagination", pagination);
        mav.addObject("list", list);
        mav.setViewName("product/car_series");
        return mav;
    }

    //添加指定车系数据
    @RequestMapping("insertCarSeries.do")
    public String insertCarSeries(CarSeries carSeries) {
        System.out.println("sfs");
        //调用service，处理业务逻辑,返回处理结果
        productService.insertCarSeries(carSeries);
        return "redirect:selectCarSeries.do";
    }

    //删除指定车系数据
    @RequestMapping("deleteCarSeriesById.do")
    public String deleteCarSeriesById(Integer id) {
        //调用service，处理业务逻辑,返回处理结果
        productService.deleteCarSeriesById(id);
        return "redirect:selectCarSeries.do";
    }

    //修改指定车系数据
    @RequestMapping("updateCarSeriesById.do")
    public String updateCarSeriesById(CarSeries carSeries) {
        //调用service，处理业务逻辑,返回处理结果
        productService.updateCarSeriesById(carSeries);
        System.out.println("sf");
        return "redirect:selectCarSeries.do";
    }

    //查询所有车型数据
    @RequestMapping("selectCarModels.do")
    public ModelAndView selectCarModels(String cp) {
        //调用setPagination方法设置pagination
        Pagination pagination = Util.setPagination(cp, productService.selectCarModelsCount());
        //创建Map,传递参数
        Map<String, Integer> map = new HashMap<>();
        map.put("startRow", (pagination.getCurrPage() - 1) * pagination.getPageRow());
        map.put("pageRow", pagination.getPageRow());
        //调用service，处理业务逻辑,返回处理结果
        List<CarModels> list = productService.selectCarModels(map);
        mav.addObject("list", list);
        mav.addObject("pagination", pagination);
        mav.setViewName("product/car_models");
        return mav;
    }

    //查询指定车型数据
    @RequestMapping("selectCarModelsById.do")
    public ModelAndView selectCarModelsById(Integer id) {
        //调用service，处理业务逻辑,返回处理结果
        CarModels carModels = productService.selectCarModelsById(id);
        mav.addObject("carModels", carModels);
        mav.setViewName("product/updateCarModels");
        return mav;
    }

    //添加指定车型数据
    @RequestMapping("insertCarModels.do")
    public String insertCarModels(CarModels carModels) {
        //调用service，处理业务逻辑,返回处理结果
        productService.insertCarModels(carModels);
        return "redirect:selectCarModels.do";
    }

    //删除指定车型数据
    @RequestMapping("deleteCarModelsById.do")
    public String deleteCarModelsById(Integer id) {
        //调用service，处理业务逻辑,返回处理结果
        productService.deleteCarModelsById(id);
        return "redirect:selectCarModels.do";
    }

    //修改指定车型数据
    @RequestMapping("updateCarModelsById.do")
    public String updateCarModelsById(CarModels carModels) {
        //调用service，处理业务逻辑,返回处理结果
        productService.updateCarModelsById(carModels);
        return "redirect:selectCarModels.do";
    }

    //查询所有配件管理数据
    @RequestMapping("selectAccessory.do")
    public ModelAndView selectAccessory(String cp) {
        //调用setPagination方法设置pagination
        Pagination pagination = Util.setPagination(cp, productService.selectAccessoryCount());
        //创建Map,传递参数
        Map<String, Integer> map = new HashMap<>();
        map.put("startRow", (pagination.getCurrPage() - 1) * pagination.getPageRow());
        map.put("pageRow", pagination.getPageRow());
        //调用service，处理业务逻辑,返回处理结果
        List<Accessory> list = productService.selectAccessory(map);
        mav.addObject("list", list);
        mav.addObject("pagination", pagination);
        mav.setViewName("product/accessory");
        return mav;
    }

    //查询指定配件管理数据
    @RequestMapping("selectAccessoryById.do")
    public ModelAndView selectAccessoryById(Integer id) {
        //调用service，处理业务逻辑,返回处理结果
        Accessory accessory = productService.selectAccessoryById(id);
        mav.addObject("accessory", accessory);
        mav.setViewName("product/updateAccessory");
        return mav;
    }

    //添加指定配件管理数据
    @RequestMapping("insertAccessory.do")
    public String insertAccessory(Accessory accessory) {
        //调用service，处理业务逻辑,返回处理结果
        productService.insertAccessory(accessory);
        return "redirect:selectAccessory.do";
    }

    //删除指定配件管理数据
    @RequestMapping("deleteAccessoryById.do")
    public String deleteAccessoryById(Integer id) {
        //调用service，处理业务逻辑,返回处理结果
        productService.deleteAccessoryById(id);
        return "redirect:selectAccessory.do";
    }

    //修改指定配件管理数据
    @RequestMapping("updateAccessoryById.do")
    public String updateAccessoryById(Accessory accessory) {
        //调用service，处理业务逻辑,返回处理结果
        productService.updateAccessoryById(accessory);
        return "redirect:selectAccessory.do";
    }
}
