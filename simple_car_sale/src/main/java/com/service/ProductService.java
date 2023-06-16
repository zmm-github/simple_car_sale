package com.service;

import com.pojo.Accessory;
import com.pojo.CarModels;
import com.pojo.CarSeries;

import java.util.List;
import java.util.Map;

/**
 * @author 阿毛
 * @date 2021/6/1 22:37
 */
public interface ProductService {
    //查询所有车系记录数
    Long selectCarSeriesCount();

    //查询所有车系数据
    List<CarSeries> selectCarSeries(Map<String, Integer> map);

    //查询指定车系数据
    CarSeries selectCarSeriesById(Integer id);

    //模糊查询车系数据
    List<CarSeries> selectCarSeriesByLike(Map<String, Object> map);

    //添加车系数据
    void insertCarSeries(CarSeries carSeries);

    //删除指定车系数据
    void deleteCarSeriesById(Integer id);

    //修改指定车系数据
    void updateCarSeriesById(CarSeries carSeries);

    //查询所有车型记录数
    Long selectCarModelsCount();

    //查询所有车型数据
    List<CarModels> selectCarModels(Map<String, Integer> map);

    //查询指定车型数据
    CarModels selectCarModelsById(Integer id);

    //模糊查询车型数据
    List<CarModels> selectCarModelsByLike(Map<String, Object> map);

    //添加车型数据
    void insertCarModels(CarModels carModels);

    //删除指定车型数据
    void deleteCarModelsById(Integer id);

    //修改指定车型数据
    void updateCarModelsById(CarModels carModels);

    //查询所有配件记录数
    Long selectAccessoryCount();

    //查询所有配件数据
    List<Accessory> selectAccessory(Map<String, Integer> map);

    //查询指定配件管理数据
    Accessory selectAccessoryById(Integer id);

    //模糊查询配件管理数据
    List<Accessory> selectAccessoryByLike(Map<String, Object> map);

    //添加配件管理数据
    void insertAccessory(Accessory accessory);

    //删除指定配件管理数据
    void deleteAccessoryById(Integer id);

    //修改指定配件管理数据
    void updateAccessoryById(Accessory accessory);
}
