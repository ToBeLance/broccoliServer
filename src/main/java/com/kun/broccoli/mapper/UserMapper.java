package com.kun.broccoli.mapper;

import com.kun.broccoli.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;

import java.util.List;

//这里可以理解为后端对数据库的接口，跟前端没啥关系，就是后端用来链接查询数据库的
public interface UserMapper {
    //注解：查询数据库的语句，这句话代表查询数据库内名字叫history_record的表
    @Select("select * from user")
    //List是数组对象User是实体类。
    //UserAll():这个方法代表查询后的数据，不用纠结没有return之类的，反正后端格式是这样的
    //前端理解这句话：注解帮我们查询了数据库对应的数据并返回了数据。我们再下面设定接收的方法名叫HistoryRecordAll，返回的数据类型是数据对象List格式的，并且对应的字段格式是按照<HistoryRecord>内的变量来的。
    List<User> UserAll();

    @Select("select * from user where name = #{name}")
    List<User> User(String name);

    @Insert("insert into user (name,password) value (#{name},#{password})")
    void InsertUser(String name,String password);

}
