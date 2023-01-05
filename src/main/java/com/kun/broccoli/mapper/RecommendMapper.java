package com.kun.broccoli.mapper;

import com.kun.broccoli.entity.Recommend;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface RecommendMapper {
    @Insert("insert into recommend value (#{userId},#{classId})")
    void insertRecommend (String userId,String classId);

    @Delete("delete from recommend where userId = #{userId} and classId = #{classId}")
    void deleteRecommend (String userId,String classId);

    @Select("select * from recommend where userId = #{userId}")
    List<Recommend> getRecommendByUserId(String userId);
}
