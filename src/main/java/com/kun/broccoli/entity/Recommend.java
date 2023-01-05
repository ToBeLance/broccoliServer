package com.kun.broccoli.entity;

import lombok.Data;

@Data
public class Recommend {
    private int userId;
    private int classId;

    public Recommend() {
    }

    public Recommend(int userId, int classId) {
        this.userId = userId;
        this.classId = classId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getClassId() {
        return classId;
    }

    public void setClassId(int classId) {
        this.classId = classId;
    }
}
