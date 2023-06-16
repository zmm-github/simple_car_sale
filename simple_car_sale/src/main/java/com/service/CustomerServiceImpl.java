package com.service;

import com.dao.CustomerMapper;
import com.pojo.Customer;
import com.pojo.OrderRecords;
import com.pojo.RescueRecords;
import com.utils.Pagination;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * @author 阿毛
 * @date 2021/6/8 13:51
 */
@Service
public class CustomerServiceImpl implements CustomerService {

    @Resource
    private CustomerMapper customerMapper;

    @Override //查询所有客户管理记录数
    public Long selectCustomerCount() {
        return customerMapper.selectCustomerCount();
    }

    @Override //查询所有客户管理数据
    public List<Customer> selectCustomer(Map<String , Integer> map) {
        return customerMapper.selectCustomer(map);
    }

    @Override //查询指定客户管理数据
    public Customer selectCustomerById(Integer id) {
        return customerMapper.selectCustomerById(id);
    }

    @Override //添加客户管理数据
    public void insertCustomer(Customer customer) {
        customerMapper.insertCustomer(customer);
    }

    @Override //删除客户管理数据
    public void deleteCustomerById(Integer id) {
        customerMapper.deleteCustomerById(id);
    }

    @Override //修改指定客户管理数据
    public void updateCustomerById(Customer customer) {
        customerMapper.updateCustomerById(customer);
    }

    @Override //查询所有预约记录记录数
    public Long selectOrderRecordsCount() {return customerMapper.selectOrderRecordsCount();}

    @Override //查询所有预约记录数据
    public List<OrderRecords> selectOrderRecords(Map<String, Integer> map) {
        return customerMapper.selectOrderRecords(map);
    }

    @Override //查询指定预约记录数据
    public OrderRecords selectOrderRecordsById(Integer id) {
        return customerMapper.selectOrderRecordsById(id);
    }

    @Override //添加预约记录数据
    public void insertOrderRecords(OrderRecords orderRecords) {
        customerMapper.insertOrderRecords(orderRecords);
    }

    @Override //删除指定预约记录数据
    public void deleteOrderRecordsById(Integer id) {
        customerMapper.deleteOrderRecordsById(id);
    }

    @Override //修改指定预约记录数据
    public void updateOrderRecordsById(OrderRecords orderRecords) {
        customerMapper.updateOrderRecordsById(orderRecords);
    }

    @Override //查询所有援救记录记录数
    public Long selectRescueRecordsCount() {return customerMapper.selectRescueRecordsCount();}

    @Override //查询所有援救记录数据
    public List<RescueRecords> selectRescueRecords(Map<String, Integer> map) {
        return customerMapper.selectRescueRecords(map);
    }

    @Override //查询指定援救记录数据
    public RescueRecords selectRescueRecordsById(Integer id) {
        return customerMapper.selectRescueRecordsById(id);
    }

    @Override //添加援救记录数据
    public void insertRescueRecords(RescueRecords rescueRecords) {
        customerMapper.insertRescueRecords(rescueRecords);
    }

    @Override //删除指定援救记录数据
    public void deleteRescueRecordsById(Integer id) {
        customerMapper.deleteRescueRecordsById(id);
    }

    @Override //修改指定援救记录数据
    public void updateRescueRecordsById(RescueRecords rescueRecords) {
        customerMapper.updateRescueRecordsById(rescueRecords);
    }
}
