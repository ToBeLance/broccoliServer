package com.kun.broccoli.controller;

import com.kun.broccoli.entity.Recommend;
import com.kun.broccoli.mapper.RecommendMapper;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/Recommend")
public class RecommendController {
    @Resource
    RecommendMapper recommendMapper;

    @CrossOrigin(origins = "*",maxAge = 3600)
    @GetMapping("/insertRecommend")
    void insertRecommend(String userId,String classId) {
        recommendMapper.insertRecommend(userId,classId);
    }

    @CrossOrigin(origins = "*",maxAge = 3600)
    @GetMapping("/deleteRecommend")
    void deleteRecommend(String userId,String classId) {
        recommendMapper.deleteRecommend(userId,classId);
    }

    @CrossOrigin(origins = "*",maxAge = 3600)
    @GetMapping("/getRecommendByUserId")
    List<Recommend> getRecommendByUserId(String userId) {
        return recommendMapper.getRecommendByUserId(userId);
    }
}
