package com.kun.broccoli.entity;

import lombok.Data;

@Data
//注解Data：这是lombok的一个功能，代表了可以自动帮你生成下面的一大堆的方法。也可以手动写，我这里感觉不知道是不是引入的有问题没有生效，我又手动写了一遍，完整的就是下面的这样。
// 如果引入成功生效，就不需要写下面一大堆的方法，直接一个注解搞定。
public class User {
    private int id;
    private String name;
    private String password;

    public User() {
    }

    public User(int id, String name, String password) {
        this.id = id;
        this.name = name;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
