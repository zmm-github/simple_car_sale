package com.service;

import com.dao.GuideMapper;
import com.pojo.Guide;
import com.pojo.Lamp;
import com.pojo.LectureHall;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * @author 阿毛
 * @date 2021/6/8 9:01
 */
@Service
public class GuideServiceImpl implements GuideService{
    @Resource
    private GuideMapper guideMapper;

    @Override //查询所有故障灯管理记录数
    public Long selectLampCount() {
        return guideMapper.selectLampCount();
    }

    @Override //查询所有故障灯管理数据
    public List<Lamp> selectLamp(Map<String,Integer> map) {
        return guideMapper.selectLamp(map);
    }

    @Override //查询指定故障灯管理数据
    public Lamp selectLampById(Integer id) {
        return guideMapper.selectLampById(id);
    }

    @Override //添加故障灯管理数据
    public void insertLamp(Lamp lamp) {
        guideMapper.insertLamp(lamp);
    }

    @Override //删除指定故障灯管理数据
    public void deleteLampById(Integer id) {
        guideMapper.deleteLampById(id);
    }

    @Override //修改指定故障灯管理数据
    public void updateLampById(Lamp lamp) {
        guideMapper.updateLampById(lamp);
    }

    @Override //查询所有爱车讲堂记录数
    public Long selectLectureHallCount() {
        return guideMapper.selectLectureHallCount();
    }

    @Override //查询所有爱车讲堂数据
    public List<LectureHall> selectLectureHall(Map<String,Integer> map) {
        return guideMapper.selectLectureHall(map);
    }

    @Override //查询指定爱车讲堂数据
    public LectureHall selectLectureHallById(Integer id) {
        return guideMapper.selectLectureHallById(id);
    }

    @Override //添加爱车讲堂数据
    public void insertLectureHall(LectureHall lectureHall) {
        guideMapper.insertLectureHall(lectureHall);
    }

    @Override //删除指定爱车讲堂数据
    public void deleteLectureHallById(Integer id) {
        guideMapper.deleteLectureHallById(id);
    }

    @Override //修改指定爱车讲堂数据
    public void updateLectureHallById(LectureHall lectureHall) {
        guideMapper.updateLectureHallById(lectureHall);
    }

    @Override //查询所有用车指南记录数
    public Long selectGuideCount() {
        return guideMapper.selectGuideCount();
    }

    @Override //查询所有用车指南数据
    public List<Guide> selectGuide(Map<String,Integer> map) {
        return guideMapper.selectGuide(map);
    }

    @Override //查询指定用车指南数据
    public Guide selectGuideById(Integer id) {
        return guideMapper.selectGuideById(id);
    }

    @Override //添加用车指南数据
    public void insertGuide(Guide guide) {
        guideMapper.insertGuide(guide);
    }

    @Override //删除用车指南数据
    public void deleteGuideById(Integer id) {
        guideMapper.deleteGuideById(id);
    }

    @Override //修改指定用车指南数据
    public void updateGuideById(Guide guide) {
        guideMapper.updateGuideById(guide);
    }
}
