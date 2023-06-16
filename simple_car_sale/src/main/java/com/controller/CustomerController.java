package com.controller;

import com.pojo.Customer;
import com.pojo.OrderRecords;
import com.pojo.RescueRecords;
import com.service.CustomerServiceImpl;
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
 * @date 2021/6/8 13:32
 */
@Controller
public class CustomerController {
    @Resource
    private CustomerServiceImpl customerService;
    //创建ModelAndView对象
    ModelAndView mav = new ModelAndView();

    //查询所有客户管理数据
    @RequestMapping("selectCustomer.do")
    public ModelAndView selectCustomer(String cp) {
        //调用setPagination方法设置pagination
        Pagination pagination = Util.setPagination(cp,customerService.selectCustomerCount());
        //创建Map,传递参数
        Map<String, Integer> map = new HashMap<>();
        map.put("startRow", (pagination.getCurrPage() - 1) * pagination.getPageRow());
        map.put("pageRow", pagination.getPageRow());
        //调用service，处理业务逻辑，返回处理结果
        List<Customer> list = customerService.selectCustomer(map);
        mav.addObject("list", list);
        mav.addObject("pagination", pagination);
        mav.setViewName("customer/customer");
        return mav;
    }

    //查询指定客户管理数据
    @RequestMapping("selectCustomerById.do")
    public ModelAndView selectCustomerById(Integer id) {
        //调用service，处理业务逻辑,返回处理结果
        Customer customer = customerService.selectCustomerById(id);
        mav.addObject("customer", customer);
        mav.setViewName("customer/updateCustomer");
        return mav;
    }

    //添加客户管理数据
    @RequestMapping("insertCustomer.do")
    public String insertCustomer(Customer customer) {
        //调用service，处理业务逻辑,返回处理结果
        customerService.insertCustomer(customer);
        return "redirect:selectCustomer.do";
    }

    //删除指定客户管理数据
    @RequestMapping("deleteCustomerById.do")
    public String deleteCustomerById(Integer id) {
        //调用service，处理业务逻辑,返回处理结果
        customerService.deleteCustomerById(id);
        return "redirect:selectCustomer.do";
    }

    //修改指定客户管理数据
    @RequestMapping("updateCustomerById.do")
    public String updateCustomerById(Customer customer) {
        //调用service，处理业务逻辑,返回处理结果
        customerService.updateCustomerById(customer);
        return "redirect:selectCustomer.do";
    }

    //查询所有预约记录数据
    @RequestMapping("selectOrderRecords.do")
    public ModelAndView selectOrderRecords(String cp) {
        //调用setPagination方法设置pagination
        Pagination pagination = Util.setPagination(cp,customerService.selectOrderRecordsCount());
        //创建Map,传递参数
        Map<String, Integer> map = new HashMap<>();
        map.put("startRow", (pagination.getCurrPage() - 1) * pagination.getPageRow());
        map.put("pageRow", pagination.getPageRow());
        //调用service，处理业务逻辑，返回处理结果
        List<OrderRecords> list = customerService.selectOrderRecords(map);
        mav.addObject("list", list);
        mav.addObject("pagination", pagination);
        mav.setViewName("customer/order_records");
        return mav;
    }

    //查询指定预约记录数据
    @RequestMapping("selectOrderRecordsById.do")
    public ModelAndView selectOrderRecordsById(Integer id) {
        //调用service，处理业务逻辑,返回处理结果
        OrderRecords orderRecords = customerService.selectOrderRecordsById(id);
        mav.addObject("orderRecords", orderRecords);
        mav.setViewName("customer/updateOrderRecords");
        return mav;
    }

    //添加预约记录数据
    @RequestMapping("insertOrderRecords.do")
    public String insertOrderRecords(OrderRecords orderRecords) {
        //调用service，处理业务逻辑,返回处理结果
        customerService.insertOrderRecords(orderRecords);
        return "redirect:selectOrderRecords.do";
    }

    //删除指定预约记录数据
    @RequestMapping("deleteOrderRecordsById.do")
    public String deleteOrderRecordsById(Integer id) {
        //调用service，处理业务逻辑,返回处理结果
        customerService.deleteOrderRecordsById(id);
        return "redirect:selectOrderRecords.do";
    }

    //修改指定预约记录数据
    @RequestMapping("updateOrderRecordsById.do")
    public String updateOrderRecordsById(OrderRecords orderRecords) {
        //调用service，处理业务逻辑,返回处理结果
        customerService.updateOrderRecordsById(orderRecords);
        return "redirect:selectOrderRecords.do";
    }

    //查询所有救援记录数据
    @RequestMapping("selectRescueRecords.do")
    public ModelAndView selectRescueRecords(String cp) {
        System.out.println(cp);
        //调用setPagination方法设置pagination
        Pagination pagination = Util.setPagination(cp,customerService.selectRescueRecordsCount());
        //创建Map,传递参数
        Map<String, Integer> map = new HashMap<>();
        map.put("startRow", (pagination.getCurrPage() - 1) * pagination.getPageRow());
        map.put("pageRow", pagination.getPageRow());
        //调用service，处理业务逻辑，返回处理结果
        List<RescueRecords> list = customerService.selectRescueRecords(map);
        mav.addObject("list", list);
        mav.addObject("pagination",pagination);
        mav.setViewName("customer/rescue_records");
        return mav;
    }

    //查询指定救援记录数据
    @RequestMapping("selectRescueRecordsById.do")
    public ModelAndView selectRescueRecordsById(Integer id) {
        //调用service，处理业务逻辑,返回处理结果
        RescueRecords rescueRecords = customerService.selectRescueRecordsById(id);
        mav.addObject("rescueRecords", rescueRecords);
        mav.setViewName("customer/updateRescueRecords");
        return mav;
    }

    //添加救援记录数据
    @RequestMapping("insertRescueRecords.do")
    public String insertRescueRecords(RescueRecords rescueRecords) {
        //调用service，处理业务逻辑,返回处理结果
        customerService.insertRescueRecords(rescueRecords);
        return "redirect:selectRescueRecords.do";
    }

    //删除指定救援记录数据
    @RequestMapping("deleteRescueRecordsById.do")
    public String deleteRescueRecordsById(Integer id) {
        //调用service，处理业务逻辑,返回处理结果
        customerService.deleteRescueRecordsById(id);
        return "redirect:selectRescueRecords.do";
    }

    //修改指定救援记录数据
    @RequestMapping("updateRescueRecordsById.do")
    public String updateRescueRecordsById(RescueRecords rescueRecords) {
        //调用service，处理业务逻辑,返回处理结果
        customerService.updateRescueRecordsById(rescueRecords);
        return "redirect:selectRescueRecords.do";
    }
}
