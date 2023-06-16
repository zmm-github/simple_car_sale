package com.controller;

import com.pojo.Administrator;
import com.service.AdministratorServiceImpl;
import com.utils.Pagination;
import com.utils.Util;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author 阿毛
 * @date 2021/6/16 23:35
 */
@Controller
public class AdministratorController {
    @Resource
    private AdministratorServiceImpl administratorService;
    //创建ModelAndView对象
    ModelAndView mav = new ModelAndView();

    //根据用户名和密码查询指定管理员数据
    @RequestMapping("checkAdministrator.do")
    public ModelAndView checkAdministrator(Administrator administrator, HttpSession session) throws IOException {
        mav.addObject("administrator", administrator);
        Administrator result = administratorService.selectAdministratorByUsernameAndPassword(administrator);
        if (result != null && !"".equals(result)) {
            session.setAttribute("administrator", result);
            System.out.println("登录成功");
            mav.setViewName("index");
        } else {
            System.out.println("登录失败");
            mav.setViewName("redirect:login.jsp");
        }
        return mav;
    }

    // 退出系统
    @RequestMapping("/exit.do")
    public String exit(){
        return "redirect:login.jsp";
    }

    //查询所有管理员数据
    @RequestMapping("selectAdministrator.do")
    public ModelAndView selectAdministrator(String cp) {
        //调用setPagination方法设置pagination
        Pagination pagination = Util.setPagination(cp, administratorService.selectAdministratorCount());
        //创建Map,传递参数
        Map<String, Integer> map = new HashMap<>();
        map.put("startRow", (pagination.getCurrPage() - 1) * pagination.getPageRow());
        map.put("pageRow", pagination.getPageRow());
        //调用service，处理业务逻辑,返回处理结果
        List<Administrator> list = administratorService.selectAdministrator(map);
        mav.addObject("list", list);
        mav.addObject("pagination", pagination);
        mav.setViewName("administrator/administrator");
        return mav;
    }

    //查询指定管理员
    @RequestMapping("selectAdministratorById.do")
    public ModelAndView selectAdministratorById(Integer id) {
        //调用service，处理业务逻辑,返回处理结果
        Administrator administrator = administratorService.selectAdministratorById(id);
        mav.addObject("administrator", administrator);
        mav.setViewName("administrator/updateAdministrator");
        return mav;
    }

    //添加指定管理员数据
    @RequestMapping("insertAdministrator.do")
    public String insertAdministrator(Administrator administrator) {
        //调用service，处理业务逻辑,返回处理结果
        administratorService.insertAdministrator(administrator);
        return "redirect:selectAdministrator.do";
    }

    //删除指定管理员数据
    @RequestMapping("deleteAdministratorById.do")
    public String deleteAdministratorById(Integer id) {
        //调用service，处理业务逻辑,返回处理结果
        administratorService.deleteAdministratorById(id);
        return "redirect:selectAdministrator.do";
    }

    //修改指定管理员数据
    @RequestMapping("updateAdministratorById.do")
    public String updateAdministratorById(Administrator administrator) {
        //调用service，处理业务逻辑,返回处理结果
        administratorService.updateAdministratorById(administrator);
        return "redirect:selectAdministrator.do";
    }
}
