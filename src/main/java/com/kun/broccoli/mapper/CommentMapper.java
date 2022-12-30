package com.kun.broccoli.mapper;

import com.kun.broccoli.entity.Comment;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface CommentMapper {

    @Select("select * from comment where recipeId = #{recipeId} order by commemtId desc")
    List<Comment> getCommentByRecipeId(String recipeId);

    @Insert("insert into comment (recipeId,userName,time,content) value (#{recipeId},#{userName},#{time},#{content})")
    void insertComment(String recipeId,String userName,String time,String content);

}
