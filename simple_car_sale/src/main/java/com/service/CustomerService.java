package com.service;

import com.pojo.Customer;
import com.pojo.OrderRecords;
import com.pojo.RescueRecords;
import com.utils.Pagination;

import java.util.List;
import java.util.Map;

/**
 * @author 阿毛
 * @date 2021/6/8 13:38
 */
public interface CustomerService {
    //查询所有客户管理记录数
    Long selectCustomerCount();

    //查询所有客户管理数据
    List<Customer> selectCustomer(Map<String, Integer> map);

    //查询指定客户管理数据
    Customer selectCustomerById(Integer id);

    //添加客户管理数据
    void insertCustomer(Customer customer);

    //删除指定客户管理数据
    void deleteCustomerById(Integer id);

    //修改指定客户管理数据
    void updateCustomerById(Customer customer);

    //查询所有预约记录记录数
    Long selectOrderRecordsCount();

    //查询所有预约记录数据
    List<OrderRecords> selectOrderRecords(Map<String, Integer> map);

    //查询指定预约记录数据
    OrderRecords selectOrderRecordsById(Integer id);

    //添加预约记录数据
    void insertOrderRecords(OrderRecords orderRecords);

    //删除指定预约记录数据
    void deleteOrderRecordsById(Integer id);

    //修改指定预约记录数据
    void updateOrderRecordsById(OrderRecords orderRecords);

    //查询所有救援记录记录数
    Long selectRescueRecordsCount();

    //查询所有救援记录数据
    List<RescueRecords> selectRescueRecords(Map<String, Integer> map);

    //查询指定救援记录数据
    RescueRecords selectRescueRecordsById(Integer id);

    //添加救援记录数据
    void insertRescueRecords(RescueRecords rescueRecords);

    //删除指定救援记录数据
    void deleteRescueRecordsById(Integer id);

    //修改指定救援记录数据
    void updateRescueRecordsById(RescueRecords rescueRecords);
}
