package com.kun.broccoli.controller;

import com.kun.broccoli.entity.Score;
import com.kun.broccoli.mapper.ScoreMapper;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/Score")
public class ScoreController {
    @Resource
    ScoreMapper scoreMapper;

    @CrossOrigin(origins ="*",maxAge = 3600)
    @GetMapping("/getScoreByRecipeId")
    public List<Score> getRecipeScoreByRecipeId(String recipeId){
        return scoreMapper.getRecipeScoreByRecipeId(recipeId);
    }

    @CrossOrigin(origins = "*",maxAge = 3600)
    @GetMapping("/getRecipeScoreByRecipeIdAndUserId")
    public List<Score> getRecipeScoreByRecipeIdAndUserId(String recipeId,String userId) {
        return scoreMapper.getRecipeScoreByRecipeIdAndUserId(recipeId,userId);
    }

    @CrossOrigin(origins = "*",maxAge = 3600)
    @GetMapping("/insertRecipeScore")
    public void insertRecipeScore(String recipeId,String userId,String score) {
        scoreMapper.insertRecipeScore(recipeId,userId,score);
    }

    @CrossOrigin(origins = "*",maxAge = 3600)
    @GetMapping("/updateRecipeScore")
    public void updateRecipeScore(String recipeId,String userId,String score) {
        scoreMapper.updateRecipeScore(recipeId,userId,score);
    }
}
