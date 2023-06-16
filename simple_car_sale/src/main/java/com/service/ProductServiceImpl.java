package com.service;

import com.dao.ProductMapper;
import com.pojo.Accessory;
import com.pojo.CarModels;
import com.pojo.CarSeries;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * @author 阿毛
 * @date 2021/6/1 22:38
 */
@Service
public class ProductServiceImpl implements ProductService {
    @Resource
    private ProductMapper productMapper;

    @Override //查询所有车系记录数
    public Long selectCarSeriesCount() {
        return productMapper.selectCarSeriesCount();
    }

    @Override //查询所有车系数据
    public List<CarSeries> selectCarSeries(Map<String, Integer> map) {
        return productMapper.selectCarSeries(map);
    }

    @Override //查询指定车系数据
    public CarSeries selectCarSeriesById(Integer id) {
        return productMapper.selectCarSeriesById(id);
    }

    @Override //模糊查询车系数据
    public List<CarSeries> selectCarSeriesByLike(Map<String, Object> map) {
        return productMapper.selectCarSeriesByLike(map);
    }

    @Override //添加车系数据
    public void insertCarSeries(CarSeries carSeries) {
        productMapper.insertCarSeries(carSeries);
    }

    @Override //删除指定车系数据
    public void deleteCarSeriesById(Integer id) {
        productMapper.deleteCarSeriesById(id);
    }

    @Override //修改指定车系数据
    public void updateCarSeriesById(CarSeries carSeries) {
        productMapper.updateCarSeriesById(carSeries);
    }

    @Override //查询所有车型记录数
    public Long selectCarModelsCount() {
        return productMapper.selectCarModelsCount();
    }

    @Override //查询所有车型数据
    public List<CarModels> selectCarModels(Map<String, Integer> map) {
        return productMapper.selectCarModels(map);
    }

    @Override //查询指定车型数据
    public CarModels selectCarModelsById(Integer id) {
        return productMapper.selectCarModelsById(id);
    }

    @Override //模糊查询车型数据
    public List<CarModels> selectCarModelsByLike(Map<String, Object> map) {
        return productMapper.selectCarModelsByLike(map);
    }

    @Override //添加车型数据
    public void insertCarModels(CarModels carModels) {
        productMapper.insertCarModels(carModels);
    }

    @Override //删除车型数据
    public void deleteCarModelsById(Integer id) {
        productMapper.deleteCarModelsById(id);
    }

    @Override //修改指定车型数据
    public void updateCarModelsById(CarModels carModels) {
        productMapper.updateCarModelsById(carModels);
    }

    @Override //查询所有配件管理记录数
    public Long selectAccessoryCount() {
        return productMapper.selectAccessoryCount();
    }

    @Override //查询所有配件管理数据
    public List<Accessory> selectAccessory(Map<String, Integer> map) {
        return productMapper.selectAccessory(map);
    }

    @Override //查询指定配件管理数据
    public Accessory selectAccessoryById(Integer id) {
        return productMapper.selectAccessoryById(id);
    }

    @Override //模糊查询配件管理数据
    public List<Accessory> selectAccessoryByLike(Map<String, Object> map) {
        return productMapper.selectAccessoryByLike(map);
    }

    @Override //添加配件管理数据
    public void insertAccessory(Accessory accessory) {
        productMapper.insertAccessory(accessory);
    }

    @Override //删除指定配件管理数据
    public void deleteAccessoryById(Integer id) {
        productMapper.deleteAccessoryById(id);
    }

    @Override //修改指定配件管理数据
    public void updateAccessoryById(Accessory accessory) {
        productMapper.updateAccessoryById(accessory);
    }
}
