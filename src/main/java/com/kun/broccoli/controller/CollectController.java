package com.kun.broccoli.controller;

import com.kun.broccoli.entity.Collect;
import com.kun.broccoli.mapper.CollectMapper;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/Collect")
public class CollectController {
    @Resource
    CollectMapper collectMapper;

    @CrossOrigin(origins = "*",maxAge = 3600)
    @GetMapping("/insertCollect")
    public void insertCollect(String userId,String recipeId) {
        collectMapper.insertCollect(userId,recipeId);
    }

    @CrossOrigin(origins = "*",maxAge = 3600)
    @GetMapping("getCollectByUserId")
    public List<Collect> getCollectByUserId(String userId) {
        return collectMapper.getCollectByUserId(userId);
    }

    @CrossOrigin(origins = "*",maxAge = 3600)
    @GetMapping("getCollectByUserIdAndRecipeId")
    public List<Collect> getCollectByUserIdAndRecipeId(String userId,String recipeId) {
        return collectMapper.getCollectByUserIdAndRecipeId(userId,recipeId);
    }

    @CrossOrigin(origins = "*",maxAge = 3600)
    @GetMapping("deleteCollectByUserIdAndRecipeId")
    public void deleteCollectByUserIdAndRecipeId(String userId,String recipeId) {
        collectMapper.deleteCollectByUserIdAndRecipeId(userId,recipeId);
    }
}
