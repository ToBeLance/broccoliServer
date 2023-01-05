package com.kun.broccoli.mapper;

import com.kun.broccoli.entity.Collect;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface CollectMapper {

    @Insert("insert into collect value (#{userId},#{recipeId})")
    void insertCollect(String userId,String recipeId);

    @Select("select * from collect where userId = #{userId}")
    List<Collect> getCollectByUserId(String userId);

    @Select("select * from collect where userId = #{userId} and recipeId = #{recipeId}")
    List<Collect> getCollectByUserIdAndRecipeId(String userId,String recipeId);

    @Delete("delete from collect where userId = #{userId} and recipeId = #{recipeId}")
    void deleteCollectByUserIdAndRecipeId(String userId ,String recipeId);
}
