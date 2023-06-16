package com.dao;

import com.pojo.Administrator;

import java.util.List;
import java.util.Map;

/**
 * @author 阿毛
 * @date 2021/6/16 19:25
 */
public interface AdministratorMapper {
    //根据用户名和密码查询指定管理员数据
    Administrator selectAdministratorByUsernameAndPassword(Administrator administrator);
    //查询所有管理员数据
    List<Administrator> selectAdministrator(Map<String,Integer> map);
    //添加管理员数据
    void insertAdministrator(Administrator administrator);
    //修改指定管理员数据
    void updateAdministratorById(Administrator administrator);
    //删除指定管理员数据
    void deleteAdministratorById(Integer id);
    //根据ID查询指定管理员数据
    Administrator selectAdministratorById(Integer id);
    //查询所有管理员记录数
    Long selectAdministratorCount();
}
