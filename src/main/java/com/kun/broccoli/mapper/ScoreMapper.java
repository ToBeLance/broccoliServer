package com.kun.broccoli.mapper;

import com.kun.broccoli.entity.Score;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface ScoreMapper {

    @Select("select * from score where recipeId = #{recipeId}")
    List<Score> getRecipeScoreByRecipeId(String recipeId);

    @Select("select * from score where recipeId = #{recipeId} and userId = #{userId}")
    List<Score> getRecipeScoreByRecipeIdAndUserId(String recipeId,String userId);

    @Insert("insert into score value (#{recipeId},#{userId},#{score})")
    void insertRecipeScore(String recipeId,String userId,String score);

    @Select("update score set score = #{score} where recipeId = #{recipeId} and userId = #{userId}")
    void updateRecipeScore(String recipeId,String userId,String score);
}
