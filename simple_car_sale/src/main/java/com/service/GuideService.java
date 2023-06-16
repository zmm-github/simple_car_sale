package com.service;

import com.pojo.Guide;
import com.pojo.Lamp;
import com.pojo.LectureHall;

import java.util.List;
import java.util.Map;

/**
 * @author 阿毛
 * @date 2021/6/8 9:01
 */
public interface GuideService {
    //查询所有故障灯管理记录数
    Long selectLampCount();

    //查询所有故障灯管理数据
    List<Lamp> selectLamp(Map<String,Integer> map);

    //查询指定故障灯管理数据
    Lamp selectLampById(Integer id);

    //添加故障灯管理数据
    void insertLamp(Lamp lamp);

    //删除指定故障灯管理数据
    void deleteLampById(Integer id);

    //修改指定故障灯管理数据
    void updateLampById(Lamp lamp);

    //查询所有爱车讲堂记录数
    Long selectLectureHallCount();

    //查询所有爱车讲堂数据
    List<LectureHall> selectLectureHall(Map<String,Integer> map);

    //查询指定爱车讲堂数据
    LectureHall selectLectureHallById(Integer id);

    //添加爱车讲堂数据
    void insertLectureHall(LectureHall lectureHall);

    //删除指定爱车讲堂数据
    void deleteLectureHallById(Integer id);

    //修改指定爱车讲堂数据
    void updateLectureHallById(LectureHall lectureHall);

    //查询所有用车指南记录数
    Long selectGuideCount();

    //查询所有用车指南数据
    List<Guide> selectGuide(Map<String,Integer> map);

    //查询指定用车指南数据
    Guide selectGuideById(Integer id);

    //添加用车指南数据
    void insertGuide(Guide guide);

    //删除指定用车指南数据
    void deleteGuideById(Integer id);

    //修改指定用车指南数据
    void updateGuideById(Guide guide);
}
