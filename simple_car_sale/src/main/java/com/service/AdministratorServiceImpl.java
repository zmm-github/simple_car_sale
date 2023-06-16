package com.service;

import com.dao.AdministratorMapper;
import com.pojo.Administrator;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * @author 阿毛
 * @date 2021/6/1 13:28
 */
@Service
public class AdministratorServiceImpl implements AdministratorService {
    @Resource
    private AdministratorMapper administratorMapper;

    @Override //根据用户名和密码查询指定管理员数据
    public Administrator selectAdministratorByUsernameAndPassword(Administrator administrator) {
        return administratorMapper.selectAdministratorByUsernameAndPassword(administrator);
    }

    @Override //查询所有管理员数据
    public List<Administrator> selectAdministrator(Map<String,Integer> map) {
        return administratorMapper.selectAdministrator(map);
    }

    @Override //添加管理员数据
    public void insertAdministrator(Administrator administrator) {
        administratorMapper.insertAdministrator(administrator);
    }

    @Override //修改指定管理员数据
    public void updateAdministratorById(Administrator administrator) {
        administratorMapper.updateAdministratorById(administrator);
    }

    @Override //删除指定管理员数据
    public void deleteAdministratorById(Integer id) {
        administratorMapper.deleteAdministratorById(id);
    }

    @Override //根据id查询指定管理员数据
    public Administrator selectAdministratorById(Integer id) {
        return administratorMapper.selectAdministratorById(id);
    }

    @Override
    public Long selectAdministratorCount() {
        return administratorMapper.selectAdministratorCount();
    }


}
