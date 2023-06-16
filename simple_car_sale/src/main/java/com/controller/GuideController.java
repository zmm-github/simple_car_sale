package com.controller;

import com.pojo.Guide;
import com.pojo.Lamp;
import com.pojo.LectureHall;
import com.service.GuideServiceImpl;
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
 * @date 2021/6/8 9:00
 */
@Controller
public class GuideController {
    @Resource
    private GuideServiceImpl guideService;

    //创建ModelAndView对象
    ModelAndView mav = new ModelAndView();

    //查询所有故障灯管理数据
    @RequestMapping("selectLamp.do")
    public ModelAndView selectLamp(String cp) {
        //调用setPagination方法设置pagination
        Pagination pagination = Util.setPagination(cp,guideService.selectGuideCount());
        //创建Map,传递参数
        Map<String, Integer> map = new HashMap<>();
        map.put("startRow", (pagination.getCurrPage() - 1) * pagination.getPageRow());
        map.put("pageRow", pagination.getPageRow());
        //调用service，处理业务逻辑，返回处理结果
        List<Lamp> list = guideService.selectLamp(map);
        mav.addObject("list",list);
        mav.addObject("pagination",pagination);
        mav.setViewName("guide/lamp");
        return mav;
    }

    //查询指定故障灯管理数据
    @RequestMapping("selectLampById.do")
    public ModelAndView selectLampById(Integer id) {
        //调用service，处理业务逻辑,返回处理结果
        Lamp lamp = guideService.selectLampById(id);
        mav.addObject("lamp", lamp);
        mav.setViewName("guide/updateLamp");
        return mav;
    }

    //添加故障灯管理数据
    @RequestMapping("insertLamp.do")
    public String insertLamp(Lamp lamp) {
        //调用service，处理业务逻辑,返回处理结果
        guideService.insertLamp(lamp);
        return "redirect:selectLamp.do";
    }

    //删除指定故障灯管理数据
    @RequestMapping("deleteLampById.do")
    public String deleteLampById(Integer id) {
        //调用service，处理业务逻辑,返回处理结果
        guideService.deleteLampById(id);
        return "redirect:selectLamp.do";
    }

    //修改指定故障灯管理数据
    @RequestMapping("updateLampById.do")
    public String updateLampById(Lamp lamp){
        //调用service，处理业务逻辑,返回处理结果
        guideService.updateLampById(lamp);
        return "redirect:selectLamp.do";
    }

    //查询所有爱车讲堂数据
    @RequestMapping("selectLectureHall.do")
    public ModelAndView selectLectureHall(String cp) {
        //调用setPagination方法设置pagination
        Pagination pagination = Util.setPagination(cp,guideService.selectLectureHallCount());
        //创建Map,传递参数
        Map<String, Integer> map = new HashMap<>();
        map.put("startRow", (pagination.getCurrPage() - 1) * pagination.getPageRow());
        map.put("pageRow", pagination.getPageRow());
        //调用service，处理业务逻辑，返回处理结果
        List<LectureHall> list = guideService.selectLectureHall(map);
        mav.addObject("list",list);
        mav.addObject("pagination",pagination);
        mav.setViewName("guide/lectureHall");
        return mav;
    }

    //查询指定爱车讲堂数据
    @RequestMapping("selectLectureHallById.do")
    public ModelAndView selectLectureHallById(Integer id) {
        //调用service，处理业务逻辑,返回处理结果
        LectureHall lectureHall = guideService.selectLectureHallById(id);
        mav.addObject("lectureHall", lectureHall);
        mav.setViewName("guide/updateLectureHall");
        return mav;
    }

    //添加爱车讲堂数据
    @RequestMapping("insertLectureHall.do")
    public String insertLectureHall(LectureHall lectureHall) {
        //调用service，处理业务逻辑,返回处理结果
        guideService.insertLectureHall(lectureHall);
        return "redirect:selectLectureHall.do";
    }

    //删除指定爱车讲堂数据
    @RequestMapping("deleteLectureHallById.do")
    public String deleteLectureHallById(Integer id) {
        //调用service，处理业务逻辑,返回处理结果
        guideService.deleteLectureHallById(id);
        return "redirect:selectLectureHall.do";
    }

    //修改指定爱车讲堂数据
    @RequestMapping("updateLectureHallById.do")
    public String updateLectureHallById(LectureHall lectureHall){
        //调用service，处理业务逻辑,返回处理结果
        guideService.updateLectureHallById(lectureHall);
        return "redirect:selectLectureHall.do";
    }

    //查询所有用车指南数据
    @RequestMapping("selectGuide.do")
    public ModelAndView selectGuide(String cp) {
        //调用setPagination方法设置pagination
        Pagination pagination = Util.setPagination(cp,guideService.selectGuideCount());
        //创建Map,传递参数
        Map<String, Integer> map = new HashMap<>();
        map.put("startRow", (pagination.getCurrPage() - 1) * pagination.getPageRow());
        map.put("pageRow", pagination.getPageRow());
        //调用service，处理业务逻辑，返回处理结果
        List<Guide> list = guideService.selectGuide(map);
        mav.addObject("list",list);
        mav.addObject("pagination",pagination);
        mav.setViewName("guide/guide");
        return mav;
    }

    //查询指定用车指南数据
    @RequestMapping("selectGuideById.do")
    public ModelAndView selectGuideById(Integer id) {
        //调用service，处理业务逻辑,返回处理结果
        Guide guide = guideService.selectGuideById(id);
        mav.addObject("guide", guide);
        mav.setViewName("guide/updateGuide");
        return mav;
    }

    //添加用车指南数据
    @RequestMapping("insertGuide.do")
    public String insertGuide(Guide guide) {
        //调用service，处理业务逻辑,返回处理结果
        guideService.insertGuide(guide);
        return "redirect:selectGuide.do";
    }

    //删除指定用车指南数据
    @RequestMapping("deleteGuideById.do")
    public String deleteGuideById(Integer id) {
        //调用service，处理业务逻辑,返回处理结果
        guideService.deleteGuideById(id);
        return "redirect:selectGuide.do";
    }

    //修改指定用车指南数据
    @RequestMapping("updateGuideById.do")
    public String updateGuideById(Guide guide){
        //调用service，处理业务逻辑,返回处理结果
        guideService.updateGuideById(guide);
        return "redirect:selectGuide.do";
    }
}
